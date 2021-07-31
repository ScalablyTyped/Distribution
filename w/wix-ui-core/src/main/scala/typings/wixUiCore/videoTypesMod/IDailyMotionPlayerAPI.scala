package typings.wixUiCore.videoTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDailyMotionPlayerAPI
  extends StObject
     with IPlayerAPI {
  
  var currentTime: Double
  
  var duration: Double
  
  var muted: Boolean
  
  def pause(): Unit
  
  def play(): Unit
  
  def setCurrentTime(amount: Double): Unit
  
  def setMuted(muted: Boolean): Unit
  
  def setVolume(fraction: Double): Unit
  
  var volume: Double
}
object IDailyMotionPlayerAPI {
  
  @scala.inline
  def apply(
    currentTime: Double,
    duration: Double,
    muted: Boolean,
    pause: () => Unit,
    play: () => Unit,
    setCurrentTime: Double => Unit,
    setMuted: Boolean => Unit,
    setVolume: Double => Unit,
    volume: Double
  ): IDailyMotionPlayerAPI = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), setCurrentTime = js.Any.fromFunction1(setCurrentTime), setMuted = js.Any.fromFunction1(setMuted), setVolume = js.Any.fromFunction1(setVolume), volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDailyMotionPlayerAPI]
  }
  
  @scala.inline
  implicit class IDailyMotionPlayerAPIMutableBuilder[Self <: IDailyMotionPlayerAPI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCurrentTime(value: Double => Unit): Self = StObject.set(x, "setCurrentTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMuted(value: Boolean => Unit): Self = StObject.set(x, "setMuted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVolume(value: Double => Unit): Self = StObject.set(x, "setVolume", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
