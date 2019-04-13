package typings
package writeDashJsonDashFileLib.writeDashJsonDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var detectIndent: js.UndefOr[scala.Boolean] = js.undefined
  var indent: js.UndefOr[java.lang.String | scala.Double | scala.Null] = js.undefined
  var mode: js.UndefOr[scala.Double] = js.undefined
  var replacer: js.UndefOr[Replacer | (js.Array[scala.Double | java.lang.String]) | scala.Null] = js.undefined
  var sortKeys: js.UndefOr[
    scala.Boolean | (js.Function2[/* a */ java.lang.String, /* b */ java.lang.String, scala.Double])
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    detectIndent: js.UndefOr[scala.Boolean] = js.undefined,
    indent: java.lang.String | scala.Double = null,
    mode: scala.Int | scala.Double = null,
    replacer: Replacer | (js.Array[scala.Double | java.lang.String]) = null,
    sortKeys: scala.Boolean | (js.Function2[/* a */ java.lang.String, /* b */ java.lang.String, scala.Double]) = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detectIndent)) __obj.updateDynamic("detectIndent")(detectIndent)
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (replacer != null) __obj.updateDynamic("replacer")(replacer.asInstanceOf[js.Any])
    if (sortKeys != null) __obj.updateDynamic("sortKeys")(sortKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

