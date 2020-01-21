package typings.webpack.mod.BannerPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var banner: String
  var entryOnly: js.UndefOr[Boolean] = js.undefined
  var exclude: js.UndefOr[Filter | js.Array[Filter]] = js.undefined
  var include: js.UndefOr[Filter | js.Array[Filter]] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
  var test: js.UndefOr[Filter | js.Array[Filter]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    banner: String,
    entryOnly: js.UndefOr[Boolean] = js.undefined,
    exclude: Filter | js.Array[Filter] = null,
    include: Filter | js.Array[Filter] = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    test: Filter | js.Array[Filter] = null
  ): Options = {
    val __obj = js.Dynamic.literal(banner = banner.asInstanceOf[js.Any])
    if (!js.isUndefined(entryOnly)) __obj.updateDynamic("entryOnly")(entryOnly.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

