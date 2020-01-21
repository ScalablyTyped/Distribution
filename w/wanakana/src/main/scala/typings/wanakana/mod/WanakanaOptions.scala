package typings.wanakana.mod

import typings.std.Record
import typings.wanakana.wanakanaStrings.hepburn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WanakanaOptions extends js.Object {
  var IMEMode: js.UndefOr[IMEModes] = js.undefined
  var customKanaMapping: js.UndefOr[Record[String, String]] = js.undefined
  var customRomajiMapping: js.UndefOr[Record[String, String]] = js.undefined
  var passRomaji: js.UndefOr[Boolean] = js.undefined
  var romanization: js.UndefOr[hepburn] = js.undefined
  var upcaseKatakana: js.UndefOr[Boolean] = js.undefined
  var useObsoleteKana: js.UndefOr[Boolean] = js.undefined
}

object WanakanaOptions {
  @scala.inline
  def apply(
    IMEMode: IMEModes = null,
    customKanaMapping: Record[String, String] = null,
    customRomajiMapping: Record[String, String] = null,
    passRomaji: js.UndefOr[Boolean] = js.undefined,
    romanization: hepburn = null,
    upcaseKatakana: js.UndefOr[Boolean] = js.undefined,
    useObsoleteKana: js.UndefOr[Boolean] = js.undefined
  ): WanakanaOptions = {
    val __obj = js.Dynamic.literal()
    if (IMEMode != null) __obj.updateDynamic("IMEMode")(IMEMode.asInstanceOf[js.Any])
    if (customKanaMapping != null) __obj.updateDynamic("customKanaMapping")(customKanaMapping.asInstanceOf[js.Any])
    if (customRomajiMapping != null) __obj.updateDynamic("customRomajiMapping")(customRomajiMapping.asInstanceOf[js.Any])
    if (!js.isUndefined(passRomaji)) __obj.updateDynamic("passRomaji")(passRomaji.asInstanceOf[js.Any])
    if (romanization != null) __obj.updateDynamic("romanization")(romanization.asInstanceOf[js.Any])
    if (!js.isUndefined(upcaseKatakana)) __obj.updateDynamic("upcaseKatakana")(upcaseKatakana.asInstanceOf[js.Any])
    if (!js.isUndefined(useObsoleteKana)) __obj.updateDynamic("useObsoleteKana")(useObsoleteKana.asInstanceOf[js.Any])
    __obj.asInstanceOf[WanakanaOptions]
  }
}

