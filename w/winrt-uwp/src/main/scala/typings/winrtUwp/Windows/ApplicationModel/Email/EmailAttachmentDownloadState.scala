package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailAttachmentDownloadState extends StObject
/** Defines the states of an email attachment download. */
@JSGlobal("Windows.ApplicationModel.Email.EmailAttachmentDownloadState")
@js.native
object EmailAttachmentDownloadState extends StObject {
  
  /** The attachment has been downloaded. */
  @js.native
  sealed trait downloaded
    extends StObject
       with EmailAttachmentDownloadState
  
  /** The attachment is currently downloading. */
  @js.native
  sealed trait downloading
    extends StObject
       with EmailAttachmentDownloadState
  
  /** The attachment has failed. */
  @js.native
  sealed trait failed
    extends StObject
       with EmailAttachmentDownloadState
  
  /** The attachment is not yet downloaded. */
  @js.native
  sealed trait notDownloaded
    extends StObject
       with EmailAttachmentDownloadState
}
