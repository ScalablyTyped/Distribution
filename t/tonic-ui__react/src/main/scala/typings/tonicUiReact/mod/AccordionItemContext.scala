package typings.tonicUiReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccordionItemContext extends StObject {
  
  var bodyId: String
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var headerId: String
  
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  
  def onToggle(): Unit
  
  var variant: js.UndefOr[String] = js.undefined
}
object AccordionItemContext {
  
  inline def apply(bodyId: String, headerId: String, onToggle: () => Unit): AccordionItemContext = {
    val __obj = js.Dynamic.literal(bodyId = bodyId.asInstanceOf[js.Any], headerId = headerId.asInstanceOf[js.Any], onToggle = js.Any.fromFunction0(onToggle))
    __obj.asInstanceOf[AccordionItemContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccordionItemContext] (val x: Self) extends AnyVal {
    
    inline def setBodyId(value: String): Self = StObject.set(x, "bodyId", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHeaderId(value: String): Self = StObject.set(x, "headerId", value.asInstanceOf[js.Any])
    
    inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
    
    inline def setOnToggle(value: () => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction0(value))
    
    inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
