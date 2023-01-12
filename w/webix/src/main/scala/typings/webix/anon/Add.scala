package typings.webix.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Add extends StObject {
  
  var add: String
  
  var assign: String
  
  var attachments: String
  
  var color: String
  
  var edit: String
  
  var status: String
  
  var tags: String
  
  var text: String
  
  var upload: String
}
object Add {
  
  inline def apply(
    add: String,
    assign: String,
    attachments: String,
    color: String,
    edit: String,
    status: String,
    tags: String,
    text: String,
    upload: String
  ): Add = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], assign = assign.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Add]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Add] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: String): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAssign(value: String): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
    
    inline def setAttachments(value: String): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setEdit(value: String): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setUpload(value: String): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
  }
}
