package typings.xstate.typesMod

import typings.xstate.anon.Context
import typings.xstate.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathsItem[TContext, TEvent /* <: EventObject */] extends js.Object {
  var paths: js.Array[js.Array[Segment[TContext, TEvent]]] = js.native
  var state: State[TContext, TEvent, _, Context[TContext]] = js.native
}

object PathsItem {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](
    paths: js.Array[js.Array[Segment[TContext, TEvent]]],
    state: State[TContext, TEvent, _, Context[TContext]]
  ): PathsItem[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathsItem[TContext, TEvent]]
  }
  @scala.inline
  implicit class PathsItemOps[Self <: PathsItem[_, _], TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with (PathsItem[TContext, TEvent])) extends AnyVal {
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
    def setPathsVarargs(value: (js.Array[Segment[TContext, TEvent]])*): Self = this.set("paths", js.Array(value :_*))
    @scala.inline
    def setPaths(value: js.Array[js.Array[Segment[TContext, TEvent]]]): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: State[TContext, TEvent, _, Context[TContext]]): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

