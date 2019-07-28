package typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs

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
  sealed trait audioRecorder extends PhotoImportSourceType
  
  /** The device is a camera. */
  @js.native
  sealed trait camera extends PhotoImportSourceType
  
  /** The device is a generic photo import source. */
  @js.native
  sealed trait generic extends PhotoImportSourceType
  
  /** The device is a media player. */
  @js.native
  sealed trait mediaPlayer extends PhotoImportSourceType
  
  /** The device is a personal information manager. */
  @js.native
  sealed trait personalInfoManager extends PhotoImportSourceType
  
  /** The device is a phone. */
  @js.native
  sealed trait phone extends PhotoImportSourceType
  
  /** The device is a video camera. */
  @js.native
  sealed trait video extends PhotoImportSourceType
  
  /* 6 */ val audioRecorder: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportSourceType.audioRecorder with Double = js.native
  /* 1 */ val camera: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportSourceType.camera with Double = js.native
  /* 0 */ val generic: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportSourceType.generic with Double = js.native
  /* 2 */ val mediaPlayer: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportSourceType.mediaPlayer with Double = js.native
  /* 5 */ val personalInfoManager: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportSourceType.personalInfoManager with Double = js.native
  /* 3 */ val phone: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportSourceType.phone with Double = js.native
  /* 4 */ val video: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportSourceType.video with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoImportSourceType with Double] = js.native
}

