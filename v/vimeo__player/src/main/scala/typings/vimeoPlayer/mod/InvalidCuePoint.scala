package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidCuePoint
  extends StObject
     with Error {
  
  @JSName("name")
  var name_InvalidCuePoint: typings.vimeoPlayer.vimeoPlayerStrings.InvalidCuePoint
}
object InvalidCuePoint {
  
  @scala.inline
  def apply(message: String, method: String): InvalidCuePoint = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = "InvalidCuePoint")
    __obj.asInstanceOf[InvalidCuePoint]
  }
  
  @scala.inline
  implicit class InvalidCuePointMutableBuilder[Self <: InvalidCuePoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: typings.vimeoPlayer.vimeoPlayerStrings.InvalidCuePoint): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
