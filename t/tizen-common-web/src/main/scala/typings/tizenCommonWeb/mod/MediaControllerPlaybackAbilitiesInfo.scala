package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerPlaybackAbilitiesInfo extends StObject {
  
  /**
    * Represents server's ability to perform FORWARD action.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val forward: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to perform NEXT action.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val next: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to perform PAUSE action.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val pause: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to perform PLAY action.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val play: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to perform PREV action.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val prev: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to perform REWIND action.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val rewind: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to perform STOP action.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val stop: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to perform TOGGLE\_PLAY\_PAUSE action.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val togglePlayPause: MediaControllerAbilitySupport
}
object MediaControllerPlaybackAbilitiesInfo {
  
  inline def apply(
    forward: MediaControllerAbilitySupport,
    next: MediaControllerAbilitySupport,
    pause: MediaControllerAbilitySupport,
    play: MediaControllerAbilitySupport,
    prev: MediaControllerAbilitySupport,
    rewind: MediaControllerAbilitySupport,
    stop: MediaControllerAbilitySupport,
    togglePlayPause: MediaControllerAbilitySupport
  ): MediaControllerPlaybackAbilitiesInfo = {
    val __obj = js.Dynamic.literal(forward = forward.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], rewind = rewind.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], togglePlayPause = togglePlayPause.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaControllerPlaybackAbilitiesInfo]
  }
  
  extension [Self <: MediaControllerPlaybackAbilitiesInfo](x: Self) {
    
    inline def setForward(value: MediaControllerAbilitySupport): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    inline def setNext(value: MediaControllerAbilitySupport): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setPause(value: MediaControllerAbilitySupport): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    inline def setPlay(value: MediaControllerAbilitySupport): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
    
    inline def setPrev(value: MediaControllerAbilitySupport): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setRewind(value: MediaControllerAbilitySupport): Self = StObject.set(x, "rewind", value.asInstanceOf[js.Any])
    
    inline def setStop(value: MediaControllerAbilitySupport): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    inline def setTogglePlayPause(value: MediaControllerAbilitySupport): Self = StObject.set(x, "togglePlayPause", value.asInstanceOf[js.Any])
  }
}
