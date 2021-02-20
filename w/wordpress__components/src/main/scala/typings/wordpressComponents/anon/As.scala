package typings.wordpressComponents.anon

import typings.wordpressComponents.cardMod.Card.CardSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait As[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] extends StObject {
  
  /**
    * Render as a different element type
    */
  var as: js.UndefOr[T] = js.native
  
  /**
    * `className` of the container.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Add visual shading style.
    */
  var isShady: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[CardSize] = js.native
}
object As {
  
  @scala.inline
  def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */](): As[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[As[T]]
  }
  
  @scala.inline
  implicit class AsMutableBuilder[Self <: As[_], T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] (val x: Self with As[T]) extends AnyVal {
    
    @scala.inline
    def setAs(value: T): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setIsShady(value: Boolean): Self = StObject.set(x, "isShady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsShadyUndefined: Self = StObject.set(x, "isShady", js.undefined)
    
    @scala.inline
    def setSize(value: CardSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
