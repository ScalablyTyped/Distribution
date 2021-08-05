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
  
  inline def apply(title: String): MessageActionItem = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageActionItem]
  }
  
  extension [Self <: MessageActionItem](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
