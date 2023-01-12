package typings.wordpressComponents.anon

import typings.wordpressComponents.cardMod.Card.CardSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Elevation[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typings.wordpressComponents.wordpressComponentsStrings.a, typings.wordpressComponents.wordpressComponentsStrings.abbr, typings.wordpressComponents.wordpressComponentsStrings.address */ Any */] extends StObject {
  
  /**
    * Render as a different element type
    */
  var as: js.UndefOr[T] = js.undefined
  
  /**
    * `className` of the container.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Size of the elevation shadow, based on the Style system’s elevation
    * system. This may be helpful in highlighting certain content. For more
    * information, check out [Elevation]{@link https://developer.wordpress.org/block-editor/designers-developers/developers/components/elevation/}.
    *
    * @defaultValue 0
    */
  var elevation: js.UndefOr[Double] = js.undefined
  
  /**
    * Renders without a border.
    *
    * @defaultValue false
    */
  var isBorderless: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Renders an elevated card.
    *
    * @deprecated Use `elevation={2}` instead.
    */
  var isElevated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Renders with rounded corners.
    *
    * @defaultValue false
    */
  var isRounded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines the amount of padding within the card.
    *
    * @defaultValue "medium"
    */
  var size: js.UndefOr[CardSize] = js.undefined
}
object Elevation {
  
  inline def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typings.wordpressComponents.wordpressComponentsStrings.a, typings.wordpressComponents.wordpressComponentsStrings.abbr, typings.wordpressComponents.wordpressComponentsStrings.address */ Any */](): Elevation[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Elevation[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Elevation[?], T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typings.wordpressComponents.wordpressComponentsStrings.a, typings.wordpressComponents.wordpressComponentsStrings.abbr, typings.wordpressComponents.wordpressComponentsStrings.address */ Any */] (val x: Self & Elevation[T]) extends AnyVal {
    
    inline def setAs(value: T): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
    
    inline def setIsBorderless(value: Boolean): Self = StObject.set(x, "isBorderless", value.asInstanceOf[js.Any])
    
    inline def setIsBorderlessUndefined: Self = StObject.set(x, "isBorderless", js.undefined)
    
    inline def setIsElevated(value: Boolean): Self = StObject.set(x, "isElevated", value.asInstanceOf[js.Any])
    
    inline def setIsElevatedUndefined: Self = StObject.set(x, "isElevated", js.undefined)
    
    inline def setIsRounded(value: Boolean): Self = StObject.set(x, "isRounded", value.asInstanceOf[js.Any])
    
    inline def setIsRoundedUndefined: Self = StObject.set(x, "isRounded", js.undefined)
    
    inline def setSize(value: CardSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
