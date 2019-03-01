package typings
package telebotLib.telebotMod.telebotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait module extends js.Object {
  var defaultConfig: js.Any
  var id: java.lang.String
  def plugin(args: js.Any*): scala.Unit
}

object module {
  @scala.inline
  def apply(
    defaultConfig: js.Any,
    id: java.lang.String,
    plugin: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): module = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultConfig")(defaultConfig)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("plugin")(plugin)
    __obj.asInstanceOf[module]
  }
}

