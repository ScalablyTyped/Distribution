package typings.winrtUwp.Windows.Media.Audio

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioDeviceNodeCreationStatus extends js.Object

/** Defines status values for audio device node creation. */
@JSGlobal("Windows.Media.Audio.AudioDeviceNodeCreationStatus")
@js.native
object AudioDeviceNodeCreationStatus extends js.Object {
  /** Access to the audio device was denied. */
  @js.native
  sealed trait accessDenied extends AudioDeviceNodeCreationStatus
  
  /** The audio device is not available. */
  @js.native
  sealed trait deviceNotAvailable extends AudioDeviceNodeCreationStatus
  
  /** The format for audio device node creation is not supported. */
  @js.native
  sealed trait formatNotSupported extends AudioDeviceNodeCreationStatus
  
  /** Audio device node creation succeeded. */
  @js.native
  sealed trait success extends AudioDeviceNodeCreationStatus
  
  /** An unknown failure occurred in creation of the audio device node. */
  @js.native
  sealed trait unknownFailure extends AudioDeviceNodeCreationStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioDeviceNodeCreationStatus with Double] = js.native
  /* 4 */ @js.native
  object accessDenied extends TopLevel[accessDenied with Double]
  
  /* 1 */ @js.native
  object deviceNotAvailable extends TopLevel[deviceNotAvailable with Double]
  
  /* 2 */ @js.native
  object formatNotSupported extends TopLevel[formatNotSupported with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 3 */ @js.native
  object unknownFailure extends TopLevel[unknownFailure with Double]
  
}

