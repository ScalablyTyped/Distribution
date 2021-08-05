package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordResponse extends StObject {
  
  var tempThumbPath: String
  
  var tempVideoPath: String
}
object RecordResponse {
  
  inline def apply(tempThumbPath: String, tempVideoPath: String): RecordResponse = {
    val __obj = js.Dynamic.literal(tempThumbPath = tempThumbPath.asInstanceOf[js.Any], tempVideoPath = tempVideoPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordResponse]
  }
  
  extension [Self <: RecordResponse](x: Self) {
    
    inline def setTempThumbPath(value: String): Self = StObject.set(x, "tempThumbPath", value.asInstanceOf[js.Any])
    
    inline def setTempVideoPath(value: String): Self = StObject.set(x, "tempVideoPath", value.asInstanceOf[js.Any])
  }
}
