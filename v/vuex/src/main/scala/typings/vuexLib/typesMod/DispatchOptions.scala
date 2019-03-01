package typings
package vuexLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DispatchOptions extends js.Object {
  var root: js.UndefOr[scala.Boolean] = js.undefined
}

object DispatchOptions {
  @scala.inline
  def apply(root: js.UndefOr[scala.Boolean] = js.undefined): DispatchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[DispatchOptions]
  }
}

