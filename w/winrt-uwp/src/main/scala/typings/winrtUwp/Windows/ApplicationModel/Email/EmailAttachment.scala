package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an email attachment. */
@js.native
trait EmailAttachment extends js.Object {
  
  /** Gets or sets a value that identifies the content of the attachment on a remote system. */
  var contentId: String = js.native
  
  /** Gets or sets the location of an email attachment as a Uniform Resource Identifier (URI). */
  var contentLocation: String = js.native
  
  /** Gets or sets the email attachment's data. */
  var data: IRandomAccessStreamReference = js.native
  
  /** Gets or sets the download state of the email attachment. */
  var downloadState: EmailAttachmentDownloadState = js.native
  
  /** Gets or sets the estimated download size of the attachment. */
  var estimatedDownloadSizeInBytes: Double = js.native
  
  /** Gets or sets the displayed file name for the email attachment. */
  var fileName: String = js.native
  
  /** Gets the locally unique ID for the email attachment. */
  var id: String = js.native
  
  /** Gets a Boolean value indicating if the attachment came from the base message. */
  var isFromBaseMessage: Boolean = js.native
  
  /** Gets or sets a Boolean property indicating if the attachment is included inline, in the body of the message. */
  var isInline: Boolean = js.native
  
  /** Gets or sets the MIME type of the attachment. */
  var mimeType: String = js.native
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
  implicit class EmailAttachmentOps[Self <: EmailAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContentId(value: String): Self = this.set("contentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLocation(value: String): Self = this.set("contentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: IRandomAccessStreamReference): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadState(value: EmailAttachmentDownloadState): Self = this.set("downloadState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedDownloadSizeInBytes(value: Double): Self = this.set("estimatedDownloadSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFromBaseMessage(value: Boolean): Self = this.set("isFromBaseMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInline(value: Boolean): Self = this.set("isInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
  }
}
