package typings.winrtUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
