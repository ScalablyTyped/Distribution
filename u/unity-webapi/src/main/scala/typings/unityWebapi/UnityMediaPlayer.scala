package typings.unityWebapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnityMediaPlayer extends StObject {
  
  def getPlaybackstate(response: js.Function): js.Any
  
  def onNext(onNextCallback: js.Function): js.Any
  
  def onPlayPause(onPlayPauseCallback: js.Function): js.Any
  
  def onPrevious(onPreviousCallback: js.Function): js.Any
  
  def setCanGoNext(cangonext: Boolean): js.Any
  
  def setCanGoPrev(cangoprev: Boolean): js.Any
  
  def setCanPause(canpause: Boolean): js.Any
  
  def setCanPlay(canplay: Boolean): js.Any
  
  def setPlaybackstate(state: UnityPlaybackState): js.Any
  
  def setTrack(trackMetadata: UnityTrackMetadata): js.Any
}
object UnityMediaPlayer {
  
  inline def apply(
    getPlaybackstate: js.Function => js.Any,
    onNext: js.Function => js.Any,
    onPlayPause: js.Function => js.Any,
    onPrevious: js.Function => js.Any,
    setCanGoNext: Boolean => js.Any,
    setCanGoPrev: Boolean => js.Any,
    setCanPause: Boolean => js.Any,
    setCanPlay: Boolean => js.Any,
    setPlaybackstate: UnityPlaybackState => js.Any,
    setTrack: UnityTrackMetadata => js.Any
  ): UnityMediaPlayer = {
    val __obj = js.Dynamic.literal(getPlaybackstate = js.Any.fromFunction1(getPlaybackstate), onNext = js.Any.fromFunction1(onNext), onPlayPause = js.Any.fromFunction1(onPlayPause), onPrevious = js.Any.fromFunction1(onPrevious), setCanGoNext = js.Any.fromFunction1(setCanGoNext), setCanGoPrev = js.Any.fromFunction1(setCanGoPrev), setCanPause = js.Any.fromFunction1(setCanPause), setCanPlay = js.Any.fromFunction1(setCanPlay), setPlaybackstate = js.Any.fromFunction1(setPlaybackstate), setTrack = js.Any.fromFunction1(setTrack))
    __obj.asInstanceOf[UnityMediaPlayer]
  }
  
  extension [Self <: UnityMediaPlayer](x: Self) {
    
    inline def setGetPlaybackstate(value: js.Function => js.Any): Self = StObject.set(x, "getPlaybackstate", js.Any.fromFunction1(value))
    
    inline def setOnNext(value: js.Function => js.Any): Self = StObject.set(x, "onNext", js.Any.fromFunction1(value))
    
    inline def setOnPlayPause(value: js.Function => js.Any): Self = StObject.set(x, "onPlayPause", js.Any.fromFunction1(value))
    
    inline def setOnPrevious(value: js.Function => js.Any): Self = StObject.set(x, "onPrevious", js.Any.fromFunction1(value))
    
    inline def setSetCanGoNext(value: Boolean => js.Any): Self = StObject.set(x, "setCanGoNext", js.Any.fromFunction1(value))
    
    inline def setSetCanGoPrev(value: Boolean => js.Any): Self = StObject.set(x, "setCanGoPrev", js.Any.fromFunction1(value))
    
    inline def setSetCanPause(value: Boolean => js.Any): Self = StObject.set(x, "setCanPause", js.Any.fromFunction1(value))
    
    inline def setSetCanPlay(value: Boolean => js.Any): Self = StObject.set(x, "setCanPlay", js.Any.fromFunction1(value))
    
    inline def setSetPlaybackstate(value: UnityPlaybackState => js.Any): Self = StObject.set(x, "setPlaybackstate", js.Any.fromFunction1(value))
    
    inline def setSetTrack(value: UnityTrackMetadata => js.Any): Self = StObject.set(x, "setTrack", js.Any.fromFunction1(value))
  }
}
