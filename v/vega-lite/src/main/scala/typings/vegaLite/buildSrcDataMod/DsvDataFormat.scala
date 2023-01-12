package typings.vegaLite.buildSrcDataMod

import typings.vegaLite.vegaLiteStrings.dsv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DsvDataFormat
  extends StObject
     with DataFormatBase
     with DataFormat {
  
  /**
    * The delimiter between records. The delimiter must be a single character (i.e., a single 16-bit code unit); so, ASCII delimiters are fine, but emoji delimiters are not.
    *
    * @minLength 1
    * @maxLength 1
    */
  var delimiter: String
  
  @JSName("type")
  var type_DsvDataFormat: js.UndefOr[dsv] = js.undefined
}
object DsvDataFormat {
  
  inline def apply(delimiter: String): DsvDataFormat = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DsvDataFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DsvDataFormat] (val x: Self) extends AnyVal {
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setType(value: dsv): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
