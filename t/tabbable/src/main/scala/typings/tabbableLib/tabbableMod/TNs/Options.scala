package typings
package tabbableLib.tabbableMod.TNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var includeContainer: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(includeContainer: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeContainer)) __obj.updateDynamic("includeContainer")(includeContainer)
    __obj.asInstanceOf[Options]
  }
}

