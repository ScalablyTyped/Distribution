package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestAttachmentRequestModel extends StObject {
  
  var attachmentType: String
  
  var comment: String
  
  var fileName: String
  
  var stream: String
}
object TestAttachmentRequestModel {
  
  inline def apply(attachmentType: String, comment: String, fileName: String, stream: String): TestAttachmentRequestModel = {
    val __obj = js.Dynamic.literal(attachmentType = attachmentType.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestAttachmentRequestModel]
  }
  
  extension [Self <: TestAttachmentRequestModel](x: Self) {
    
    inline def setAttachmentType(value: String): Self = StObject.set(x, "attachmentType", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setStream(value: String): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
