package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

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
  sealed trait downloaded
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageDownloadState
  
  /** The email message is currently downloading. */
  @js.native
  sealed trait downloading
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageDownloadState
  
  /** The download of the email message has failed. */
  @js.native
  sealed trait failed
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageDownloadState
  
  /** The email message is partially downloaded. */
  @js.native
  sealed trait partiallyDownloaded
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageDownloadState
  
  /* 2 */ val downloaded: downloaded with scala.Double = js.native
  /* 1 */ val downloading: downloading with scala.Double = js.native
  /* 3 */ val failed: failed with scala.Double = js.native
  /* 0 */ val partiallyDownloaded: partiallyDownloaded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageDownloadState with scala.Double
  ] = js.native
}

