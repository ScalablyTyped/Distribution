package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestAttachment extends StObject {
  
  var attachmentType: AttachmentType
  
  var comment: String
  
  var createdDate: js.Date
  
  var fileName: String
  
  var id: Double
  
  var url: String
}
object TestAttachment {
  
  inline def apply(
    attachmentType: AttachmentType,
    comment: String,
    createdDate: js.Date,
    fileName: String,
    id: Double,
    url: String
  ): TestAttachment = {
    val __obj = js.Dynamic.literal(attachmentType = attachmentType.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestAttachment]
  }
  
  extension [Self <: TestAttachment](x: Self) {
    
    inline def setAttachmentType(value: AttachmentType): Self = StObject.set(x, "attachmentType", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
