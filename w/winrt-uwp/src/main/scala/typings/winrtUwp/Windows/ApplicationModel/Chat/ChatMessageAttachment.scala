package typings.winrtUwp.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an attachment to a chat message. */
trait ChatMessageAttachment extends StObject {
  
  /** Gets or sets a stream reference for a message attachment. */
  var dataStreamReference: IRandomAccessStreamReference
  
  /** Gets or sets the identifier for the attachment group to which this attachment belongs. */
  var groupId: Double
  
  /** Gets or sets the MIME type of the attachment. */
  var mimeType: String
  
  /** Gets or sets the original file name of the attachment. */
  var originalFileName: String
  
  /** Gets or sets the text encoded representation of the attachment object. */
  var text: String
  
  /** Gets or sets the thumbnail image for the attachment. */
  var thumbnail: IRandomAccessStreamReference
  
  /** Gets or sets the progress of transferring the attachment. */
  var transferProgress: Double
}
object ChatMessageAttachment {
  
  inline def apply(
    dataStreamReference: IRandomAccessStreamReference,
    groupId: Double,
    mimeType: String,
    originalFileName: String,
    text: String,
    thumbnail: IRandomAccessStreamReference,
    transferProgress: Double
  ): ChatMessageAttachment = {
    val __obj = js.Dynamic.literal(dataStreamReference = dataStreamReference.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], originalFileName = originalFileName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], transferProgress = transferProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessageAttachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatMessageAttachment] (val x: Self) extends AnyVal {
    
    inline def setDataStreamReference(value: IRandomAccessStreamReference): Self = StObject.set(x, "dataStreamReference", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: Double): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setOriginalFileName(value: String): Self = StObject.set(x, "originalFileName", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: IRandomAccessStreamReference): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setTransferProgress(value: Double): Self = StObject.set(x, "transferProgress", value.asInstanceOf[js.Any])
  }
}
