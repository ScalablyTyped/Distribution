package typings.wixStyleReact.anon

import typings.reactTypesShared.srcDomMod.DOMAttributes
import typings.reactTypesShared.srcDomMod.FocusableElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusProps extends StObject {
  
  var focusProps: DOMAttributes[FocusableElement]
  
  var isFocusVisible: Boolean
}
object FocusProps {
  
  inline def apply(focusProps: DOMAttributes[FocusableElement], isFocusVisible: Boolean): FocusProps = {
    val __obj = js.Dynamic.literal(focusProps = focusProps.asInstanceOf[js.Any], isFocusVisible = isFocusVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusProps]
  }
  
  extension [Self <: FocusProps](x: Self) {
    
    inline def setFocusProps(value: DOMAttributes[FocusableElement]): Self = StObject.set(x, "focusProps", value.asInstanceOf[js.Any])
    
    inline def setIsFocusVisible(value: Boolean): Self = StObject.set(x, "isFocusVisible", value.asInstanceOf[js.Any])
  }
}
