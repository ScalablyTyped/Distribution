package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Props extends StObject {
  
  var Component: Any
  
  var props: js.UndefOr[js.Object] = js.undefined
  
  var skins: Any
}
object Props {
  
  inline def apply(Component: Any, skins: Any): Props = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], skins = skins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  extension [Self <: Props](x: Self) {
    
    inline def setComponent(value: Any): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setProps(value: js.Object): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    
    inline def setSkins(value: Any): Self = StObject.set(x, "skins", value.asInstanceOf[js.Any])
  }
}
