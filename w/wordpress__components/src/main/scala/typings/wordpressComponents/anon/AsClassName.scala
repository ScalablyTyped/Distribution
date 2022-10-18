package typings.wordpressComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsClassName[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typings.wordpressComponents.wordpressComponentsStrings.a, typings.wordpressComponents.wordpressComponentsStrings.abbr, typings.wordpressComponents.wordpressComponentsStrings.address */ Any */] extends StObject {
  
  /**
    * Render as a different element type
    */
  var as: js.UndefOr[T] = js.undefined
  
  /**
    * `className` of the container.
    */
  var className: js.UndefOr[String] = js.undefined
}
object AsClassName {
  
  inline def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typings.wordpressComponents.wordpressComponentsStrings.a, typings.wordpressComponents.wordpressComponentsStrings.abbr, typings.wordpressComponents.wordpressComponentsStrings.address */ Any */](): AsClassName[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsClassName[T]]
  }
  
  extension [Self <: AsClassName[?], T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typings.wordpressComponents.wordpressComponentsStrings.a, typings.wordpressComponents.wordpressComponentsStrings.abbr, typings.wordpressComponents.wordpressComponentsStrings.address */ Any */](x: Self & AsClassName[T]) {
    
    inline def setAs(value: T): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
