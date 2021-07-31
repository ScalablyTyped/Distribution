package typings.wordpressComponents.anon

import typings.wordpressComponents.cardMod.Card.CardSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsElevated[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] extends StObject {
  
  /**
    * Render as a different element type
    */
  var as: js.UndefOr[T] = js.undefined
  
  /**
    * `className` of the container.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Renders a borderless card.
    */
  var isBorderless: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Renders an elevated card.
    */
  var isElevated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines the amount of padding within the card.
    *
    * @defaultValue "medium"
    */
  var size: js.UndefOr[CardSize] = js.undefined
}
object IsElevated {
  
  @scala.inline
  def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */](): IsElevated[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsElevated[T]]
  }
  
  @scala.inline
  implicit class IsElevatedMutableBuilder[Self <: IsElevated[?], T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] (val x: Self & IsElevated[T]) extends AnyVal {
    
    @scala.inline
    def setAs(value: T): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setIsBorderless(value: Boolean): Self = StObject.set(x, "isBorderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBorderlessUndefined: Self = StObject.set(x, "isBorderless", js.undefined)
    
    @scala.inline
    def setIsElevated(value: Boolean): Self = StObject.set(x, "isElevated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsElevatedUndefined: Self = StObject.set(x, "isElevated", js.undefined)
    
    @scala.inline
    def setSize(value: CardSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
