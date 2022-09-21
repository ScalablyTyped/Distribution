package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the AdvancedPhotoCapture::OptionalReferencePhotoCaptured event. */
trait OptionalReferencePhotoCapturedEventArgs extends StObject {
  
  /** Gets the app-defined context object associated with the advanced photo capture operation, if one was provided in the call to AdvancedPhotoCapture::CaptureAsync(Object) . */
  var context: Any
  
  /** Gets the captured frame containing the reference photo from the advanced photo capture. */
  var frame: CapturedFrame
}
object OptionalReferencePhotoCapturedEventArgs {
  
  inline def apply(context: Any, frame: CapturedFrame): OptionalReferencePhotoCapturedEventArgs = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalReferencePhotoCapturedEventArgs]
  }
  
  extension [Self <: OptionalReferencePhotoCapturedEventArgs](x: Self) {
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: CapturedFrame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
  }
}
