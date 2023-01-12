package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeEvent extends StObject {
  
  var videoHeight: Double
  
  var videoWidth: Double
}
object ResizeEvent {
  
  inline def apply(videoHeight: Double, videoWidth: Double): ResizeEvent = {
    val __obj = js.Dynamic.literal(videoHeight = videoHeight.asInstanceOf[js.Any], videoWidth = videoWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResizeEvent] (val x: Self) extends AnyVal {
    
    inline def setVideoHeight(value: Double): Self = StObject.set(x, "videoHeight", value.asInstanceOf[js.Any])
    
    inline def setVideoWidth(value: Double): Self = StObject.set(x, "videoWidth", value.asInstanceOf[js.Any])
  }
}
