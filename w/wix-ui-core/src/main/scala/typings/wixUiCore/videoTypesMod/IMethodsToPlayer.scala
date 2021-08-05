package typings.wixUiCore.videoTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMethodsToPlayer extends StObject {
  
  var getCurrentTime: String | js.Function
  
  var getDuration: String | js.Function
  
  var getVolume: String | js.Function
  
  var isMuted: String | js.Function
  
  var mute: String | js.Function
  
  var pause: String | js.Function
  
  var play: String | js.Function
  
  var seekTo: String | js.Function
  
  var setVolume: String | js.Function
  
  var stop: js.UndefOr[String | js.Function] = js.undefined
  
  var unMute: String | js.Function
}
object IMethodsToPlayer {
  
  inline def apply(
    getCurrentTime: String | js.Function,
    getDuration: String | js.Function,
    getVolume: String | js.Function,
    isMuted: String | js.Function,
    mute: String | js.Function,
    pause: String | js.Function,
    play: String | js.Function,
    seekTo: String | js.Function,
    setVolume: String | js.Function,
    unMute: String | js.Function
  ): IMethodsToPlayer = {
    val __obj = js.Dynamic.literal(getCurrentTime = getCurrentTime.asInstanceOf[js.Any], getDuration = getDuration.asInstanceOf[js.Any], getVolume = getVolume.asInstanceOf[js.Any], isMuted = isMuted.asInstanceOf[js.Any], mute = mute.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], seekTo = seekTo.asInstanceOf[js.Any], setVolume = setVolume.asInstanceOf[js.Any], unMute = unMute.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMethodsToPlayer]
  }
  
  extension [Self <: IMethodsToPlayer](x: Self) {
    
    inline def setGetCurrentTime(value: String | js.Function): Self = StObject.set(x, "getCurrentTime", value.asInstanceOf[js.Any])
    
    inline def setGetDuration(value: String | js.Function): Self = StObject.set(x, "getDuration", value.asInstanceOf[js.Any])
    
    inline def setGetVolume(value: String | js.Function): Self = StObject.set(x, "getVolume", value.asInstanceOf[js.Any])
    
    inline def setIsMuted(value: String | js.Function): Self = StObject.set(x, "isMuted", value.asInstanceOf[js.Any])
    
    inline def setMute(value: String | js.Function): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
    
    inline def setPause(value: String | js.Function): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    inline def setPlay(value: String | js.Function): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
    
    inline def setSeekTo(value: String | js.Function): Self = StObject.set(x, "seekTo", value.asInstanceOf[js.Any])
    
    inline def setSetVolume(value: String | js.Function): Self = StObject.set(x, "setVolume", value.asInstanceOf[js.Any])
    
    inline def setStop(value: String | js.Function): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    
    inline def setUnMute(value: String | js.Function): Self = StObject.set(x, "unMute", value.asInstanceOf[js.Any])
  }
}
