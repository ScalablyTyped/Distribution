package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineHeightProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The line-height CSS property sets the amount of space used for lines, such as in text. On block-level elements,
    * it specifies the minimum height of line boxes within the element.
    *
    * On non-replaced inline elements, it specifies the height that is used to calculate line box height.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/line-height)
    */
  var lineHeight: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object LineHeightProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): LineHeightProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineHeightProps[ThemeType, TVal]]
  }
  
  extension [Self <: LineHeightProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](x: Self & (LineHeightProps[ThemeType, TVal])) {
    
    inline def setLineHeight(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightNull: Self = StObject.set(x, "lineHeight", null)
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setLineHeightVarargs(value: (TVal | Null)*): Self = StObject.set(x, "lineHeight", js.Array(value :_*))
  }
}
