package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Href extends StObject {
  
  var as: Requireable[ReactNodeLike]
  
  var href: Requireable[String]
  
  var label: Requireable[ReactNodeLike]
  
  var onClick: Requireable[js.Function1[/* repeated */ Any, Any]]
}
object Href {
  
  inline def apply(
    as: Requireable[ReactNodeLike],
    href: Requireable[String],
    label: Requireable[ReactNodeLike],
    onClick: Requireable[js.Function1[/* repeated */ Any, Any]]
  ): Href = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
  
  extension [Self <: Href](x: Self) {
    
    inline def setAs(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setHref(value: Requireable[String]): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
  }
}
