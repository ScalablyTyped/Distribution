package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachment extends StObject {
  
  var attachment: scala.Double
  
  var changeEntry: scala.Double
}
object Attachment {
  
  @scala.inline
  def apply(attachment: scala.Double, changeEntry: scala.Double): Attachment = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], changeEntry = changeEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  
  @scala.inline
  implicit class AttachmentMutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachment(value: scala.Double): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeEntry(value: scala.Double): Self = StObject.set(x, "changeEntry", value.asInstanceOf[js.Any])
  }
}
