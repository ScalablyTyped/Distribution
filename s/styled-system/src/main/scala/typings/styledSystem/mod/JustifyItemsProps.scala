package typings.styledSystem.mod

import typings.csstype.mod.Property.JustifyItems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JustifyItemsProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The CSS justify-items property defines the default justify-self for all items of the box, giving them all
    * a default way of justifying each box along the appropriate axis.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-items)
    */
  var justifyItems: js.UndefOr[ResponsiveValue[JustifyItems, ThemeType]] = js.undefined
}
object JustifyItemsProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): JustifyItemsProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifyItemsProps[ThemeType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JustifyItemsProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & JustifyItemsProps[ThemeType]) extends AnyVal {
    
    inline def setJustifyItems(value: ResponsiveValue[JustifyItems, ThemeType]): Self = StObject.set(x, "justifyItems", value.asInstanceOf[js.Any])
    
    inline def setJustifyItemsNull: Self = StObject.set(x, "justifyItems", null)
    
    inline def setJustifyItemsUndefined: Self = StObject.set(x, "justifyItems", js.undefined)
    
    inline def setJustifyItemsVarargs(value: (JustifyItems | Null)*): Self = StObject.set(x, "justifyItems", js.Array(value*))
  }
}
