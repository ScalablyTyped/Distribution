package typings
package atUirouterCoreLib.libCommonTraceMod

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
  var approximateDigests: scala.Double = js.native
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
  def disable(categories: (Category | java.lang.String | scala.Double)*): js.Any = js.native
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
  def enable(categories: (Category | java.lang.String | scala.Double)*): js.Any = js.native
  /**
    * Retrieves the enabled stateus of a [[Category]]
    *
    * ```js
    * trace.enabled("VIEWCONFIG"); // true or false
    * ```
    *
    * @returns boolean true if the category is enabled
    */
  def enabled(category: Category): scala.Boolean = js.native
  def enabled(category: java.lang.String): scala.Boolean = js.native
  def enabled(category: scala.Double): scala.Boolean = js.native
  /** @internalapi called by ui-router code */
  def traceError(reason: js.Any, trans: atUirouterCoreLib.libTransitionTransitionMod.Transition): scala.Unit = js.native
  /** @internalapi called by ui-router code */
  def traceHookInvocation(
    step: atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook,
    trans: atUirouterCoreLib.libTransitionTransitionMod.Transition,
    options: js.Any
  ): scala.Unit = js.native
  /** @internalapi called by ui-router code */
  def traceHookResult(
    hookResult: atUirouterCoreLib.libTransitionInterfaceMod.HookResult,
    trans: atUirouterCoreLib.libTransitionTransitionMod.Transition,
    transitionOptions: js.Any
  ): scala.Unit = js.native
  /** @internalapi called by ui-router code */
  def traceResolvableResolved(resolvable: atUirouterCoreLib.libResolveResolvableMod.Resolvable): scala.Unit = js.native
  def traceResolvableResolved(
    resolvable: atUirouterCoreLib.libResolveResolvableMod.Resolvable,
    trans: atUirouterCoreLib.libTransitionTransitionMod.Transition
  ): scala.Unit = js.native
  /** @internalapi called by ui-router code */
  def traceResolvePath(
    path: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
    when: atUirouterCoreLib.libResolveInterfaceMod.PolicyWhen
  ): scala.Unit = js.native
  def traceResolvePath(
    path: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
    when: atUirouterCoreLib.libResolveInterfaceMod.PolicyWhen,
    trans: atUirouterCoreLib.libTransitionTransitionMod.Transition
  ): scala.Unit = js.native
  /** @internalapi called by ui-router code */
  def traceSuccess(
    finalState: atUirouterCoreLib.libStateStateObjectMod.StateObject,
    trans: atUirouterCoreLib.libTransitionTransitionMod.Transition
  ): scala.Unit = js.native
  /** @internalapi called by ui-router code */
  def traceTransitionIgnored(trans: atUirouterCoreLib.libTransitionTransitionMod.Transition): scala.Unit = js.native
  /** @internalapi called by ui-router code */
  def traceTransitionStart(trans: atUirouterCoreLib.libTransitionTransitionMod.Transition): scala.Unit = js.native
  /** @internalapi called by ui-router code */
  def traceUIViewConfigUpdated(
    viewData: atUirouterCoreLib.libViewInterfaceMod.ActiveUIView,
    context: atUirouterCoreLib.libViewInterfaceMod.ViewContext
  ): scala.Unit = js.native
  /** @internalapi called by ui-router code */
  def traceUIViewEvent(event: java.lang.String, viewData: atUirouterCoreLib.libViewInterfaceMod.ActiveUIView): scala.Unit = js.native
  def traceUIViewEvent(
    event: java.lang.String,
    viewData: atUirouterCoreLib.libViewInterfaceMod.ActiveUIView,
    extra: java.lang.String
  ): scala.Unit = js.native
  /** @internalapi called by ui-router code */
  def traceUIViewFill(viewData: atUirouterCoreLib.libViewInterfaceMod.ActiveUIView, html: java.lang.String): scala.Unit = js.native
  /** @internalapi called by ui-router code */
  def traceViewServiceEvent(event: java.lang.String, viewConfig: atUirouterCoreLib.libViewInterfaceMod.ViewConfig): scala.Unit = js.native
  /** @internalapi called by ui-router code */
  def traceViewServiceUIViewEvent(event: java.lang.String, viewData: atUirouterCoreLib.libViewInterfaceMod.ActiveUIView): scala.Unit = js.native
  /** @internalapi called by ui-router code */
  def traceViewSync(pairs: js.Array[atUirouterCoreLib.libViewViewMod.ViewTuple]): scala.Unit = js.native
}

