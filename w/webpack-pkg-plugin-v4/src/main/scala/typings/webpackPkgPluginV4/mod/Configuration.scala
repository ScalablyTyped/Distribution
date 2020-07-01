package typings.webpackPkgPluginV4.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var output: String
  var targets: js.UndefOr[js.Array[String]] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(output: String, targets: js.Array[String] = null): Configuration = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

