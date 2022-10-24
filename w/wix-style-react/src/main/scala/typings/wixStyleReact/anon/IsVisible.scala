package typings.wixStyleReact.anon

import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsVisible extends StObject {
  
  var component: Validator[js.Function1[/* repeated */ Any, Any]]
  
  var isVisible: Validator[Boolean]
}
object IsVisible {
  
  inline def apply(component: Validator[js.Function1[/* repeated */ Any, Any]], isVisible: Validator[Boolean]): IsVisible = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsVisible]
  }
  
  extension [Self <: IsVisible](x: Self) {
    
    inline def setComponent(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setIsVisible(value: Validator[Boolean]): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
  }
}
