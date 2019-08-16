package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.BorderBottomWidthProperty
import typings.csstype.csstypeMod.BorderLeftWidthProperty
import typings.csstype.csstypeMod.BorderRightWidthProperty
import typings.csstype.csstypeMod.BorderTopWidthProperty
import typings.csstype.csstypeMod.BorderWidthProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderWidthProps[TLength] extends js.Object {
  /**
    * The border-bottom-width CSS property sets the width of the bottom border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-width)
    */
  var borderBottomWidth: js.UndefOr[ResponsiveValue[BorderBottomWidthProperty[TLength]]] = js.undefined
  /**
    * The border-left-width CSS property sets the width of the left border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-width)
    */
  var borderLeftWidth: js.UndefOr[ResponsiveValue[BorderLeftWidthProperty[TLength]]] = js.undefined
  /**
    * The border-right-width CSS property sets the width of the right border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-width)
    */
  var borderRightWidth: js.UndefOr[ResponsiveValue[BorderRightWidthProperty[TLength]]] = js.undefined
  /**
    * The border-top-width CSS property sets the width of the top border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-width)
    */
  var borderTopWidth: js.UndefOr[ResponsiveValue[BorderTopWidthProperty[TLength]]] = js.undefined
  /**
    * The border-width shorthand CSS property sets the width of all sides of an element's border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-width)
    */
  var borderWidth: js.UndefOr[ResponsiveValue[BorderWidthProperty[TLength]]] = js.undefined
}

object BorderWidthProps {
  @scala.inline
  def apply[TLength](
    borderBottomWidth: ResponsiveValue[BorderBottomWidthProperty[TLength]] = null,
    borderLeftWidth: ResponsiveValue[BorderLeftWidthProperty[TLength]] = null,
    borderRightWidth: ResponsiveValue[BorderRightWidthProperty[TLength]] = null,
    borderTopWidth: ResponsiveValue[BorderTopWidthProperty[TLength]] = null,
    borderWidth: ResponsiveValue[BorderWidthProperty[TLength]] = null
  ): BorderWidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (borderBottomWidth != null) __obj.updateDynamic("borderBottomWidth")(borderBottomWidth.asInstanceOf[js.Any])
    if (borderLeftWidth != null) __obj.updateDynamic("borderLeftWidth")(borderLeftWidth.asInstanceOf[js.Any])
    if (borderRightWidth != null) __obj.updateDynamic("borderRightWidth")(borderRightWidth.asInstanceOf[js.Any])
    if (borderTopWidth != null) __obj.updateDynamic("borderTopWidth")(borderTopWidth.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderWidthProps[TLength]]
  }
}

