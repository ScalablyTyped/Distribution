package typings
package xmlbuilderLib.xmlbuilderMod.xmlbuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLCreateOptions extends js.Object {
  var headless: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreDecorators: js.UndefOr[scala.Boolean] = js.undefined
  var keepNullAttributes: js.UndefOr[scala.Boolean] = js.undefined
  var keepNullNodes: js.UndefOr[scala.Boolean] = js.undefined
  var noDoubleEncoding: js.UndefOr[scala.Boolean] = js.undefined
  var separateArrayItems: js.UndefOr[scala.Boolean] = js.undefined
  var stringify: js.UndefOr[XMLStringifier] = js.undefined
}

object XMLCreateOptions {
  @scala.inline
  def apply(
    headless: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreDecorators: js.UndefOr[scala.Boolean] = js.undefined,
    keepNullAttributes: js.UndefOr[scala.Boolean] = js.undefined,
    keepNullNodes: js.UndefOr[scala.Boolean] = js.undefined,
    noDoubleEncoding: js.UndefOr[scala.Boolean] = js.undefined,
    separateArrayItems: js.UndefOr[scala.Boolean] = js.undefined,
    stringify: XMLStringifier = null
  ): XMLCreateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(headless)) __obj.updateDynamic("headless")(headless)
    if (!js.isUndefined(ignoreDecorators)) __obj.updateDynamic("ignoreDecorators")(ignoreDecorators)
    if (!js.isUndefined(keepNullAttributes)) __obj.updateDynamic("keepNullAttributes")(keepNullAttributes)
    if (!js.isUndefined(keepNullNodes)) __obj.updateDynamic("keepNullNodes")(keepNullNodes)
    if (!js.isUndefined(noDoubleEncoding)) __obj.updateDynamic("noDoubleEncoding")(noDoubleEncoding)
    if (!js.isUndefined(separateArrayItems)) __obj.updateDynamic("separateArrayItems")(separateArrayItems)
    if (stringify != null) __obj.updateDynamic("stringify")(stringify)
    __obj.asInstanceOf[XMLCreateOptions]
  }
}

