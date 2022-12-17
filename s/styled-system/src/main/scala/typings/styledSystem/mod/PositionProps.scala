package typings.styledSystem.mod

import typings.csstype.mod.Property.Bottom
import typings.csstype.mod.Property.Left
import typings.csstype.mod.Property.Position
import typings.csstype.mod.Property.Right
import typings.csstype.mod.Property.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends StObject
     with ZIndexProps[ThemeType]
     with TopProps[ThemeType, Top[TLengthStyledSystem]]
     with RightProps[ThemeType, Right[TLengthStyledSystem]]
     with BottomProps[ThemeType, Bottom[TLengthStyledSystem]]
     with LeftProps[ThemeType, Left[TLengthStyledSystem]] {
  
  /**
    * The position CSS property specifies how an element is positioned in a document.
    * The top, right, bottom, and left properties determine the final location of positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/position)
    */
  var position: js.UndefOr[ResponsiveValue[Position, ThemeType]] = js.undefined
}
object PositionProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): PositionProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionProps[ThemeType]]
  }
  
  extension [Self <: PositionProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & PositionProps[ThemeType]) {
    
    inline def setPosition(value: ResponsiveValue[Position, ThemeType]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPositionVarargs(value: (Position | Null)*): Self = StObject.set(x, "position", js.Array(value*))
  }
}
