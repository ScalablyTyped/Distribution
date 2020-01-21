package typings.uirouterCore.transitionInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.pathNodeMod.PathNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var entering: js.Array[PathNode]
  /**
    * The path of previously active nodes that the transition is exiting.
    *
    * After the Transition is successful, these nodes are no longer active.
    *
    * Note that a state that is being reloaded (due to parameter values changing, or `reload: true`) may be in both the
    * `exiting` and `entering` paths.
    */
  var exiting: js.Array[PathNode]
  /** The path of nodes in the state tree that the transition is coming *from* */
  var from: js.Array[PathNode]
  /**
    * The path of active nodes that the transition is retaining.
    *
    * These nodes are neither exited, nor entered.
    * Before and after the transition is successful, these nodes are active.
    */
  var retained: js.Array[PathNode]
  /**
    * The path of active nodes that the transition is retaining with updated "to params" applied.
    *
    * These nodes are neither exited, nor entered.
    * Before and after the transition is successful, these nodes are active.
    *
    * This is a shallow copy of [[retained]], but with new (dynamic) parameter values from [[to]] applied.
    */
  var retainedWithToParams: js.Array[PathNode]
  /** The path of nodes in the state tree that the transition is going *to* */
  var to: js.Array[PathNode]
}

object TreeChanges {
  @scala.inline
  def apply(
    entering: js.Array[PathNode],
    exiting: js.Array[PathNode],
    from: js.Array[PathNode],
    retained: js.Array[PathNode],
    retainedWithToParams: js.Array[PathNode],
    to: js.Array[PathNode],
    StringDictionary: /** @nodoc */
  /* key */ StringDictionary[js.UndefOr[js.Array[PathNode]]] = null
  ): TreeChanges = {
    val __obj = js.Dynamic.literal(entering = entering.asInstanceOf[js.Any], exiting = exiting.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], retained = retained.asInstanceOf[js.Any], retainedWithToParams = retainedWithToParams.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[TreeChanges]
  }
}

