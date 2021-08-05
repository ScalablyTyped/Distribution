package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wix-style-react.wix-style-react/dist/es/src/Card.CardProps> */
trait PartialCardProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var controls: js.UndefOr[ReactNode] = js.undefined
  
  var dataHook: js.UndefOr[String] = js.undefined
  
  var hideOverflow: js.UndefOr[Boolean] = js.undefined
  
  var showShadow: js.UndefOr[Boolean] = js.undefined
  
  var stretchVertically: js.UndefOr[Boolean] = js.undefined
}
object PartialCardProps {
  
  inline def apply(): PartialCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCardProps]
  }
  
  extension [Self <: PartialCardProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setControls(value: ReactNode): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    inline def setHideOverflow(value: Boolean): Self = StObject.set(x, "hideOverflow", value.asInstanceOf[js.Any])
    
    inline def setHideOverflowUndefined: Self = StObject.set(x, "hideOverflow", js.undefined)
    
    inline def setShowShadow(value: Boolean): Self = StObject.set(x, "showShadow", value.asInstanceOf[js.Any])
    
    inline def setShowShadowUndefined: Self = StObject.set(x, "showShadow", js.undefined)
    
    inline def setStretchVertically(value: Boolean): Self = StObject.set(x, "stretchVertically", value.asInstanceOf[js.Any])
    
    inline def setStretchVerticallyUndefined: Self = StObject.set(x, "stretchVertically", js.undefined)
  }
}
