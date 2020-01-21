package typings.winrtUwp.Windows.Media.Audio

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioFileNodeCreationStatus with Double] = js.native
  /* 1 */ @js.native
  object fileNotFound extends TopLevel[fileNotFound with Double]
  
  /* 3 */ @js.native
  object formatNotSupported extends TopLevel[formatNotSupported with Double]
  
  /* 2 */ @js.native
  object invalidFileType extends TopLevel[invalidFileType with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 4 */ @js.native
  object unknownFailure extends TopLevel[unknownFailure with Double]
  
}

