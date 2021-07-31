package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an email attachment. */
trait EmailAttachment extends StObject {
  
  /** Gets or sets a value that identifies the content of the attachment on a remote system. */
  var contentId: String
  
  /** Gets or sets the location of an email attachment as a Uniform Resource Identifier (URI). */
  var contentLocation: String
  
  /** Gets or sets the email attachment's data. */
  var data: IRandomAccessStreamReference
  
  /** Gets or sets the download state of the email attachment. */
  var downloadState: EmailAttachmentDownloadState
  
  /** Gets or sets the estimated download size of the attachment. */
  var estimatedDownloadSizeInBytes: Double
  
  /** Gets or sets the displayed file name for the email attachment. */
  var fileName: String
  
  /** Gets the locally unique ID for the email attachment. */
  var id: String
  
  /** Gets a Boolean value indicating if the attachment came from the base message. */
  var isFromBaseMessage: Boolean
  
  /** Gets or sets a Boolean property indicating if the attachment is included inline, in the body of the message. */
  var isInline: Boolean
  
  /** Gets or sets the MIME type of the attachment. */
  var mimeType: String
}
object EmailAttachment {
  
  @scala.inline
  def apply(
    contentId: String,
    contentLocation: String,
    data: IRandomAccessStreamReference,
    downloadState: EmailAttachmentDownloadState,
    estimatedDownloadSizeInBytes: Double,
    fileName: String,
    id: String,
    isFromBaseMessage: Boolean,
    isInline: Boolean,
    mimeType: String
  ): EmailAttachment = {
    val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], contentLocation = contentLocation.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], downloadState = downloadState.asInstanceOf[js.Any], estimatedDownloadSizeInBytes = estimatedDownloadSizeInBytes.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isFromBaseMessage = isFromBaseMessage.asInstanceOf[js.Any], isInline = isInline.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailAttachment]
  }
  
  @scala.inline
  implicit class EmailAttachmentMutableBuilder[Self <: EmailAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLocation(value: String): Self = StObject.set(x, "contentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: IRandomAccessStreamReference): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadState(value: EmailAttachmentDownloadState): Self = StObject.set(x, "downloadState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedDownloadSizeInBytes(value: Double): Self = StObject.set(x, "estimatedDownloadSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFromBaseMessage(value: Boolean): Self = StObject.set(x, "isFromBaseMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
  }
}
