package typings
package vuexLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitOptions extends js.Object {
  var root: js.UndefOr[scala.Boolean] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object CommitOptions {
  @scala.inline
  def apply(root: js.UndefOr[scala.Boolean] = js.undefined, silent: js.UndefOr[scala.Boolean] = js.undefined): CommitOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[CommitOptions]
  }
}

