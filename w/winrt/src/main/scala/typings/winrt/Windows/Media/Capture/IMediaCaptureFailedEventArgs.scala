package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMediaCaptureFailedEventArgs extends StObject {
  
  var code: Double = js.native
  
  var message: String = js.native
}
object IMediaCaptureFailedEventArgs {
  
  @scala.inline
  def apply(code: Double, message: String): IMediaCaptureFailedEventArgs = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaCaptureFailedEventArgs]
  }
  
  @scala.inline
  implicit class IMediaCaptureFailedEventArgsMutableBuilder[Self <: IMediaCaptureFailedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
