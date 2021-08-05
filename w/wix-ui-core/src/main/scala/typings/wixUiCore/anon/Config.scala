package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var controls: Boolean
  
  var fillAllSpace: Boolean
  
  var loop: Boolean
  
  var muted: Boolean
  
  def onDuration(): js.Any
  
  def onEnded(): js.Any
  
  def onError(): js.Any
  
  def onFirstEnded(): js.Any
  
  def onFirstPlay(): js.Any
  
  def onInit(): js.Any
  
  def onPause(): js.Any
  
  def onPlay(): js.Any
  
  def onProgress(): js.Any
  
  def onReady(): js.Any
  
  var showTitle: Boolean
  
  var volume: Double
}
object Config {
  
  inline def apply(
    controls: Boolean,
    fillAllSpace: Boolean,
    loop: Boolean,
    muted: Boolean,
    onDuration: () => js.Any,
    onEnded: () => js.Any,
    onError: () => js.Any,
    onFirstEnded: () => js.Any,
    onFirstPlay: () => js.Any,
    onInit: () => js.Any,
    onPause: () => js.Any,
    onPlay: () => js.Any,
    onProgress: () => js.Any,
    onReady: () => js.Any,
    showTitle: Boolean,
    volume: Double
  ): Config = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], fillAllSpace = fillAllSpace.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], onDuration = js.Any.fromFunction0(onDuration), onEnded = js.Any.fromFunction0(onEnded), onError = js.Any.fromFunction0(onError), onFirstEnded = js.Any.fromFunction0(onFirstEnded), onFirstPlay = js.Any.fromFunction0(onFirstPlay), onInit = js.Any.fromFunction0(onInit), onPause = js.Any.fromFunction0(onPause), onPlay = js.Any.fromFunction0(onPlay), onProgress = js.Any.fromFunction0(onProgress), onReady = js.Any.fromFunction0(onReady), showTitle = showTitle.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setFillAllSpace(value: Boolean): Self = StObject.set(x, "fillAllSpace", value.asInstanceOf[js.Any])
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setOnDuration(value: () => js.Any): Self = StObject.set(x, "onDuration", js.Any.fromFunction0(value))
    
    inline def setOnEnded(value: () => js.Any): Self = StObject.set(x, "onEnded", js.Any.fromFunction0(value))
    
    inline def setOnError(value: () => js.Any): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
    
    inline def setOnFirstEnded(value: () => js.Any): Self = StObject.set(x, "onFirstEnded", js.Any.fromFunction0(value))
    
    inline def setOnFirstPlay(value: () => js.Any): Self = StObject.set(x, "onFirstPlay", js.Any.fromFunction0(value))
    
    inline def setOnInit(value: () => js.Any): Self = StObject.set(x, "onInit", js.Any.fromFunction0(value))
    
    inline def setOnPause(value: () => js.Any): Self = StObject.set(x, "onPause", js.Any.fromFunction0(value))
    
    inline def setOnPlay(value: () => js.Any): Self = StObject.set(x, "onPlay", js.Any.fromFunction0(value))
    
    inline def setOnProgress(value: () => js.Any): Self = StObject.set(x, "onProgress", js.Any.fromFunction0(value))
    
    inline def setOnReady(value: () => js.Any): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
