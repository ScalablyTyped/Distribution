package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyAttributesUntypedSetter
  extends StObject
     with ApplyAttributes[Any] {
  
  var attr: js.UndefOr[Attributes[Widget[Any], Any]] = js.undefined
  
  var children: js.UndefOr[Attributes[Widget[Any], Any]] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[scala.Nothing] = js.undefined
}
object ApplyAttributesUntypedSetter {
  
  inline def apply(): ApplyAttributesUntypedSetter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyAttributesUntypedSetter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplyAttributesUntypedSetter] (val x: Self) extends AnyVal {
    
    inline def setAttr(value: Attributes[Widget[Any], Any]): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
    
    inline def setChildren(value: Attributes[Widget[Any], Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
