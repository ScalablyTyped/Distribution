package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the FaceDetected event. */
trait FaceDetectedEventArgs extends StObject {
  
  /** Gets the FaceDetectionEffectFrame associated with a FaceDetected event. */
  var resultFrame: FaceDetectionEffectFrame
}
object FaceDetectedEventArgs {
  
  inline def apply(resultFrame: FaceDetectionEffectFrame): FaceDetectedEventArgs = {
    val __obj = js.Dynamic.literal(resultFrame = resultFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceDetectedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FaceDetectedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setResultFrame(value: FaceDetectionEffectFrame): Self = StObject.set(x, "resultFrame", value.asInstanceOf[js.Any])
  }
}
