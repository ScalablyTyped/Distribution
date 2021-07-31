package typings.wordpressComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] extends StObject {
  
  /**
    * Render as a different element type
    */
  var as: js.UndefOr[T] = js.undefined
  
  var children: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * `className` of the container.
    */
  var className: js.UndefOr[String] = js.undefined
}
object Children {
  
  @scala.inline
  def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */](): Children[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children[T]]
  }
  
  @scala.inline
  implicit class ChildrenMutableBuilder[Self <: Children[?], T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] (val x: Self & Children[T]) extends AnyVal {
    
    @scala.inline
    def setAs(value: T): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
