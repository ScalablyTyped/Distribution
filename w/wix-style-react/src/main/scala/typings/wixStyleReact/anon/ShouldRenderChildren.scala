package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShouldRenderChildren extends StObject {
  
  var shouldRenderChildren: Boolean
}
object ShouldRenderChildren {
  
  inline def apply(shouldRenderChildren: Boolean): ShouldRenderChildren = {
    val __obj = js.Dynamic.literal(shouldRenderChildren = shouldRenderChildren.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldRenderChildren]
  }
  
  extension [Self <: ShouldRenderChildren](x: Self) {
    
    inline def setShouldRenderChildren(value: Boolean): Self = StObject.set(x, "shouldRenderChildren", value.asInstanceOf[js.Any])
  }
}
