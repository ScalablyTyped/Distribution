package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordResponse extends StObject {
  
  var tempThumbPath: String = js.native
  
  var tempVideoPath: String = js.native
}
object RecordResponse {
  
  @scala.inline
  def apply(tempThumbPath: String, tempVideoPath: String): RecordResponse = {
    val __obj = js.Dynamic.literal(tempThumbPath = tempThumbPath.asInstanceOf[js.Any], tempVideoPath = tempVideoPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordResponse]
  }
  
  @scala.inline
  implicit class RecordResponseMutableBuilder[Self <: RecordResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTempThumbPath(value: String): Self = StObject.set(x, "tempThumbPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempVideoPath(value: String): Self = StObject.set(x, "tempVideoPath", value.asInstanceOf[js.Any])
  }
}
