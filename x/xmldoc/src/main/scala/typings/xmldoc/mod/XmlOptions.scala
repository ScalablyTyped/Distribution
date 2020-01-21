package typings.xmldoc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlOptions extends js.Object {
  var compressed: js.UndefOr[Boolean] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var preserveWhitespace: js.UndefOr[Boolean] = js.undefined
  var trimmed: js.UndefOr[Boolean] = js.undefined
}

object XmlOptions {
  @scala.inline
  def apply(
    compressed: js.UndefOr[Boolean] = js.undefined,
    html: js.UndefOr[Boolean] = js.undefined,
    preserveWhitespace: js.UndefOr[Boolean] = js.undefined,
    trimmed: js.UndefOr[Boolean] = js.undefined
  ): XmlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compressed)) __obj.updateDynamic("compressed")(compressed.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveWhitespace)) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace.asInstanceOf[js.Any])
    if (!js.isUndefined(trimmed)) __obj.updateDynamic("trimmed")(trimmed.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlOptions]
  }
}

