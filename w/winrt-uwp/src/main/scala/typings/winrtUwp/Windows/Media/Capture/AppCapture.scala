package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppCapture extends StObject {
  
  /* unmapped type */
  var addEventListener: js.Any
  
  /* unmapped type */
  var isCapturingAudio: js.Any
  
  /* unmapped type */
  var isCapturingVideo: js.Any
  
  /* unmapped type */
  var oncapturingchanged: js.Any
  
  /* unmapped type */
  var removeEventListener: js.Any
}
object AppCapture {
  
  inline def apply(
    addEventListener: js.Any,
    isCapturingAudio: js.Any,
    isCapturingVideo: js.Any,
    oncapturingchanged: js.Any,
    removeEventListener: js.Any
  ): AppCapture = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], isCapturingAudio = isCapturingAudio.asInstanceOf[js.Any], isCapturingVideo = isCapturingVideo.asInstanceOf[js.Any], oncapturingchanged = oncapturingchanged.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppCapture]
  }
  
  extension [Self <: AppCapture](x: Self) {
    
    inline def setAddEventListener(value: js.Any): Self = StObject.set(x, "addEventListener", value.asInstanceOf[js.Any])
    
    inline def setIsCapturingAudio(value: js.Any): Self = StObject.set(x, "isCapturingAudio", value.asInstanceOf[js.Any])
    
    inline def setIsCapturingVideo(value: js.Any): Self = StObject.set(x, "isCapturingVideo", value.asInstanceOf[js.Any])
    
    inline def setOncapturingchanged(value: js.Any): Self = StObject.set(x, "oncapturingchanged", value.asInstanceOf[js.Any])
    
    inline def setRemoveEventListener(value: js.Any): Self = StObject.set(x, "removeEventListener", value.asInstanceOf[js.Any])
  }
}
