package typings.watch.mod

import typings.node.fsMod.Stats
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var filter: js.UndefOr[js.Function2[/* path */ String, /* stat */ Stats, Boolean]] = js.undefined
  var ignoreDirectoryPattern: js.UndefOr[RegExp] = js.undefined
  var ignoreDotFiles: js.UndefOr[Boolean] = js.undefined
  var ignoreNotPermitted: js.UndefOr[Boolean] = js.undefined
  var ignoreUnreadableDir: js.UndefOr[Boolean] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    filter: (/* path */ String, /* stat */ Stats) => Boolean = null,
    ignoreDirectoryPattern: RegExp = null,
    ignoreDotFiles: js.UndefOr[Boolean] = js.undefined,
    ignoreNotPermitted: js.UndefOr[Boolean] = js.undefined,
    ignoreUnreadableDir: js.UndefOr[Boolean] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (ignoreDirectoryPattern != null) __obj.updateDynamic("ignoreDirectoryPattern")(ignoreDirectoryPattern.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDotFiles)) __obj.updateDynamic("ignoreDotFiles")(ignoreDotFiles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreNotPermitted)) __obj.updateDynamic("ignoreNotPermitted")(ignoreNotPermitted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnreadableDir)) __obj.updateDynamic("ignoreUnreadableDir")(ignoreUnreadableDir.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

