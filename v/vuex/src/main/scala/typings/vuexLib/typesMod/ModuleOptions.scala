package typings
package vuexLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleOptions extends js.Object {
  var preserveState: js.UndefOr[scala.Boolean] = js.undefined
}

object ModuleOptions {
  @scala.inline
  def apply(preserveState: js.UndefOr[scala.Boolean] = js.undefined): ModuleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preserveState)) __obj.updateDynamic("preserveState")(preserveState)
    __obj.asInstanceOf[ModuleOptions]
  }
}

