package typings
package xmldocLib.xmldocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlOptions extends js.Object {
  var compressed: js.UndefOr[scala.Boolean] = js.undefined
  var html: js.UndefOr[scala.Boolean] = js.undefined
  var preserveWhitespace: js.UndefOr[scala.Boolean] = js.undefined
  var trimmed: js.UndefOr[scala.Boolean] = js.undefined
}

object XmlOptions {
  @scala.inline
  def apply(
    compressed: js.UndefOr[scala.Boolean] = js.undefined,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    preserveWhitespace: js.UndefOr[scala.Boolean] = js.undefined,
    trimmed: js.UndefOr[scala.Boolean] = js.undefined
  ): XmlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compressed)) __obj.updateDynamic("compressed")(compressed)
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (!js.isUndefined(preserveWhitespace)) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace)
    if (!js.isUndefined(trimmed)) __obj.updateDynamic("trimmed")(trimmed)
    __obj.asInstanceOf[XmlOptions]
  }
}

