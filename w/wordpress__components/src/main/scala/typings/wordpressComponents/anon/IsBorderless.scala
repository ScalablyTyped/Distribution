package typings.wordpressComponents.anon

import typings.wordpressComponents.cardMod.Card.CardSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsBorderless[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.wordpressComponents.wordpressComponentsStrings.a, typings.wordpressComponents.wordpressComponentsStrings.abbr, typings.wordpressComponents.wordpressComponentsStrings.address */ Any */] extends StObject {
  
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
    * Add visual shading style.
    */
  var isShady: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[CardSize] = js.undefined
}
object IsBorderless {
  
  inline def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.wordpressComponents.wordpressComponentsStrings.a, typings.wordpressComponents.wordpressComponentsStrings.abbr, typings.wordpressComponents.wordpressComponentsStrings.address */ Any */](): IsBorderless[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsBorderless[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsBorderless[?], T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.wordpressComponents.wordpressComponentsStrings.a, typings.wordpressComponents.wordpressComponentsStrings.abbr, typings.wordpressComponents.wordpressComponentsStrings.address */ Any */] (val x: Self & IsBorderless[T]) extends AnyVal {
    
    inline def setAs(value: T): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setIsBorderless(value: Boolean): Self = StObject.set(x, "isBorderless", value.asInstanceOf[js.Any])
    
    inline def setIsBorderlessUndefined: Self = StObject.set(x, "isBorderless", js.undefined)
    
    inline def setIsShady(value: Boolean): Self = StObject.set(x, "isShady", value.asInstanceOf[js.Any])
    
    inline def setIsShadyUndefined: Self = StObject.set(x, "isShady", js.undefined)
    
    inline def setSize(value: CardSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
