package typings.wixStyleReact.anon

import typings.wixStyleReact.distTypesCommonMod.IconElement
import typings.wixStyleReact.wixStyleReactStrings.inverted
import typings.wixStyleReact.wixStyleReactStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisabledOnClick extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  def onClick(): Unit
  
  var prefixIcon: js.UndefOr[IconElement] = js.undefined
  
  var skin: js.UndefOr[standard | inverted] = js.undefined
  
  var suffixIcon: js.UndefOr[IconElement] = js.undefined
  
  var text: String
}
object DisabledOnClick {
  
  inline def apply(onClick: () => Unit, text: String): DisabledOnClick = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledOnClick]
  }
  
  extension [Self <: DisabledOnClick](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    inline def setPrefixIcon(value: IconElement): Self = StObject.set(x, "prefixIcon", value.asInstanceOf[js.Any])
    
    inline def setPrefixIconUndefined: Self = StObject.set(x, "prefixIcon", js.undefined)
    
    inline def setSkin(value: standard | inverted): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    
    inline def setSuffixIcon(value: IconElement): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
    
    inline def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
