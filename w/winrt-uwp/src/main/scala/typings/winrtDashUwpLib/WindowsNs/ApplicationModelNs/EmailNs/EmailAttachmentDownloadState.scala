package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailAttachmentDownloadState extends js.Object

/** Defines the states of an email attachment download. */
@JSGlobal("Windows.ApplicationModel.Email.EmailAttachmentDownloadState")
@js.native
object EmailAttachmentDownloadState extends js.Object {
  /** The attachment has been downloaded. */
  @js.native
  sealed trait downloaded
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailAttachmentDownloadState
  
  /** The attachment is currently downloading. */
  @js.native
  sealed trait downloading
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailAttachmentDownloadState
  
  /** The attachment has failed. */
  @js.native
  sealed trait failed
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailAttachmentDownloadState
  
  /** The attachment is not yet downloaded. */
  @js.native
  sealed trait notDownloaded
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailAttachmentDownloadState
  
  val downloaded: downloaded with java.lang.String = js.native
  val downloading: downloading with java.lang.String = js.native
  val failed: failed with java.lang.String = js.native
  val notDownloaded: notDownloaded with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailAttachmentDownloadState with java.lang.String
  ] = js.native
}

