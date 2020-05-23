package typings.wordpressBlockEditor.contrastCheckerMod.ContrastChecker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var fallbackBackgroundColor: js.UndefOr[String] = js.undefined
  var fallbackTextColor: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var isLargeText: js.UndefOr[Boolean] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    fallbackBackgroundColor: String = null,
    fallbackTextColor: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    isLargeText: js.UndefOr[Boolean] = js.undefined,
    textColor: String = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (fallbackBackgroundColor != null) __obj.updateDynamic("fallbackBackgroundColor")(fallbackBackgroundColor.asInstanceOf[js.Any])
    if (fallbackTextColor != null) __obj.updateDynamic("fallbackTextColor")(fallbackTextColor.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isLargeText)) __obj.updateDynamic("isLargeText")(isLargeText.get.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

