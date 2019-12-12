package typings.winrtDashUwp.Windows.Media.Import

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Import.PhotoImportSourceType.audioRecorder
import typings.winrtDashUwp.Windows.Media.Import.PhotoImportSourceType.camera
import typings.winrtDashUwp.Windows.Media.Import.PhotoImportSourceType.generic
import typings.winrtDashUwp.Windows.Media.Import.PhotoImportSourceType.mediaPlayer
import typings.winrtDashUwp.Windows.Media.Import.PhotoImportSourceType.personalInfoManager
import typings.winrtDashUwp.Windows.Media.Import.PhotoImportSourceType.phone
import typings.winrtDashUwp.Windows.Media.Import.PhotoImportSourceType.video
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoImportSourceType with Double] = js.native
  /* 6 */ @js.native
  object audioRecorder extends TopLevel[audioRecorder with Double]
  
  /* 1 */ @js.native
  object camera extends TopLevel[camera with Double]
  
  /* 0 */ @js.native
  object generic extends TopLevel[generic with Double]
  
  /* 2 */ @js.native
  object mediaPlayer extends TopLevel[mediaPlayer with Double]
  
  /* 5 */ @js.native
  object personalInfoManager extends TopLevel[personalInfoManager with Double]
  
  /* 3 */ @js.native
  object phone extends TopLevel[phone with Double]
  
  /* 4 */ @js.native
  object video extends TopLevel[video with Double]
  
}

