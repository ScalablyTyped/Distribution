package typings.wixStyleReact.anon

import typings.wixStyleReact.ellipsisMod.EllipsisProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentProps[T] extends StObject {
  
  var componentProps: T
  
  var ellipsisProps: EllipsisProps
}
object ComponentProps {
  
  inline def apply[T](componentProps: T, ellipsisProps: EllipsisProps): ComponentProps[T] = {
    val __obj = js.Dynamic.literal(componentProps = componentProps.asInstanceOf[js.Any], ellipsisProps = ellipsisProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentProps[T]]
  }
  
  extension [Self <: ComponentProps[?], T](x: Self & ComponentProps[T]) {
    
    inline def setComponentProps(value: T): Self = StObject.set(x, "componentProps", value.asInstanceOf[js.Any])
    
    inline def setEllipsisProps(value: EllipsisProps): Self = StObject.set(x, "ellipsisProps", value.asInstanceOf[js.Any])
  }
}
