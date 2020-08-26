package typings.uirouterCore.transitionInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.pathNodeMod.PathNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeChanges
  extends /** @nodoc */
/* key */ StringDictionary[js.UndefOr[js.Array[PathNode]]] {
  /**
    * The path of nodes that the transition is entering.
    *
    * After the Transition is successful, these nodes will be active.
    * Because they are entering, they have their resolves fetched, `onEnter` hooks run, and their views
    * (component(s) or controller(s)+template(s)) refreshed.
    *
    * Note that a state that is reloaded (due to parameter values changing, or `reload: true`) may be in both the
    * `exiting` and `entering` paths.
    */
  var entering: js.Array[PathNode] = js.native
  /**
    * The path of previously active nodes that the transition is exiting.
    *
    * After the Transition is successful, these nodes are no longer active.
    *
    * Note that a state that is being reloaded (due to parameter values changing, or `reload: true`) may be in both the
    * `exiting` and `entering` paths.
    */
  var exiting: js.Array[PathNode] = js.native
  /** The path of nodes in the state tree that the transition is coming *from* */
  var from: js.Array[PathNode] = js.native
  /**
    * The path of active nodes that the transition is retaining.
    *
    * These nodes are neither exited, nor entered.
    * Before and after the transition is successful, these nodes are active.
    */
  var retained: js.Array[PathNode] = js.native
  /**
    * The path of active nodes that the transition is retaining with updated "to params" applied.
    *
    * These nodes are neither exited, nor entered.
    * Before and after the transition is successful, these nodes are active.
    *
    * This is a shallow copy of [[retained]], but with new (dynamic) parameter values from [[to]] applied.
    */
  var retainedWithToParams: js.Array[PathNode] = js.native
  /** The path of nodes in the state tree that the transition is going *to* */
  var to: js.Array[PathNode] = js.native
}

object TreeChanges {
  @scala.inline
  def apply(
    entering: js.Array[PathNode],
    exiting: js.Array[PathNode],
    from: js.Array[PathNode],
    retained: js.Array[PathNode],
    retainedWithToParams: js.Array[PathNode],
    to: js.Array[PathNode]
  ): TreeChanges = {
    val __obj = js.Dynamic.literal(entering = entering.asInstanceOf[js.Any], exiting = exiting.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], retained = retained.asInstanceOf[js.Any], retainedWithToParams = retainedWithToParams.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeChanges]
  }
  @scala.inline
  implicit class TreeChangesOps[Self <: TreeChanges] (val x: Self) extends AnyVal {
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
    def setEnteringVarargs(value: PathNode*): Self = this.set("entering", js.Array(value :_*))
    @scala.inline
    def setEntering(value: js.Array[PathNode]): Self = this.set("entering", value.asInstanceOf[js.Any])
    @scala.inline
    def setExitingVarargs(value: PathNode*): Self = this.set("exiting", js.Array(value :_*))
    @scala.inline
    def setExiting(value: js.Array[PathNode]): Self = this.set("exiting", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromVarargs(value: PathNode*): Self = this.set("from", js.Array(value :_*))
    @scala.inline
    def setFrom(value: js.Array[PathNode]): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetainedVarargs(value: PathNode*): Self = this.set("retained", js.Array(value :_*))
    @scala.inline
    def setRetained(value: js.Array[PathNode]): Self = this.set("retained", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetainedWithToParamsVarargs(value: PathNode*): Self = this.set("retainedWithToParams", js.Array(value :_*))
    @scala.inline
    def setRetainedWithToParams(value: js.Array[PathNode]): Self = this.set("retainedWithToParams", value.asInstanceOf[js.Any])
    @scala.inline
    def setToVarargs(value: PathNode*): Self = this.set("to", js.Array(value :_*))
    @scala.inline
    def setTo(value: js.Array[PathNode]): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}

