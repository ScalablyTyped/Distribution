package typings
package webpackDashWatchedDashGlobDashEntriesDashPluginLib.webpackDashWatchedDashGlobDashEntriesDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginOptions extends js.Object {
  var basename_as_entry_name: js.UndefOr[scala.Boolean] = js.undefined
}

object PluginOptions {
  @scala.inline
  def apply(basename_as_entry_name: js.UndefOr[scala.Boolean] = js.undefined): PluginOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(basename_as_entry_name)) __obj.updateDynamic("basename_as_entry_name")(basename_as_entry_name)
    __obj.asInstanceOf[PluginOptions]
  }
}

