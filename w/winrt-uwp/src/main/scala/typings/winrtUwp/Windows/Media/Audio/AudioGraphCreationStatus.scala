package typings.winrtUwp.Windows.Media.Audio

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioGraphCreationStatus extends js.Object

/** Defines status values for audio graph creation. */
@JSGlobal("Windows.Media.Audio.AudioGraphCreationStatus")
@js.native
object AudioGraphCreationStatus extends js.Object {
  /** The PrimaryRenderDevice for the audio graph is not available. */
  @js.native
  sealed trait deviceNotAvailable extends AudioGraphCreationStatus
  
  /** The audio stream format is not supported by the audio graph. */
  @js.native
  sealed trait formatNotSupported extends AudioGraphCreationStatus
  
  /** Creation of the audio graph succeeded. */
  @js.native
  sealed trait success extends AudioGraphCreationStatus
  
  /** An unknown failure occurred during creation of the audio graph. */
  @js.native
  sealed trait unknownFailure extends AudioGraphCreationStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioGraphCreationStatus with Double] = js.native
  /* 1 */ @js.native
  object deviceNotAvailable extends TopLevel[deviceNotAvailable with Double]
  
  /* 2 */ @js.native
  object formatNotSupported extends TopLevel[formatNotSupported with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 3 */ @js.native
  object unknownFailure extends TopLevel[unknownFailure with Double]
  
}

