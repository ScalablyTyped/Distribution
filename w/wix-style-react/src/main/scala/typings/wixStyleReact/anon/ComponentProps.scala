package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentProps extends StObject {
  
  var componentProps: Any
  
  var ellipsisProps: Any
}
object ComponentProps {
  
  inline def apply(componentProps: Any, ellipsisProps: Any): ComponentProps = {
    val __obj = js.Dynamic.literal(componentProps = componentProps.asInstanceOf[js.Any], ellipsisProps = ellipsisProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentProps]
  }
  
  extension [Self <: ComponentProps](x: Self) {
    
    inline def setComponentProps(value: Any): Self = StObject.set(x, "componentProps", value.asInstanceOf[js.Any])
    
    inline def setEllipsisProps(value: Any): Self = StObject.set(x, "ellipsisProps", value.asInstanceOf[js.Any])
  }
}
