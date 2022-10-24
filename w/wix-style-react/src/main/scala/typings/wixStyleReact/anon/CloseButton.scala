package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseButton extends StObject {
  
  var appearance: js.UndefOr[String] = js.undefined
  
  var closeButton: Any
  
  var newColorsBranding: js.UndefOr[Boolean] = js.undefined
  
  var onCancel: Any
  
  var theme: Any
  
  var title: Any
}
object CloseButton {
  
  inline def apply(closeButton: Any, onCancel: Any, theme: Any, title: Any): CloseButton = {
    val __obj = js.Dynamic.literal(closeButton = closeButton.asInstanceOf[js.Any], onCancel = onCancel.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseButton]
  }
  
  extension [Self <: CloseButton](x: Self) {
    
    inline def setAppearance(value: String): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
    
    inline def setCloseButton(value: Any): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setNewColorsBranding(value: Boolean): Self = StObject.set(x, "newColorsBranding", value.asInstanceOf[js.Any])
    
    inline def setNewColorsBrandingUndefined: Self = StObject.set(x, "newColorsBranding", js.undefined)
    
    inline def setOnCancel(value: Any): Self = StObject.set(x, "onCancel", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: Any): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
