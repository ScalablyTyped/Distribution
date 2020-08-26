package typings.uirouterCore.traceMod

import typings.uirouterCore.pathNodeMod.PathNode
import typings.uirouterCore.resolvableMod.Resolvable
import typings.uirouterCore.resolveInterfaceMod.PolicyWhen
import typings.uirouterCore.stateObjectMod.StateObject
import typings.uirouterCore.transitionHookMod.TransitionHook
import typings.uirouterCore.transitionInterfaceMod.HookResult
import typings.uirouterCore.transitionTransitionMod.Transition
import typings.uirouterCore.viewInterfaceMod.ActiveUIView
import typings.uirouterCore.viewInterfaceMod.ViewConfig
import typings.uirouterCore.viewInterfaceMod.ViewContext
import typings.uirouterCore.viewViewMod.ViewTuple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/common/trace", "Trace")
@js.native
/** @internal */
class Trace_ () extends js.Object {
  /** @internal */
  var _enabled: js.Any = js.native
  /** @internal */
  var _set: js.Any = js.native
  /** @internal */
  var approximateDigests: Double = js.native
  /**
    * Disables a trace [[Category]]
    *
    * ```js
    * trace.disable("VIEWCONFIG");
    * ```
    *
    * @param categories categories to disable. If `categories` is omitted, all categories are disabled.
    *        Also takes strings (category name) or ordinal (category position)
    */
  def disable(categories: (Category | String | Double)*): js.Any = js.native
  /**
    * Enables a trace [[Category]]
    *
    * ```js
    * trace.enable("TRANSITION");
    * ```
    *
    * @param categories categories to enable. If `categories` is omitted, all categories are enabled.
    *        Also takes strings (category name) or ordinal (category position)
    */
  def enable(categories: (Category | String | Double)*): js.Any = js.native
  def enabled(category: String): Boolean = js.native
  def enabled(category: Double): Boolean = js.native
  /**
    * Retrieves the enabled stateus of a [[Category]]
    *
    * ```js
    * trace.enabled("VIEWCONFIG"); // true or false
    * ```
    *
    * @returns boolean true if the category is enabled
    */
  def enabled(category: Category): Boolean = js.native
  /** @internal called by ui-router code */
  def traceError(reason: js.Any, trans: Transition): Unit = js.native
  /** @internal called by ui-router code */
  def traceHookInvocation(step: TransitionHook, trans: Transition, options: js.Any): Unit = js.native
  /** @internal called by ui-router code */
  def traceHookResult(hookResult: HookResult, trans: Transition, transitionOptions: js.Any): Unit = js.native
  /** @internal called by ui-router code */
  def traceResolvableResolved(resolvable: Resolvable): Unit = js.native
  def traceResolvableResolved(resolvable: Resolvable, trans: Transition): Unit = js.native
  /** @internal called by ui-router code */
  def traceResolvePath(path: js.Array[PathNode], when: PolicyWhen): Unit = js.native
  def traceResolvePath(path: js.Array[PathNode], when: PolicyWhen, trans: Transition): Unit = js.native
  /** @internal called by ui-router code */
  def traceSuccess(finalState: StateObject, trans: Transition): Unit = js.native
  /** @internal called by ui-router code */
  def traceTransitionIgnored(trans: Transition): Unit = js.native
  /** @internal called by ui-router code */
  def traceTransitionStart(trans: Transition): Unit = js.native
  /** @internal called by ui-router code */
  def traceUIViewConfigUpdated(viewData: ActiveUIView, context: ViewContext): Unit = js.native
  /** @internal called by ui-router code */
  def traceUIViewEvent(event: String, viewData: ActiveUIView): Unit = js.native
  def traceUIViewEvent(event: String, viewData: ActiveUIView, extra: String): Unit = js.native
  /** @internal called by ui-router code */
  def traceUIViewFill(viewData: ActiveUIView, html: String): Unit = js.native
  /** @internal called by ui-router code */
  def traceViewServiceEvent(event: String, viewConfig: ViewConfig): Unit = js.native
  /** @internal called by ui-router code */
  def traceViewServiceUIViewEvent(event: String, viewData: ActiveUIView): Unit = js.native
  /** @internal called by ui-router code */
  def traceViewSync(pairs: js.Array[ViewTuple]): Unit = js.native
}

