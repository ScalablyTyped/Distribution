package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestAttachmentRequestModel extends StObject {
  
  var attachmentType: String = js.native
  
  var comment: String = js.native
  
  var fileName: String = js.native
  
  var stream: String = js.native
}
object TestAttachmentRequestModel {
  
  @scala.inline
  def apply(attachmentType: String, comment: String, fileName: String, stream: String): TestAttachmentRequestModel = {
    val __obj = js.Dynamic.literal(attachmentType = attachmentType.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestAttachmentRequestModel]
  }
  
  @scala.inline
  implicit class TestAttachmentRequestModelMutableBuilder[Self <: TestAttachmentRequestModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentType(value: String): Self = StObject.set(x, "attachmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStream(value: String): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
