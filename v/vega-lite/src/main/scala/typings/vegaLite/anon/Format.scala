package typings.vegaLite.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  var format: String | (Record[String, js.Any])
  
  var formatType: String
}
object Format {
  
  inline def apply(format: String | (Record[String, js.Any]), formatType: String): Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], formatType = formatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  
  extension [Self <: Format](x: Self) {
    
    inline def setFormat(value: String | (Record[String, js.Any])): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatType(value: String): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
  }
}
