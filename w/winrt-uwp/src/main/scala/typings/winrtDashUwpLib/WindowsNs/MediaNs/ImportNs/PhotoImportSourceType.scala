package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ImportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoImportSourceType extends js.Object

/** Specifies the type of device that is being used as a photo import source. */
@JSGlobal("Windows.Media.Import.PhotoImportSourceType")
@js.native
object PhotoImportSourceType extends js.Object {
  /** The device is an audio recorder. */
  @js.native
  sealed trait audioRecorder
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportSourceType
  
  /** The device is a camera. */
  @js.native
  sealed trait camera
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportSourceType
  
  /** The device is a generic photo import source. */
  @js.native
  sealed trait generic
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportSourceType
  
  /** The device is a media player. */
  @js.native
  sealed trait mediaPlayer
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportSourceType
  
  /** The device is a personal information manager. */
  @js.native
  sealed trait personalInfoManager
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportSourceType
  
  /** The device is a phone. */
  @js.native
  sealed trait phone
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportSourceType
  
  /** The device is a video camera. */
  @js.native
  sealed trait video
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportSourceType
  
  val audioRecorder: audioRecorder with java.lang.String = js.native
  val camera: camera with java.lang.String = js.native
  val generic: generic with java.lang.String = js.native
  val mediaPlayer: mediaPlayer with java.lang.String = js.native
  val personalInfoManager: personalInfoManager with java.lang.String = js.native
  val phone: phone with java.lang.String = js.native
  val video: video with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportSourceType with java.lang.String
  ] = js.native
}

