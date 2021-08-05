package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Controls extends StObject {
  
  var controls: Boolean
  
  var `data-hook`: String
  
  var height: Double
  
  var loop: Boolean
  
  var muted: Boolean
  
  def onEnd(): String
  
  def onPause(): String
  
  def onPlay(): String
  
  def onReady(): String
  
  var playing: Boolean
  
  var src: String
  
  var width: Double
}
object Controls {
  
  inline def apply(
    controls: Boolean,
    `data-hook`: String,
    height: Double,
    loop: Boolean,
    muted: Boolean,
    onEnd: () => String,
    onPause: () => String,
    onPlay: () => String,
    onReady: () => String,
    playing: Boolean,
    src: String,
    width: Double
  ): Controls = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], onEnd = js.Any.fromFunction0(onEnd), onPause = js.Any.fromFunction0(onPause), onPlay = js.Any.fromFunction0(onPlay), onReady = js.Any.fromFunction0(onReady), playing = playing.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("data-hook")(`data-hook`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Controls]
  }
  
  extension [Self <: Controls](x: Self) {
    
    inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setOnEnd(value: () => String): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
    
    inline def setOnPause(value: () => String): Self = StObject.set(x, "onPause", js.Any.fromFunction0(value))
    
    inline def setOnPlay(value: () => String): Self = StObject.set(x, "onPlay", js.Any.fromFunction0(value))
    
    inline def setOnReady(value: () => String): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
    
    inline def setPlaying(value: Boolean): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
