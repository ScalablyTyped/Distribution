package typings
package webpackDashChainLib.webpackDashChainMod.underscoreUnderscoreConfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chained[Parent] extends js.Object {
  def end(): Parent
}

object Chained {
  @scala.inline
  def apply[Parent](end: js.Function0[Parent]): Chained[Parent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.asInstanceOf[Chained[Parent]]
  }
}

