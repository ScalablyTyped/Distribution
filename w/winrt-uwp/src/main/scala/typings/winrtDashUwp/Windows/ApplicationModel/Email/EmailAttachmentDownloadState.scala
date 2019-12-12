package typings.winrtDashUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailAttachmentDownloadState.downloaded
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailAttachmentDownloadState.downloading
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailAttachmentDownloadState.failed
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailAttachmentDownloadState.notDownloaded
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailAttachmentDownloadState with Double] = js.native
  /* 2 */ @js.native
  object downloaded extends TopLevel[downloaded with Double]
  
  /* 1 */ @js.native
  object downloading extends TopLevel[downloading with Double]
  
  /* 3 */ @js.native
  object failed extends TopLevel[failed with Double]
  
  /* 0 */ @js.native
  object notDownloaded extends TopLevel[notDownloaded with Double]
  
}

