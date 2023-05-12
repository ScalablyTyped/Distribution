package typings.tonicUiReact.mod

import typings.tonicUiReact.tonicUiReactStrings.default
import typings.tonicUiReact.tonicUiReactStrings.emphasis
import typings.tonicUiReact.tonicUiReactStrings.ghost
import typings.tonicUiReact.tonicUiReactStrings.lg
import typings.tonicUiReact.tonicUiReactStrings.md
import typings.tonicUiReact.tonicUiReactStrings.primary
import typings.tonicUiReact.tonicUiReactStrings.secondary
import typings.tonicUiReact.tonicUiReactStrings.sm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonProps
  extends StObject
     with TonicHTMLButtonProps {
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[sm | md | lg | Double] = js.undefined
  
  var variant: js.UndefOr[emphasis | primary | default | secondary | ghost] = js.undefined
}
object ButtonProps {
  
  inline def apply(): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSize(value: sm | md | lg | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setVariant(value: emphasis | primary | default | secondary | ghost): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
