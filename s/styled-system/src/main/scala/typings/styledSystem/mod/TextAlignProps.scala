package typings.styledSystem.mod

import typings.csstype.mod.TextAlignProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAlignProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The text-align CSS property specifies the horizontal alignment of an inline or table-cell box.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/text-align)
    */
  var textAlign: js.UndefOr[ResponsiveValue[TextAlignProperty, ThemeType]] = js.undefined
}

object TextAlignProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](textAlign: js.UndefOr[Null | (ResponsiveValue[TextAlignProperty, ThemeType])] = js.undefined): TextAlignProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(textAlign)) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAlignProps[ThemeType]]
  }
}

