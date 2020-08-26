package typings.xstate.typesMod

import typings.xstate.anon.Context
import typings.xstate.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathItem[TContext, TEvent /* <: EventObject */] extends js.Object {
  var path: js.Array[Segment[TContext, TEvent]] = js.native
  var state: State[TContext, TEvent, _, Context[TContext]] = js.native
  var weight: js.UndefOr[Double] = js.native
}

object PathItem {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](path: js.Array[Segment[TContext, TEvent]], state: State[TContext, TEvent, _, Context[TContext]]): PathItem[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathItem[TContext, TEvent]]
  }
  @scala.inline
  implicit class PathItemOps[Self <: PathItem[_, _], TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with (PathItem[TContext, TEvent])) extends AnyVal {
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
    def setPathVarargs(value: (Segment[TContext, TEvent])*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[Segment[TContext, TEvent]]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: State[TContext, TEvent, _, Context[TContext]]): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

