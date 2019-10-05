package typings.winrtDashUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMessageDownloadState extends js.Object

/** Defines the download status of an email message. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMessageDownloadState")
@js.native
object EmailMessageDownloadState extends js.Object {
  /** The download of the email message is complete. */
  @js.native
  sealed trait downloaded extends EmailMessageDownloadState
  
  /** The email message is currently downloading. */
  @js.native
  sealed trait downloading extends EmailMessageDownloadState
  
  /** The download of the email message has failed. */
  @js.native
  sealed trait failed extends EmailMessageDownloadState
  
  /** The email message is partially downloaded. */
  @js.native
  sealed trait partiallyDownloaded extends EmailMessageDownloadState
  
  /* 2 */ val downloaded: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMessageDownloadState.downloaded with Double = js.native
  /* 1 */ val downloading: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMessageDownloadState.downloading with Double = js.native
  /* 3 */ val failed: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMessageDownloadState.failed with Double = js.native
  /* 0 */ val partiallyDownloaded: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMessageDownloadState.partiallyDownloaded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMessageDownloadState with Double] = js.native
}

