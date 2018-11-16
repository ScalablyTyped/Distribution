package typings
package atUirouterCoreLib.libTransitionHookRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/transition/hookRegistry", "RegisteredHook")
@js.native
class RegisteredHook protected () extends js.Object {
  def this(tranSvc: atUirouterCoreLib.libTransitionTransitionServiceMod.TransitionService, eventType: atUirouterCoreLib.libTransitionTransitionEventTypeMod.TransitionEventType, callback: atUirouterCoreLib.libTransitionInterfaceMod.HookFn, matchCriteria: atUirouterCoreLib.libTransitionInterfaceMod.HookMatchCriteria, removeHookFromRegistry: js.Function1[/* hook */ RegisteredHook, scala.Unit]) = this()
  def this(tranSvc: atUirouterCoreLib.libTransitionTransitionServiceMod.TransitionService, eventType: atUirouterCoreLib.libTransitionTransitionEventTypeMod.TransitionEventType, callback: atUirouterCoreLib.libTransitionInterfaceMod.HookFn, matchCriteria: atUirouterCoreLib.libTransitionInterfaceMod.HookMatchCriteria, removeHookFromRegistry: js.Function1[/* hook */ RegisteredHook, scala.Unit], options: atUirouterCoreLib.libTransitionInterfaceMod.HookRegOptions) = this()
  var _deregistered: scala.Boolean = js.native
  /**
       * Gets the default match criteria (all `true`)
       *
       * Returns an object which has all the criteria match paths as keys and `true` as values, i.e.:
       *
       * ```js
       * {
       *   to: true,
       *   from: true,
       *   entering: true,
       *   exiting: true,
       *   retained: true,
       * }
       */
  var _getDefaultMatchCriteria: js.Any = js.native
  /**
       * Gets matching nodes as [[IMatchingNodes]]
       *
       * Create a IMatchingNodes object from the TransitionHookTypes that is roughly equivalent to:
       *
       * ```js
       * let matches: IMatchingNodes = {
       *   to:       _matchingNodes([tail(treeChanges.to)],   mc.to),
       *   from:     _matchingNodes([tail(treeChanges.from)], mc.from),
       *   exiting:  _matchingNodes(treeChanges.exiting,      mc.exiting),
       *   retained: _matchingNodes(treeChanges.retained,     mc.retained),
       *   entering: _matchingNodes(treeChanges.entering,     mc.entering),
       * };
       * ```
       */
  var _getMatchingNodes: js.Any = js.native
  /**
       * Gets the matching [[PathNode]]s
       *
       * Given an array of [[PathNode]]s, and a [[HookMatchCriterion]], returns an array containing
       * the [[PathNode]]s that the criteria matches, or `null` if there were no matching nodes.
       *
       * Returning `null` is significant to distinguish between the default
       * "match-all criterion value" of `true` compared to a `() => true` function,
       * when the nodes is an empty array.
       *
       * This is useful to allow a transition match criteria of `entering: true`
       * to still match a transition, even when `entering === []`.  Contrast that
       * with `entering: (state) => true` which only matches when a state is actually
       * being entered.
       */
  var _matchingNodes: js.Any = js.native
  var bind: js.Any = js.native
  var callback: atUirouterCoreLib.libTransitionInterfaceMod.HookFn = js.native
  var eventType: atUirouterCoreLib.libTransitionTransitionEventTypeMod.TransitionEventType = js.native
  var invokeCount: scala.Double = js.native
  var invokeLimit: scala.Double = js.native
  var matchCriteria: atUirouterCoreLib.libTransitionInterfaceMod.HookMatchCriteria = js.native
  var priority: scala.Double = js.native
  var tranSvc: atUirouterCoreLib.libTransitionTransitionServiceMod.TransitionService = js.native
  def deregister(): scala.Unit = js.native
  /**
       * Determines if this hook's [[matchCriteria]] match the given [[TreeChanges]]
       *
       * @returns an IMatchingNodes object, or null. If an IMatchingNodes object is returned, its values
       * are the matching [[PathNode]]s for each [[HookMatchCriterion]] (to, from, exiting, retained, entering)
       */
  def matches(treeChanges: atUirouterCoreLib.libTransitionInterfaceMod.TreeChanges): atUirouterCoreLib.libTransitionInterfaceMod.IMatchingNodes = js.native
  def removeHookFromRegistry(hook: RegisteredHook): scala.Unit = js.native
}

