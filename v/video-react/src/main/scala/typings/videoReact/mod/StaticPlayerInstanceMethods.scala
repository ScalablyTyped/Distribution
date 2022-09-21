package typings.videoReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticPlayerInstanceMethods extends StObject {
  
  /**
    * Add a new text track to the video
    */
  def addTextTrack(): Unit
  
  /**
    * Check if your browser can play different types of videos
    */
  def canPlayType(): Unit
  
  /**
    * Jump forward x seconds
    */
  def forward(seconds: Double): Unit
  
  /**
    * Get the redux State.
    */
  def getState(): PlayerState
  
  /**
    * Change the video source and re-load the video
    */
  def load(): Unit
  
  /**
    * Pause the video.
    */
  def pause(): Unit
  
  /**
    * Play the video.
    */
  def play(): Unit
  
  /**
    * Jump back x seconds
    */
  def replay(seconds: Double): Unit
  
  /**
    * Seek video by time (seconds)
    */
  def seek(time: Double): Unit
  
  /**
    * Subscribe to the player state changes.
    */
  def subscribeToStateChange(listener: StateListener): Unit
  
  /**
    * Enter or exist full screen
    */
  def toggleFullscreen(): Unit
}
object StaticPlayerInstanceMethods {
  
  inline def apply(
    addTextTrack: () => Unit,
    canPlayType: () => Unit,
    forward: Double => Unit,
    getState: () => PlayerState,
    load: () => Unit,
    pause: () => Unit,
    play: () => Unit,
    replay: Double => Unit,
    seek: Double => Unit,
    subscribeToStateChange: StateListener => Unit,
    toggleFullscreen: () => Unit
  ): StaticPlayerInstanceMethods = {
    val __obj = js.Dynamic.literal(addTextTrack = js.Any.fromFunction0(addTextTrack), canPlayType = js.Any.fromFunction0(canPlayType), forward = js.Any.fromFunction1(forward), getState = js.Any.fromFunction0(getState), load = js.Any.fromFunction0(load), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), replay = js.Any.fromFunction1(replay), seek = js.Any.fromFunction1(seek), subscribeToStateChange = js.Any.fromFunction1(subscribeToStateChange), toggleFullscreen = js.Any.fromFunction0(toggleFullscreen))
    __obj.asInstanceOf[StaticPlayerInstanceMethods]
  }
  
  extension [Self <: StaticPlayerInstanceMethods](x: Self) {
    
    inline def setAddTextTrack(value: () => Unit): Self = StObject.set(x, "addTextTrack", js.Any.fromFunction0(value))
    
    inline def setCanPlayType(value: () => Unit): Self = StObject.set(x, "canPlayType", js.Any.fromFunction0(value))
    
    inline def setForward(value: Double => Unit): Self = StObject.set(x, "forward", js.Any.fromFunction1(value))
    
    inline def setGetState(value: () => PlayerState): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    inline def setLoad(value: () => Unit): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    inline def setReplay(value: Double => Unit): Self = StObject.set(x, "replay", js.Any.fromFunction1(value))
    
    inline def setSeek(value: Double => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
    
    inline def setSubscribeToStateChange(value: StateListener => Unit): Self = StObject.set(x, "subscribeToStateChange", js.Any.fromFunction1(value))
    
    inline def setToggleFullscreen(value: () => Unit): Self = StObject.set(x, "toggleFullscreen", js.Any.fromFunction0(value))
  }
}
