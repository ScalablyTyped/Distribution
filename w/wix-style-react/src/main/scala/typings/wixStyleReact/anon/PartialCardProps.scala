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
  
  @scala.inline
  def apply(): PartialCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCardProps]
  }
  
  @scala.inline
  implicit class PartialCardPropsMutableBuilder[Self <: PartialCardProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setControls(value: ReactNode): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    @scala.inline
    def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    @scala.inline
    def setHideOverflow(value: Boolean): Self = StObject.set(x, "hideOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideOverflowUndefined: Self = StObject.set(x, "hideOverflow", js.undefined)
    
    @scala.inline
    def setShowShadow(value: Boolean): Self = StObject.set(x, "showShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowShadowUndefined: Self = StObject.set(x, "showShadow", js.undefined)
    
    @scala.inline
    def setStretchVertically(value: Boolean): Self = StObject.set(x, "stretchVertically", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchVerticallyUndefined: Self = StObject.set(x, "stretchVertically", js.undefined)
  }
}
