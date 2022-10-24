package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClickPrefixIcon extends StObject {
  
  var label: Requireable[String]
  
  var onClick: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var prefixIcon: Requireable[ReactNodeLike]
}
object OnClickPrefixIcon {
  
  inline def apply(
    label: Requireable[String],
    onClick: Requireable[js.Function1[/* repeated */ Any, Any]],
    prefixIcon: Requireable[ReactNodeLike]
  ): OnClickPrefixIcon = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], prefixIcon = prefixIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClickPrefixIcon]
  }
  
  extension [Self <: OnClickPrefixIcon](x: Self) {
    
    inline def setLabel(value: Requireable[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setPrefixIcon(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "prefixIcon", value.asInstanceOf[js.Any])
  }
}
