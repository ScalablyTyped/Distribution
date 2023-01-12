package typings.unityWebapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnityMediaPlayer extends StObject {
  
  def getPlaybackstate(response: js.Function): Any
  
  def onNext(onNextCallback: js.Function): Any
  
  def onPlayPause(onPlayPauseCallback: js.Function): Any
  
  def onPrevious(onPreviousCallback: js.Function): Any
  
  def setCanGoNext(cangonext: Boolean): Any
  
  def setCanGoPrev(cangoprev: Boolean): Any
  
  def setCanPause(canpause: Boolean): Any
  
  def setCanPlay(canplay: Boolean): Any
  
  def setPlaybackstate(state: UnityPlaybackState): Any
  
  def setTrack(trackMetadata: UnityTrackMetadata): Any
}
object UnityMediaPlayer {
  
  inline def apply(
    getPlaybackstate: js.Function => Any,
    onNext: js.Function => Any,
    onPlayPause: js.Function => Any,
    onPrevious: js.Function => Any,
    setCanGoNext: Boolean => Any,
    setCanGoPrev: Boolean => Any,
    setCanPause: Boolean => Any,
    setCanPlay: Boolean => Any,
    setPlaybackstate: UnityPlaybackState => Any,
    setTrack: UnityTrackMetadata => Any
  ): UnityMediaPlayer = {
    val __obj = js.Dynamic.literal(getPlaybackstate = js.Any.fromFunction1(getPlaybackstate), onNext = js.Any.fromFunction1(onNext), onPlayPause = js.Any.fromFunction1(onPlayPause), onPrevious = js.Any.fromFunction1(onPrevious), setCanGoNext = js.Any.fromFunction1(setCanGoNext), setCanGoPrev = js.Any.fromFunction1(setCanGoPrev), setCanPause = js.Any.fromFunction1(setCanPause), setCanPlay = js.Any.fromFunction1(setCanPlay), setPlaybackstate = js.Any.fromFunction1(setPlaybackstate), setTrack = js.Any.fromFunction1(setTrack))
    __obj.asInstanceOf[UnityMediaPlayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnityMediaPlayer] (val x: Self) extends AnyVal {
    
    inline def setGetPlaybackstate(value: js.Function => Any): Self = StObject.set(x, "getPlaybackstate", js.Any.fromFunction1(value))
    
    inline def setOnNext(value: js.Function => Any): Self = StObject.set(x, "onNext", js.Any.fromFunction1(value))
    
    inline def setOnPlayPause(value: js.Function => Any): Self = StObject.set(x, "onPlayPause", js.Any.fromFunction1(value))
    
    inline def setOnPrevious(value: js.Function => Any): Self = StObject.set(x, "onPrevious", js.Any.fromFunction1(value))
    
    inline def setSetCanGoNext(value: Boolean => Any): Self = StObject.set(x, "setCanGoNext", js.Any.fromFunction1(value))
    
    inline def setSetCanGoPrev(value: Boolean => Any): Self = StObject.set(x, "setCanGoPrev", js.Any.fromFunction1(value))
    
    inline def setSetCanPause(value: Boolean => Any): Self = StObject.set(x, "setCanPause", js.Any.fromFunction1(value))
    
    inline def setSetCanPlay(value: Boolean => Any): Self = StObject.set(x, "setCanPlay", js.Any.fromFunction1(value))
    
    inline def setSetPlaybackstate(value: UnityPlaybackState => Any): Self = StObject.set(x, "setPlaybackstate", js.Any.fromFunction1(value))
    
    inline def setSetTrack(value: UnityTrackMetadata => Any): Self = StObject.set(x, "setTrack", js.Any.fromFunction1(value))
  }
}
