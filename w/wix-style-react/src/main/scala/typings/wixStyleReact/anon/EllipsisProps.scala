package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EllipsisProps[T] extends StObject {
  
  var componentProps: T
  
  var ellipsisProps: typings.wixStyleReact.distTypesCommonEllipsisMod.EllipsisProps
}
object EllipsisProps {
  
  inline def apply[T](componentProps: T, ellipsisProps: typings.wixStyleReact.distTypesCommonEllipsisMod.EllipsisProps): EllipsisProps[T] = {
    val __obj = js.Dynamic.literal(componentProps = componentProps.asInstanceOf[js.Any], ellipsisProps = ellipsisProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipsisProps[T]]
  }
  
  extension [Self <: EllipsisProps[?], T](x: Self & EllipsisProps[T]) {
    
    inline def setComponentProps(value: T): Self = StObject.set(x, "componentProps", value.asInstanceOf[js.Any])
    
    inline def setEllipsisProps(value: typings.wixStyleReact.distTypesCommonEllipsisMod.EllipsisProps): Self = StObject.set(x, "ellipsisProps", value.asInstanceOf[js.Any])
  }
}
