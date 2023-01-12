package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachments extends StObject {
  
  var attachments: scala.Double
  
  var custom: scala.Double
  
  var history: scala.Double
  
  var links: scala.Double
}
object Attachments {
  
  inline def apply(attachments: scala.Double, custom: scala.Double, history: scala.Double, links: scala.Double): Attachments = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attachments] (val x: Self) extends AnyVal {
    
    inline def setAttachments(value: scala.Double): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setCustom(value: scala.Double): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setHistory(value: scala.Double): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: scala.Double): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
  }
}
