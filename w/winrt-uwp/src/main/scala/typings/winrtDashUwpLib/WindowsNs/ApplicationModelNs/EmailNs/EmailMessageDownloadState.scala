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
  
  val downloaded: downloaded with java.lang.String = js.native
  val downloading: downloading with java.lang.String = js.native
  val failed: failed with java.lang.String = js.native
  val partiallyDownloaded: partiallyDownloaded with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageDownloadState with java.lang.String
  ] = js.native
}

