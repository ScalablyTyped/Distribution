package typings.vegaLite.srcDataMod

import typings.vegaLite.vegaLiteStrings.csv
import typings.vegaLite.vegaLiteStrings.tsv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CsvDataFormat
  extends DataFormatBase
     with DataFormat {
  
  @JSName("type")
  var type_CsvDataFormat: js.UndefOr[csv | tsv] = js.native
}
object CsvDataFormat {
  
  @scala.inline
  def apply(): CsvDataFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsvDataFormat]
  }
  
  @scala.inline
  implicit class CsvDataFormatMutableBuilder[Self <: CsvDataFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: csv | tsv): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
