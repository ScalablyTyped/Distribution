package typings
package winrtDashUwpLib.WindowsNs.MediaNs.AudioNs

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
  sealed trait fileNotFound
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioFileNodeCreationStatus
  
  /** The format of the audio file is not supported. */
  @js.native
  sealed trait formatNotSupported
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioFileNodeCreationStatus
  
  /** The audio file for node creation has an invalid file type. */
  @js.native
  sealed trait invalidFileType
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioFileNodeCreationStatus
  
  /** Creation of the audio file node succeeded. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioFileNodeCreationStatus
  
  /** An unknown failure occurred during creation of the audio file node. */
  @js.native
  sealed trait unknownFailure
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioFileNodeCreationStatus
  
  val fileNotFound: fileNotFound with java.lang.String = js.native
  val formatNotSupported: formatNotSupported with java.lang.String = js.native
  val invalidFileType: invalidFileType with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  val unknownFailure: unknownFailure with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioFileNodeCreationStatus with java.lang.String
  ] = js.native
}

