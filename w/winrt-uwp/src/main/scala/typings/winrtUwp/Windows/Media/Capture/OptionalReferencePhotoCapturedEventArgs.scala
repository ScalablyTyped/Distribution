package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the AdvancedPhotoCapture::OptionalReferencePhotoCaptured event. */
@js.native
trait OptionalReferencePhotoCapturedEventArgs extends StObject {
  
  /** Gets the app-defined context object associated with the advanced photo capture operation, if one was provided in the call to AdvancedPhotoCapture::CaptureAsync(Object) . */
  var context: js.Any = js.native
  
  /** Gets the captured frame containing the reference photo from the advanced photo capture. */
  var frame: CapturedFrame = js.native
}
object OptionalReferencePhotoCapturedEventArgs {
  
  @scala.inline
  def apply(context: js.Any, frame: CapturedFrame): OptionalReferencePhotoCapturedEventArgs = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalReferencePhotoCapturedEventArgs]
  }
  
  @scala.inline
  implicit class OptionalReferencePhotoCapturedEventArgsMutableBuilder[Self <: OptionalReferencePhotoCapturedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: CapturedFrame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
  }
}
