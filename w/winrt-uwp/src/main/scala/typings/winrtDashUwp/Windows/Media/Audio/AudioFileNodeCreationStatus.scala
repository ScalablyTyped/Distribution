package typings.winrtDashUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioFileNodeCreationStatus extends js.Object

/** Defines status values for audio file node creation. */
@JSGlobal("Windows.Media.Audio.AudioFileNodeCreationStatus")
@js.native
object AudioFileNodeCreationStatus extends js.Object {
  /** The audio file used to create the node was not found. */
  @js.native
  sealed trait fileNotFound extends AudioFileNodeCreationStatus
  
  /** The format of the audio file is not supported. */
  @js.native
  sealed trait formatNotSupported extends AudioFileNodeCreationStatus
  
  /** The audio file for node creation has an invalid file type. */
  @js.native
  sealed trait invalidFileType extends AudioFileNodeCreationStatus
  
  /** Creation of the audio file node succeeded. */
  @js.native
  sealed trait success extends AudioFileNodeCreationStatus
  
  /** An unknown failure occurred during creation of the audio file node. */
  @js.native
  sealed trait unknownFailure extends AudioFileNodeCreationStatus
  
  /* 1 */ val fileNotFound: typings.winrtDashUwp.Windows.Media.Audio.AudioFileNodeCreationStatus.fileNotFound with Double = js.native
  /* 3 */ val formatNotSupported: typings.winrtDashUwp.Windows.Media.Audio.AudioFileNodeCreationStatus.formatNotSupported with Double = js.native
  /* 2 */ val invalidFileType: typings.winrtDashUwp.Windows.Media.Audio.AudioFileNodeCreationStatus.invalidFileType with Double = js.native
  /* 0 */ val success: typings.winrtDashUwp.Windows.Media.Audio.AudioFileNodeCreationStatus.success with Double = js.native
  /* 4 */ val unknownFailure: typings.winrtDashUwp.Windows.Media.Audio.AudioFileNodeCreationStatus.unknownFailure with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioFileNodeCreationStatus with Double] = js.native
}

