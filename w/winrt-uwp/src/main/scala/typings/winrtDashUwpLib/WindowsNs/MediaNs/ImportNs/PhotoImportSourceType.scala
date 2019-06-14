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
  
  /* 6 */ val audioRecorder: audioRecorder with scala.Double = js.native
  /* 1 */ val camera: camera with scala.Double = js.native
  /* 0 */ val generic: generic with scala.Double = js.native
  /* 2 */ val mediaPlayer: mediaPlayer with scala.Double = js.native
  /* 5 */ val personalInfoManager: personalInfoManager with scala.Double = js.native
  /* 3 */ val phone: phone with scala.Double = js.native
  /* 4 */ val video: video with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportSourceType with scala.Double
  ] = js.native
}

