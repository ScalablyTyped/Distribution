package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageActionItem extends StObject {
  
  /**
    * A short title like 'Retry', 'Open Log' etc.
    */
  var title: String
}
object MessageActionItem {
  
  @scala.inline
  def apply(title: String): MessageActionItem = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageActionItem]
  }
  
  @scala.inline
  implicit class MessageActionItemMutableBuilder[Self <: MessageActionItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
