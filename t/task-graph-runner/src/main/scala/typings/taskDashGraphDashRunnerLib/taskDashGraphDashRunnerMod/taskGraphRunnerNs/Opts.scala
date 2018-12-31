package typings
package taskDashGraphDashRunnerLib.taskDashGraphDashRunnerMod.taskGraphRunnerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opts[Item, Result] extends js.Object {
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var graph: stdLib.Map[Item, js.Array[Item]]
  def task(item: Item): Result
}

