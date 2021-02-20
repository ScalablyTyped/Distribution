package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestAttachment extends StObject {
  
  var attachmentType: AttachmentType = js.native
  
  var comment: String = js.native
  
  var createdDate: Date = js.native
  
  var fileName: String = js.native
  
  var id: Double = js.native
  
  var url: String = js.native
}
object TestAttachment {
  
  @scala.inline
  def apply(
    attachmentType: AttachmentType,
    comment: String,
    createdDate: Date,
    fileName: String,
    id: Double,
    url: String
  ): TestAttachment = {
    val __obj = js.Dynamic.literal(attachmentType = attachmentType.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestAttachment]
  }
  
  @scala.inline
  implicit class TestAttachmentMutableBuilder[Self <: TestAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentType(value: AttachmentType): Self = StObject.set(x, "attachmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
