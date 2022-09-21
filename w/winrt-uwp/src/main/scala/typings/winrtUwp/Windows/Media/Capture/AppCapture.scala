package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppCapture extends StObject {
  
  /* unmapped type */
  var addEventListener: Any
  
  /* unmapped type */
  var isCapturingAudio: Any
  
  /* unmapped type */
  var isCapturingVideo: Any
  
  /* unmapped type */
  var oncapturingchanged: Any
  
  /* unmapped type */
  var removeEventListener: Any
}
object AppCapture {
  
  inline def apply(
    addEventListener: Any,
    isCapturingAudio: Any,
    isCapturingVideo: Any,
    oncapturingchanged: Any,
    removeEventListener: Any
  ): AppCapture = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], isCapturingAudio = isCapturingAudio.asInstanceOf[js.Any], isCapturingVideo = isCapturingVideo.asInstanceOf[js.Any], oncapturingchanged = oncapturingchanged.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppCapture]
  }
  
  extension [Self <: AppCapture](x: Self) {
    
    inline def setAddEventListener(value: Any): Self = StObject.set(x, "addEventListener", value.asInstanceOf[js.Any])
    
    inline def setIsCapturingAudio(value: Any): Self = StObject.set(x, "isCapturingAudio", value.asInstanceOf[js.Any])
    
    inline def setIsCapturingVideo(value: Any): Self = StObject.set(x, "isCapturingVideo", value.asInstanceOf[js.Any])
    
    inline def setOncapturingchanged(value: Any): Self = StObject.set(x, "oncapturingchanged", value.asInstanceOf[js.Any])
    
    inline def setRemoveEventListener(value: Any): Self = StObject.set(x, "removeEventListener", value.asInstanceOf[js.Any])
  }
}
