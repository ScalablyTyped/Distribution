package typings.workerPlugin.mod

import typings.webpack.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var globalObject: js.UndefOr[Boolean | String] = js.undefined
  var plugins: js.UndefOr[js.Array[String | Plugin]] = js.undefined
}

object Options {
  @scala.inline
  def apply(globalObject: Boolean | String = null, plugins: js.Array[String | Plugin] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (globalObject != null) __obj.updateDynamic("globalObject")(globalObject.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

