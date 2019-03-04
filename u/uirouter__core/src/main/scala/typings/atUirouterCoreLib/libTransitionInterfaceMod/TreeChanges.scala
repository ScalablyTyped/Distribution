package typings
package atUirouterCoreLib.libTransitionInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeChanges
  extends /** @nodoc */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode]] {
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
  var entering: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode]
  /**
    * The path of previously active nodes that the transition is exiting.
    *
    * After the Transition is successful, these nodes are no longer active.
    *
    * Note that a state that is being reloaded (due to parameter values changing, or `reload: true`) may be in both the
    * `exiting` and `entering` paths.
    */
  var exiting: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode]
  /** The path of nodes in the state tree that the transition is coming *from* */
  var from: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode]
  /**
    * The path of active nodes that the transition is retaining.
    *
    * These nodes are neither exited, nor entered.
    * Before and after the transition is successful, these nodes are active.
    */
  var retained: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode]
  /**
    * The path of active nodes that the transition is retaining with updated "to params" applied.
    *
    * These nodes are neither exited, nor entered.
    * Before and after the transition is successful, these nodes are active.
    *
    * This is a shallow copy of [[retained]], but with new (dynamic) parameter values from [[to]] applied.
    */
  var retainedWithToParams: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode]
  /** The path of nodes in the state tree that the transition is going *to* */
  var to: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode]
}

object TreeChanges {
  @scala.inline
  def apply(
    entering: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
    exiting: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
    from: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
    retained: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
    retainedWithToParams: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
    to: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
    StringDictionary: /** @nodoc */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode]] = null
  ): TreeChanges = {
    val __obj = js.Dynamic.literal(entering = entering, exiting = exiting, from = from, retained = retained, retainedWithToParams = retainedWithToParams, to = to)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[TreeChanges]
  }
}

