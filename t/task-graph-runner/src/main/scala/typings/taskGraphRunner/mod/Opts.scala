package typings.taskGraphRunner.mod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Opts[Item, Result] extends js.Object {
  var force: js.UndefOr[Boolean] = js.native
  var graph: Map[Item, js.Array[Item]] = js.native
  def task(item: Item): Result = js.native
}

object Opts {
  @scala.inline
  def apply[Item, Result](graph: Map[Item, js.Array[Item]], task: Item => Result): Opts[Item, Result] = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], task = js.Any.fromFunction1(task))
    __obj.asInstanceOf[Opts[Item, Result]]
  }
  @scala.inline
  implicit class OptsOps[Self <: Opts[_, _], Item, Result] (val x: Self with (Opts[Item, Result])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGraph(value: Map[Item, js.Array[Item]]): Self = this.set("graph", value.asInstanceOf[js.Any])
    @scala.inline
    def setTask(value: Item => Result): Self = this.set("task", js.Any.fromFunction1(value))
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
  }
  
}

