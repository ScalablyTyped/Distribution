package typings
package webpackDashChainLib.webpackDashChainMod.ConfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chained[Parent]
  extends webpackDashChainLib.webpackDashChainMod.underscoreUnderscoreConfigNs.Chained[Parent]

object Chained {
  @scala.inline
  def apply[Parent](end: () => Parent): Chained[Parent] = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end))
  
    __obj.asInstanceOf[Chained[Parent]]
  }
}

