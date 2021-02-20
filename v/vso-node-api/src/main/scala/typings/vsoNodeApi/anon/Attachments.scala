package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attachments extends StObject {
  
  var attachments: scala.Double = js.native
  
  var custom: scala.Double = js.native
  
  var history: scala.Double = js.native
  
  var links: scala.Double = js.native
}
object Attachments {
  
  @scala.inline
  def apply(attachments: scala.Double, custom: scala.Double, history: scala.Double, links: scala.Double): Attachments = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachments]
  }
  
  @scala.inline
  implicit class AttachmentsMutableBuilder[Self <: Attachments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: scala.Double): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom(value: scala.Double): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistory(value: scala.Double): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: scala.Double): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
  }
}
