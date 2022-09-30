package typings.wordpressComponents.anon

import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`[T /* <: ElementType[Any] */] extends StObject {
  
  var as: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ Any
  ] = js.undefined
}
object `3` {
  
  inline def apply[T /* <: ElementType[Any] */](): `3`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3`[T]]
  }
  
  extension [Self <: `3`[?], T /* <: ElementType[Any] */](x: Self & `3`[T]) {
    
    inline def setAs(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
  }
}
