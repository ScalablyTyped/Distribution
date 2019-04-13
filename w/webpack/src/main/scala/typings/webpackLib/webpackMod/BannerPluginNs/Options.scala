package typings
package webpackLib.webpackMod.BannerPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var banner: java.lang.String
  var entryOnly: js.UndefOr[scala.Boolean] = js.undefined
  var exclude: js.UndefOr[Filter | js.Array[Filter]] = js.undefined
  var include: js.UndefOr[Filter | js.Array[Filter]] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var test: js.UndefOr[Filter | js.Array[Filter]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    banner: java.lang.String,
    entryOnly: js.UndefOr[scala.Boolean] = js.undefined,
    exclude: Filter | js.Array[Filter] = null,
    include: Filter | js.Array[Filter] = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    test: Filter | js.Array[Filter] = null
  ): Options = {
    val __obj = js.Dynamic.literal(banner = banner)
    if (!js.isUndefined(entryOnly)) __obj.updateDynamic("entryOnly")(entryOnly)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

