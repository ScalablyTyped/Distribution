package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuffixIcon extends StObject {
  
  var as: Requireable[String | js.Object]
  
  var disabled: Requireable[Boolean]
  
  var onClick: Validator[js.Function1[/* repeated */ Any, Any]]
  
  var prefixIcon: Requireable[ReactElementLike]
  
  var skin: Requireable[String]
  
  var suffixIcon: Requireable[ReactElementLike]
  
  var text: Validator[String]
}
object SuffixIcon {
  
  inline def apply(
    as: Requireable[String | js.Object],
    disabled: Requireable[Boolean],
    onClick: Validator[js.Function1[/* repeated */ Any, Any]],
    prefixIcon: Requireable[ReactElementLike],
    skin: Requireable[String],
    suffixIcon: Requireable[ReactElementLike],
    text: Validator[String]
  ): SuffixIcon = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], prefixIcon = prefixIcon.asInstanceOf[js.Any], skin = skin.asInstanceOf[js.Any], suffixIcon = suffixIcon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuffixIcon]
  }
  
  extension [Self <: SuffixIcon](x: Self) {
    
    inline def setAs(value: Requireable[String | js.Object]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Requireable[Boolean]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setPrefixIcon(value: Requireable[ReactElementLike]): Self = StObject.set(x, "prefixIcon", value.asInstanceOf[js.Any])
    
    inline def setSkin(value: Requireable[String]): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    inline def setSuffixIcon(value: Requireable[ReactElementLike]): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
    
    inline def setText(value: Validator[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
