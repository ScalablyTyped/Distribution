package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerPlaybackAbilities extends StObject {
  
  /**
    * Represents server's ability to perform FORWARD action.
    *
    * Default value is UNDECIDED.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var forward: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to perform NEXT action.
    *
    * Default value is UNDECIDED.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var next: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to perform PAUSE action.
    *
    * Default value is UNDECIDED.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var pause: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to perform PLAY action.
    *
    * Default value is UNDECIDED.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var play: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to perform PREV action.
    *
    * Default value is UNDECIDED.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var prev: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to perform REWIND action.
    *
    * Default value is UNDECIDED.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var rewind: MediaControllerAbilitySupport
  
  /**
    * Saves the current state of playback abilities to the database.
    *
    * @remark Using this function is required to save changes of playback abilities into database, otherwise changes
    * will have no effect on the device and clients will not be notified about an update.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  def saveAbilities(): Unit
  
  /**
    * Represents server's ability to perform STOP action.
    *
    * Default value is UNDECIDED.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var stop: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to perform TOGGLE\_PLAY\_PAUSE action.
    *
    * Default value is UNDECIDED.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var togglePlayPause: MediaControllerAbilitySupport
}
object MediaControllerPlaybackAbilities {
  
  inline def apply(
    forward: MediaControllerAbilitySupport,
    next: MediaControllerAbilitySupport,
    pause: MediaControllerAbilitySupport,
    play: MediaControllerAbilitySupport,
    prev: MediaControllerAbilitySupport,
    rewind: MediaControllerAbilitySupport,
    saveAbilities: () => Unit,
    stop: MediaControllerAbilitySupport,
    togglePlayPause: MediaControllerAbilitySupport
  ): MediaControllerPlaybackAbilities = {
    val __obj = js.Dynamic.literal(forward = forward.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], rewind = rewind.asInstanceOf[js.Any], saveAbilities = js.Any.fromFunction0(saveAbilities), stop = stop.asInstanceOf[js.Any], togglePlayPause = togglePlayPause.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaControllerPlaybackAbilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaControllerPlaybackAbilities] (val x: Self) extends AnyVal {
    
    inline def setForward(value: MediaControllerAbilitySupport): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    inline def setNext(value: MediaControllerAbilitySupport): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setPause(value: MediaControllerAbilitySupport): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    inline def setPlay(value: MediaControllerAbilitySupport): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
    
    inline def setPrev(value: MediaControllerAbilitySupport): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setRewind(value: MediaControllerAbilitySupport): Self = StObject.set(x, "rewind", value.asInstanceOf[js.Any])
    
    inline def setSaveAbilities(value: () => Unit): Self = StObject.set(x, "saveAbilities", js.Any.fromFunction0(value))
    
    inline def setStop(value: MediaControllerAbilitySupport): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    inline def setTogglePlayPause(value: MediaControllerAbilitySupport): Self = StObject.set(x, "togglePlayPause", value.asInstanceOf[js.Any])
  }
}
