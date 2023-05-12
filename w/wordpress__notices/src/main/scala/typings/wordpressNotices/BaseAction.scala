package typings.wordpressNotices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseAction extends StObject {
  
  var label: String
}
object BaseAction {
  
  inline def apply(label: String): BaseAction = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseAction] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
