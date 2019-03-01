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

object Opts {
  @scala.inline
  def apply[Item, Result](
    graph: stdLib.Map[Item, js.Array[Item]],
    task: js.Function1[Item, Result],
    force: js.UndefOr[scala.Boolean] = js.undefined
  ): Opts[Item, Result] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("graph")(graph)
    __obj.updateDynamic("task")(task)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[Opts[Item, Result]]
  }
}

