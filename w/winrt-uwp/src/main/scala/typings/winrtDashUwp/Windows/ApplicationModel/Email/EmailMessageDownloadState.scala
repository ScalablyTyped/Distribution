package typings.winrtDashUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMessageDownloadState.downloaded
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMessageDownloadState.downloading
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMessageDownloadState.failed
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMessageDownloadState.partiallyDownloaded
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMessageDownloadState with Double] = js.native
  /* 2 */ @js.native
  object downloaded extends TopLevel[downloaded with Double]
  
  /* 1 */ @js.native
  object downloading extends TopLevel[downloading with Double]
  
  /* 3 */ @js.native
  object failed extends TopLevel[failed with Double]
  
  /* 0 */ @js.native
  object partiallyDownloaded extends TopLevel[partiallyDownloaded with Double]
  
}

