package typings.tizenCommonWeb

import typings.tizenCommonWeb.tizenCommonWebStrings.AAC
import typings.tizenCommonWeb.tizenCommonWebStrings.BACK
import typings.tizenCommonWeb.tizenCommonWebStrings.CANCEL
import typings.tizenCommonWeb.tizenCommonWebStrings.DOLBY
import typings.tizenCommonWeb.tizenCommonWebStrings.DOLBY_DIGITAL_PLUS
import typings.tizenCommonWeb.tizenCommonWebStrings.DOWN
import typings.tizenCommonWeb.tizenCommonWebStrings.DTS
import typings.tizenCommonWeb.tizenCommonWebStrings.KEYPAD
import typings.tizenCommonWeb.tizenCommonWebStrings.KEYPAD_DEL
import typings.tizenCommonWeb.tizenCommonWebStrings.KEYPAD_ENTER
import typings.tizenCommonWeb.tizenCommonWebStrings.LEFT
import typings.tizenCommonWeb.tizenCommonWebStrings.MOVE
import typings.tizenCommonWeb.tizenCommonWebStrings.PAGE_LEFT
import typings.tizenCommonWeb.tizenCommonWebStrings.PAGE_RIGHT
import typings.tizenCommonWeb.tizenCommonWebStrings.PCM
import typings.tizenCommonWeb.tizenCommonWebStrings.PREPARING
import typings.tizenCommonWeb.tizenCommonWebStrings.RIGHT
import typings.tizenCommonWeb.tizenCommonWebStrings.SELECT
import typings.tizenCommonWeb.tizenCommonWebStrings.UP
import typings.tizenCommonWeb.tizenCommonWebStrings.WARNING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tvaudiocontrolMod {
  
  @js.native
  sealed trait AudioBeepType extends StObject
  @JSImport("tizen-common-web/tvaudiocontrol", "AudioBeepType")
  @js.native
  object AudioBeepType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AudioBeepType with String] = js.native
    
    @js.native
    sealed trait BACK extends AudioBeepType
    /* "BACK" */ val BACK: typings.tizenCommonWeb.tvaudiocontrolMod.AudioBeepType.BACK with String = js.native
    
    @js.native
    sealed trait CANCEL extends AudioBeepType
    /* "CANCEL" */ val CANCEL: typings.tizenCommonWeb.tvaudiocontrolMod.AudioBeepType.CANCEL with String = js.native
    
    @js.native
    sealed trait DOWN extends AudioBeepType
    /* "DOWN" */ val DOWN: typings.tizenCommonWeb.tvaudiocontrolMod.AudioBeepType.DOWN with String = js.native
    
    @js.native
    sealed trait KEYPAD extends AudioBeepType
    /* "KEYPAD" */ val KEYPAD: typings.tizenCommonWeb.tvaudiocontrolMod.AudioBeepType.KEYPAD with String = js.native
    
    @js.native
    sealed trait KEYPAD_DEL extends AudioBeepType
    /* "KEYPAD_DEL" */ val KEYPAD_DEL: typings.tizenCommonWeb.tvaudiocontrolMod.AudioBeepType.KEYPAD_DEL with String = js.native
    
    @js.native
    sealed trait KEYPAD_ENTER extends AudioBeepType
    /* "KEYPAD_ENTER" */ val KEYPAD_ENTER: typings.tizenCommonWeb.tvaudiocontrolMod.AudioBeepType.KEYPAD_ENTER with String = js.native
    
    @js.native
    sealed trait LEFT extends AudioBeepType
    /* "LEFT" */ val LEFT: typings.tizenCommonWeb.tvaudiocontrolMod.AudioBeepType.LEFT with String = js.native
    
    @js.native
    sealed trait MOVE extends AudioBeepType
    /* "MOVE" */ val MOVE: typings.tizenCommonWeb.tvaudiocontrolMod.AudioBeepType.MOVE with String = js.native
    
    @js.native
    sealed trait PAGE_LEFT extends AudioBeepType
    /* "PAGE_LEFT" */ val PAGE_LEFT: typings.tizenCommonWeb.tvaudiocontrolMod.AudioBeepType.PAGE_LEFT with String = js.native
    
    @js.native
    sealed trait PAGE_RIGHT extends AudioBeepType
    /* "PAGE_RIGHT" */ val PAGE_RIGHT: typings.tizenCommonWeb.tvaudiocontrolMod.AudioBeepType.PAGE_RIGHT with String = js.native
    
    @js.native
    sealed trait PREPARING extends AudioBeepType
    /* "PREPARING" */ val PREPARING: typings.tizenCommonWeb.tvaudiocontrolMod.AudioBeepType.PREPARING with String = js.native
    
    @js.native
    sealed trait RIGHT extends AudioBeepType
    /* "RIGHT" */ val RIGHT: typings.tizenCommonWeb.tvaudiocontrolMod.AudioBeepType.RIGHT with String = js.native
    
    @js.native
    sealed trait SELECT extends AudioBeepType
    /* "SELECT" */ val SELECT: typings.tizenCommonWeb.tvaudiocontrolMod.AudioBeepType.SELECT with String = js.native
    
    @js.native
    sealed trait UP extends AudioBeepType
    /* "UP" */ val UP: typings.tizenCommonWeb.tvaudiocontrolMod.AudioBeepType.UP with String = js.native
    
    @js.native
    sealed trait WARNING extends AudioBeepType
    /* "WARNING" */ val WARNING: typings.tizenCommonWeb.tvaudiocontrolMod.AudioBeepType.WARNING with String = js.native
  }
  
  @js.native
  sealed trait AudioOutputMode extends StObject
  @JSImport("tizen-common-web/tvaudiocontrol", "AudioOutputMode")
  @js.native
  object AudioOutputMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AudioOutputMode with String] = js.native
    
    @js.native
    sealed trait AAC extends AudioOutputMode
    /* "AAC" */ val AAC: typings.tizenCommonWeb.tvaudiocontrolMod.AudioOutputMode.AAC with String = js.native
    
    @js.native
    sealed trait DOLBY extends AudioOutputMode
    /* "DOLBY" */ val DOLBY: typings.tizenCommonWeb.tvaudiocontrolMod.AudioOutputMode.DOLBY with String = js.native
    
    @js.native
    sealed trait DOLBY_DIGITAL_PLUS extends AudioOutputMode
    /* "DOLBY_DIGITAL_PLUS" */ val DOLBY_DIGITAL_PLUS: typings.tizenCommonWeb.tvaudiocontrolMod.AudioOutputMode.DOLBY_DIGITAL_PLUS with String = js.native
    
    @js.native
    sealed trait DTS extends AudioOutputMode
    /* "DTS" */ val DTS: typings.tizenCommonWeb.tvaudiocontrolMod.AudioOutputMode.DTS with String = js.native
    
    @js.native
    sealed trait PCM extends AudioOutputMode
    /* "PCM" */ val PCM: typings.tizenCommonWeb.tvaudiocontrolMod.AudioOutputMode.PCM with String = js.native
  }
  
  @js.native
  trait TVAudioControlManager extends StObject {
    
    /**
      * Gets the current audio output mode.
      *
      * @returns AudioOutputMode The current audio output mode
      *
      * @throw WebAPIException SecurityError, UnknownError
      *
      * @privilegeLevel 5.0 public
      * @privilegeName 5.0 http://tizen.org/privilege/tv.audio
      * @warning 5.0 http://tizen.org/privilege/tv.audio (public level) has been deprecated since 5.0.
      *
      */
    def getOutputMode(): AudioOutputMode | PCM | DOLBY | DTS | AAC | DOLBY_DIGITAL_PLUS = js.native
    
    /**
      * Gets the current volume level.
      *
      * @returns unsigned short The current volume (the volume range is 0 ~ 100)
      *
      * @throw WebAPIException SecurityError, UnknownError
      *
      * @privilegeLevel 5.0 public
      * @privilegeName 5.0 http://tizen.org/privilege/tv.audio
      * @warning 5.0 http://tizen.org/privilege/tv.audio (public level) has been deprecated since 5.0.
      *
      */
    def getVolume(): Double = js.native
    
    /**
      * Gets the mute state.
      *
      * @returns boolean The current mute state
      *
      * @throw WebAPIException SecurityError, UnknownError
      *
      * @privilegeLevel 5.0 public
      * @privilegeName 5.0 http://tizen.org/privilege/tv.audio
      * @warning 5.0 http://tizen.org/privilege/tv.audio (public level) has been deprecated since 5.0.
      *
      */
    def isMute(): Boolean = js.native
    
    /**
      * Plays the sound of a specific beep.
      *
      * @param type The beep type to play
      *
      * @throw WebAPIException TypeMismatchError, SecurityError, UnknownError
      *
      * @privilegeLevel 5.0 public
      * @privilegeName 5.0 http://tizen.org/privilege/tv.audio
      * @warning 5.0 http://tizen.org/privilege/tv.audio (public level) has been deprecated since 5.0.
      *
      */
    def playSound(`type`: AudioBeepType): Unit = js.native
    @JSName("playSound")
    def playSound_BACK(`type`: BACK): Unit = js.native
    @JSName("playSound")
    def playSound_CANCEL(`type`: CANCEL): Unit = js.native
    @JSName("playSound")
    def playSound_DOWN(`type`: DOWN): Unit = js.native
    @JSName("playSound")
    def playSound_KEYPAD(`type`: KEYPAD): Unit = js.native
    @JSName("playSound")
    def playSound_KEYPADDEL(`type`: KEYPAD_DEL): Unit = js.native
    @JSName("playSound")
    def playSound_KEYPADENTER(`type`: KEYPAD_ENTER): Unit = js.native
    @JSName("playSound")
    def playSound_LEFT(`type`: LEFT): Unit = js.native
    @JSName("playSound")
    def playSound_MOVE(`type`: MOVE): Unit = js.native
    @JSName("playSound")
    def playSound_PAGELEFT(`type`: PAGE_LEFT): Unit = js.native
    @JSName("playSound")
    def playSound_PAGERIGHT(`type`: PAGE_RIGHT): Unit = js.native
    @JSName("playSound")
    def playSound_PREPARING(`type`: PREPARING): Unit = js.native
    @JSName("playSound")
    def playSound_RIGHT(`type`: RIGHT): Unit = js.native
    @JSName("playSound")
    def playSound_SELECT(`type`: SELECT): Unit = js.native
    @JSName("playSound")
    def playSound_UP(`type`: UP): Unit = js.native
    @JSName("playSound")
    def playSound_WARNING(`type`: WARNING): Unit = js.native
    
    /**
      * Turns on or off the silent mode
      *
      * Note that turning on mute mode does not change volume level but
      * it simply disables any sound. Turning off the mute will enable sound
      * with the volume level. If setVolumeUp or setVolumeDown functions
      * are used, then mute is disabled.
      *
      * @param mute The mute state (true = turn on the silent mode, false = turn off the silent mode)
      * @throw WebAPIException SecurityError, UnknownError
      *
      * @warning 5.0 http://tizen.org/privilege/tv.audio (public level) has been deprecated since 5.0.
      * @privilegeLevel 5.0 public
      * @privilegeName 5.0 http://tizen.org/privilege/tv.audio
      *
      */
    def setMute(mute: Boolean): Unit = js.native
    
    /**
      * Changes the volume level.
      *
      * The value of `volume` is allowed from 0 to 100. If an invalid value is passed, `InvalidValuesError` will occur.
      *
      * @param volume The volume (the available volume range is 0 ~100)
      *
      * @throw WebAPIException InvalidValuesError, SecurityError, UnknownError
      *
      * @privilegeLevel 5.0 public
      * @privilegeName 5.0 http://tizen.org/privilege/tv.audio
      * @warning 5.0 http://tizen.org/privilege/tv.audio (public level) has been deprecated since 5.0.
      *
      */
    def setVolume(volume: Double): Unit = js.native
    
    /**
      * Registers a volume change callback for getting notified when TV volume has been changed.
      * Note that this method overwrites the previously registered listener.
      * @param callback The method to invoke when the volume has been changed. It will not be triggered when the silent mode is changed.
      *
      * @throw WebAPIException TypeMismatchError, SecurityError, UnknownError
      *
      * @privilegeLevel 5.0 public
      * @privilegeName 5.0 http://tizen.org/privilege/tv.audio
      * @warning 5.0 http://tizen.org/privilege/tv.audio (public level) has been deprecated since 5.0.
      *
      */
    def setVolumeChangeListener(callback: VolumeChangeCallback): Unit = js.native
    
    /**
      * Decreases the volume by 1 level.
      *
      * If it is called when the volume level is 0, it will be
      * ignored because the minimum volume level is 0. If mute is enabled,
      * then execution of this functions will disable it.
      *
      * @throw WebAPIException SecurityError, UnknownError
      *
      * @privilegeLevel 5.0 public
      * @privilegeName 5.0 http://tizen.org/privilege/tv.audio
      * @warning 5.0 http://tizen.org/privilege/tv.audio (public level) has been deprecated since 5.0.
      *
      */
    def setVolumeDown(): Unit = js.native
    
    /**
      * Increases the volume by 1 level.
      * If it is called when the volume level is 100, it will be ignored
      * because the maximum volume level is 100. If mute is enabled,
      * then execution of this functions will disable it.
      *
      * @throw WebAPIException SecurityError, UnknownError
      *
      * @privilegeLevel 5.0 public
      * @privilegeName 5.0 http://tizen.org/privilege/tv.audio
      * @warning 5.0 http://tizen.org/privilege/tv.audio (public level) has been deprecated since 5.0.
      *
      */
    def setVolumeUp(): Unit = js.native
    
    /**
      * Unregisters the volume change callback for detecting the volume changes.
      * Calling this function has no effect if listener is not set.
      *
      * @throw WebAPIException SecurityError, UnknownError
      *
      * @privilegeLevel 5.0 public
      * @privilegeName 5.0 http://tizen.org/privilege/tv.audio
      * @warning 5.0 http://tizen.org/privilege/tv.audio (public level) has been deprecated since 5.0.
      *
      */
    def unsetVolumeChangeListener(): Unit = js.native
  }
  
  type VolumeChangeCallback = js.Function1[/* volume */ Double, Unit]
}
