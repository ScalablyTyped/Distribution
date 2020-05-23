package typings.winrtUwp.Windows.ApplicationModel.Email

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
  sealed trait downloaded extends EmailAttachmentDownloadState
  
  /** The attachment is currently downloading. */
  @js.native
  sealed trait downloading extends EmailAttachmentDownloadState
  
  /** The attachment has failed. */
  @js.native
  sealed trait failed extends EmailAttachmentDownloadState
  
  /** The attachment is not yet downloaded. */
  @js.native
  sealed trait notDownloaded extends EmailAttachmentDownloadState
  
}

