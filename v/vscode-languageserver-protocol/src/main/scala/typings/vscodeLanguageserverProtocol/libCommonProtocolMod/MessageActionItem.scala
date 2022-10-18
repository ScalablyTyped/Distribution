package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StringDictionary
import typings.vscodeLanguageserverTypes.mod.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageActionItem
  extends StObject
     with /**
  * Additional attributes that the client preserves and
  * sends back to the server. This depends on the client
  * capability window.messageActionItem.additionalPropertiesSupport
  */
/* key */ StringDictionary[String | Boolean | integer | js.Object] {
  
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
