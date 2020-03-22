package typings.uiBox.getClassNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyInfo extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var complexValue: js.UndefOr[Boolean] = js.undefined
  var cssName: js.UndefOr[String] = js.undefined
  var defaultUnit: js.UndefOr[String] = js.undefined
  var isPrefixed: js.UndefOr[Boolean] = js.undefined
  var jsName: js.UndefOr[String] = js.undefined
  var safeValue: js.UndefOr[Boolean] = js.undefined
}

object PropertyInfo {
  @scala.inline
  def apply(
    className: String = null,
    complexValue: js.UndefOr[Boolean] = js.undefined,
    cssName: String = null,
    defaultUnit: String = null,
    isPrefixed: js.UndefOr[Boolean] = js.undefined,
    jsName: String = null,
    safeValue: js.UndefOr[Boolean] = js.undefined
  ): PropertyInfo = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(complexValue)) __obj.updateDynamic("complexValue")(complexValue.asInstanceOf[js.Any])
    if (cssName != null) __obj.updateDynamic("cssName")(cssName.asInstanceOf[js.Any])
    if (defaultUnit != null) __obj.updateDynamic("defaultUnit")(defaultUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrefixed)) __obj.updateDynamic("isPrefixed")(isPrefixed.asInstanceOf[js.Any])
    if (jsName != null) __obj.updateDynamic("jsName")(jsName.asInstanceOf[js.Any])
    if (!js.isUndefined(safeValue)) __obj.updateDynamic("safeValue")(safeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyInfo]
  }
}

