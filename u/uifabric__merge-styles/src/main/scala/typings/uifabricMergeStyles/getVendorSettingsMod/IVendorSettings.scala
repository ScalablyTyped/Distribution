package typings.uifabricMergeStyles.getVendorSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVendorSettings extends js.Object {
  var isMoz: js.UndefOr[Boolean] = js.undefined
  var isMs: js.UndefOr[Boolean] = js.undefined
  var isOpera: js.UndefOr[Boolean] = js.undefined
  var isWebkit: js.UndefOr[Boolean] = js.undefined
}

object IVendorSettings {
  @scala.inline
  def apply(
    isMoz: js.UndefOr[Boolean] = js.undefined,
    isMs: js.UndefOr[Boolean] = js.undefined,
    isOpera: js.UndefOr[Boolean] = js.undefined,
    isWebkit: js.UndefOr[Boolean] = js.undefined
  ): IVendorSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isMoz)) __obj.updateDynamic("isMoz")(isMoz.asInstanceOf[js.Any])
    if (!js.isUndefined(isMs)) __obj.updateDynamic("isMs")(isMs.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpera)) __obj.updateDynamic("isOpera")(isOpera.asInstanceOf[js.Any])
    if (!js.isUndefined(isWebkit)) __obj.updateDynamic("isWebkit")(isWebkit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVendorSettings]
  }
}

