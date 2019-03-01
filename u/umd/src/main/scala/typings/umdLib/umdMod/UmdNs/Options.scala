package typings
package umdLib.umdMod.UmdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var commonJS: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(commonJS: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(commonJS)) __obj.updateDynamic("commonJS")(commonJS)
    __obj.asInstanceOf[Options]
  }
}

