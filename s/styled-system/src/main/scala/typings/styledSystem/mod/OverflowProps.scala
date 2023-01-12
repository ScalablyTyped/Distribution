package typings.styledSystem.mod

import typings.csstype.mod.Property.Overflow
import typings.csstype.mod.Property.OverflowX
import typings.csstype.mod.Property.OverflowY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverflowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The overflow CSS property sets what to do when an element's content is too big to fit in its block
    * formatting context. It is a shorthand for overflow-x and overflow-y.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow)
    */
  var overflow: js.UndefOr[ResponsiveValue[Overflow, ThemeType]] = js.undefined
  
  /**
    * The overflow-x CSS property sets what shows when content overflows a block-level element's left
    * and right edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-x)
    */
  var overflowX: js.UndefOr[ResponsiveValue[OverflowX, ThemeType]] = js.undefined
  
  /**
    * The overflow-y CSS property sets what shows when content overflows a block-level element's top
    * and bottom edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-y)
    */
  var overflowY: js.UndefOr[ResponsiveValue[OverflowY, ThemeType]] = js.undefined
}
object OverflowProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): OverflowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverflowProps[ThemeType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverflowProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & OverflowProps[ThemeType]) extends AnyVal {
    
    inline def setOverflow(value: ResponsiveValue[Overflow, ThemeType]): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowNull: Self = StObject.set(x, "overflow", null)
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def setOverflowVarargs(value: (Overflow | Null)*): Self = StObject.set(x, "overflow", js.Array(value*))
    
    inline def setOverflowX(value: ResponsiveValue[OverflowX, ThemeType]): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
    
    inline def setOverflowXNull: Self = StObject.set(x, "overflowX", null)
    
    inline def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
    
    inline def setOverflowXVarargs(value: (OverflowX | Null)*): Self = StObject.set(x, "overflowX", js.Array(value*))
    
    inline def setOverflowY(value: ResponsiveValue[OverflowY, ThemeType]): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
    
    inline def setOverflowYNull: Self = StObject.set(x, "overflowY", null)
    
    inline def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
    
    inline def setOverflowYVarargs(value: (OverflowY | Null)*): Self = StObject.set(x, "overflowY", js.Array(value*))
  }
}
