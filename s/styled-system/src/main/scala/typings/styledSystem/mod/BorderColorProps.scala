package typings.styledSystem.mod

import typings.csstype.mod.BorderBottomColorProperty
import typings.csstype.mod.BorderColorProperty
import typings.csstype.mod.BorderLeftColorProperty
import typings.csstype.mod.BorderRightColorProperty
import typings.csstype.mod.BorderTopColorProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderColorProps extends js.Object {
  /**
    * The border-bottom-color CSS property sets the color of an element's bottom border. It can also be set with the shorthand CSS properties border-color or border-bottom.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-color)
    */
  var borderBottomColor: js.UndefOr[ResponsiveValue[BorderBottomColorProperty]] = js.undefined
  /**
    * The border-color shorthand CSS property sets the color of all sides of an element's border.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-color)
    */
  var borderColor: js.UndefOr[ResponsiveValue[BorderColorProperty]] = js.undefined
  /**
    * The border-left-color CSS property sets the color of an element's left border. It can also be set with the shorthand CSS properties border-color or border-left.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-color)
    */
  var borderLeftColor: js.UndefOr[ResponsiveValue[BorderLeftColorProperty]] = js.undefined
  /**
    * The border-right-color CSS property sets the color of an element's right border. It can also be set with the shorthand CSS properties border-color or border-right.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-color)
    */
  var borderRightColor: js.UndefOr[ResponsiveValue[BorderRightColorProperty]] = js.undefined
  /**
    * The border-top-color CSS property sets the color of an element's top border. It can also be set with the shorthand CSS properties border-color or border-top.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-color)
    */
  var borderTopColor: js.UndefOr[ResponsiveValue[BorderTopColorProperty]] = js.undefined
}

object BorderColorProps {
  @scala.inline
  def apply(
    borderBottomColor: ResponsiveValue[BorderBottomColorProperty] = null,
    borderColor: ResponsiveValue[BorderColorProperty] = null,
    borderLeftColor: ResponsiveValue[BorderLeftColorProperty] = null,
    borderRightColor: ResponsiveValue[BorderRightColorProperty] = null,
    borderTopColor: ResponsiveValue[BorderTopColorProperty] = null
  ): BorderColorProps = {
    val __obj = js.Dynamic.literal()
    if (borderBottomColor != null) __obj.updateDynamic("borderBottomColor")(borderBottomColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderLeftColor != null) __obj.updateDynamic("borderLeftColor")(borderLeftColor.asInstanceOf[js.Any])
    if (borderRightColor != null) __obj.updateDynamic("borderRightColor")(borderRightColor.asInstanceOf[js.Any])
    if (borderTopColor != null) __obj.updateDynamic("borderTopColor")(borderTopColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColorProps]
  }
}

