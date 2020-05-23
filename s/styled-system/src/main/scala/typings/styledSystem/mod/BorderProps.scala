package typings.styledSystem.mod

import typings.csstype.mod.BorderBottomProperty
import typings.csstype.mod.BorderLeftProperty
import typings.csstype.mod.BorderRightProperty
import typings.csstype.mod.BorderTopProperty
import typings.styledSystem.styledSystemStrings.borderWidths
import typings.styledSystem.styledSystemStrings.colors
import typings.styledSystem.styledSystemStrings.radii
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal]
  extends BorderWidthProps[ThemeType, ThemeValue[borderWidths, ThemeType, js.Any]]
     with BorderStyleProps[ThemeType]
     with BorderColorProps[ThemeType, ThemeValue[colors, ThemeType, js.Any]]
     with BorderRadiusProps[ThemeType, ThemeValue[radii, ThemeType, js.Any]]
     with BorderTopProps[ThemeType, BorderTopProperty[TLengthStyledSystem]]
     with BorderRightProps[ThemeType, BorderRightProperty[TLengthStyledSystem]]
     with BorderBottomProps[ThemeType, BorderBottomProperty[TLengthStyledSystem]]
     with BorderLeftProps[ThemeType, BorderLeftProperty[TLengthStyledSystem]] {
  /**
    * The border CSS property sets an element's border. It's a shorthand for border-width, border-style,
    * and border-color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border)
    */
  var border: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  var borderX: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  var borderY: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

