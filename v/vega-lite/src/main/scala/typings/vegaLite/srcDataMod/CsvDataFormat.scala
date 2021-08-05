package typings.vegaLite.srcDataMod

import typings.vegaLite.vegaLiteStrings.csv
import typings.vegaLite.vegaLiteStrings.tsv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CsvDataFormat
  extends StObject
     with DataFormatBase
     with DataFormat {
  
  @JSName("type")
  var type_CsvDataFormat: js.UndefOr[csv | tsv] = js.undefined
}
object CsvDataFormat {
  
  inline def apply(): CsvDataFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsvDataFormat]
  }
  
  extension [Self <: CsvDataFormat](x: Self) {
    
    inline def setType(value: csv | tsv): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
