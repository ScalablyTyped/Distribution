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
  
  /* 2 */ val downloaded: downloaded with scala.Double = js.native
  /* 1 */ val downloading: downloading with scala.Double = js.native
  /* 3 */ val failed: failed with scala.Double = js.native
  /* 0 */ val notDownloaded: notDownloaded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailAttachmentDownloadState with scala.Double
  ] = js.native
}

