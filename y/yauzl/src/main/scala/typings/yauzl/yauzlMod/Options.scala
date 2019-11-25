package typings.yauzl.yauzlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoClose: js.UndefOr[Boolean] = js.undefined
  var decodeStrings: js.UndefOr[Boolean] = js.undefined
  var lazyEntries: js.UndefOr[Boolean] = js.undefined
  var strictFileNames: js.UndefOr[Boolean] = js.undefined
  var validateEntrySizes: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[Boolean] = js.undefined,
    decodeStrings: js.UndefOr[Boolean] = js.undefined,
    lazyEntries: js.UndefOr[Boolean] = js.undefined,
    strictFileNames: js.UndefOr[Boolean] = js.undefined,
    validateEntrySizes: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyEntries)) __obj.updateDynamic("lazyEntries")(lazyEntries.asInstanceOf[js.Any])
    if (!js.isUndefined(strictFileNames)) __obj.updateDynamic("strictFileNames")(strictFileNames.asInstanceOf[js.Any])
    if (!js.isUndefined(validateEntrySizes)) __obj.updateDynamic("validateEntrySizes")(validateEntrySizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

