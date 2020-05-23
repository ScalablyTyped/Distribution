package typings.styledSystem.mod

import typings.csstype.mod.BoxShadowProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxShadowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The box-shadow CSS property adds shadow effects around an element's frame. You can set multiple effects separated
    * by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii and color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/box-shadow)
    */
  var boxShadow: js.UndefOr[ResponsiveValue[BoxShadowProperty | Double, ThemeType]] = js.undefined
}

object BoxShadowProps {
  @scala.inline
  def apply[ThemeType](
    boxShadow: js.UndefOr[Null | (ResponsiveValue[BoxShadowProperty | Double, ThemeType])] = js.undefined
  ): BoxShadowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boxShadow)) __obj.updateDynamic("boxShadow")(boxShadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxShadowProps[ThemeType]]
  }
}

