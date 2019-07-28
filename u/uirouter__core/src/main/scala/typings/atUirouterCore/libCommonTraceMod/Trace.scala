package typings.atUirouterCore.libCommonTraceMod

import typings.atUirouterCore.libPathPathNodeMod.PathNode
import typings.atUirouterCore.libResolveInterfaceMod.PolicyWhen
import typings.atUirouterCore.libResolveResolvableMod.Resolvable
import typings.atUirouterCore.libStateStateObjectMod.StateObject
import typings.atUirouterCore.libTransitionInterfaceMod.HookResult
import typings.atUirouterCore.libTransitionTransitionHookMod.TransitionHook
import typings.atUirouterCore.libTransitionTransitionMod.Transition
import typings.atUirouterCore.libViewInterfaceMod.ActiveUIView
import typings.atUirouterCore.libViewInterfaceMod.ViewConfig
import typings.atUirouterCore.libViewInterfaceMod.ViewContext
import typings.atUirouterCore.libViewViewMod.ViewTuple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/common/trace", "Trace")
@js.native
/** @hidden */
class Trace () extends js.Object {
  /** @hidden */
  var _enabled: js.Any = js.native
  /** @hidden */
  var _set: js.Any = js.native
  /** @hidden */
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
  /** @internalapi called by ui-router code */
  def traceError(reason: js.Any, trans: Transition): Unit = js.native
  /** @internalapi called by ui-router code */
  def traceHookInvocation(step: TransitionHook, trans: Transition, options: js.Any): Unit = js.native
  /** @internalapi called by ui-router code */
  def traceHookResult(hookResult: HookResult, trans: Transition, transitionOptions: js.Any): Unit = js.native
  /** @internalapi called by ui-router code */
  def traceResolvableResolved(resolvable: Resolvable): Unit = js.native
  def traceResolvableResolved(resolvable: Resolvable, trans: Transition): Unit = js.native
  /** @internalapi called by ui-router code */
  def traceResolvePath(path: js.Array[PathNode], when: PolicyWhen): Unit = js.native
  def traceResolvePath(path: js.Array[PathNode], when: PolicyWhen, trans: Transition): Unit = js.native
  /** @internalapi called by ui-router code */
  def traceSuccess(finalState: StateObject, trans: Transition): Unit = js.native
  /** @internalapi called by ui-router code */
  def traceTransitionIgnored(trans: Transition): Unit = js.native
  /** @internalapi called by ui-router code */
  def traceTransitionStart(trans: Transition): Unit = js.native
  /** @internalapi called by ui-router code */
  def traceUIViewConfigUpdated(viewData: ActiveUIView, context: ViewContext): Unit = js.native
  /** @internalapi called by ui-router code */
  def traceUIViewEvent(event: String, viewData: ActiveUIView): Unit = js.native
  def traceUIViewEvent(event: String, viewData: ActiveUIView, extra: String): Unit = js.native
  /** @internalapi called by ui-router code */
  def traceUIViewFill(viewData: ActiveUIView, html: String): Unit = js.native
  /** @internalapi called by ui-router code */
  def traceViewServiceEvent(event: String, viewConfig: ViewConfig): Unit = js.native
  /** @internalapi called by ui-router code */
  def traceViewServiceUIViewEvent(event: String, viewData: ActiveUIView): Unit = js.native
  /** @internalapi called by ui-router code */
  def traceViewSync(pairs: js.Array[ViewTuple]): Unit = js.native
}

