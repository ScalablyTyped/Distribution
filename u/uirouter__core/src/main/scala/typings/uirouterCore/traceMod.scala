package typings.uirouterCore

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traceMod {
  
  @js.native
  sealed trait Category extends StObject
  /**
    * Trace categories Enum
    *
    * Enable or disable a category using [[Trace.enable]] or [[Trace.disable]]
    *
    * `trace.enable(Category.TRANSITION)`
    *
    * These can also be provided using a matching string, or position ordinal
    *
    * `trace.enable("TRANSITION")`
    *
    * `trace.enable(1)`
    */
  @JSImport("@uirouter/core/lib/common/trace", "Category")
  @js.native
  object Category extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Category & Double] = js.native
    
    @js.native
    sealed trait HOOK
      extends StObject
         with Category
    /* 2 */ val HOOK: typings.uirouterCore.traceMod.Category.HOOK & Double = js.native
    
    @js.native
    sealed trait RESOLVE
      extends StObject
         with Category
    /* 0 */ val RESOLVE: typings.uirouterCore.traceMod.Category.RESOLVE & Double = js.native
    
    @js.native
    sealed trait TRANSITION
      extends StObject
         with Category
    /* 1 */ val TRANSITION: typings.uirouterCore.traceMod.Category.TRANSITION & Double = js.native
    
    @js.native
    sealed trait UIVIEW
      extends StObject
         with Category
    /* 3 */ val UIVIEW: typings.uirouterCore.traceMod.Category.UIVIEW & Double = js.native
    
    @js.native
    sealed trait VIEWCONFIG
      extends StObject
         with Category
    /* 4 */ val VIEWCONFIG: typings.uirouterCore.traceMod.Category.VIEWCONFIG & Double = js.native
  }
  
  @JSImport("@uirouter/core/lib/common/trace", "Trace")
  @js.native
  /** @internal */
  class Trace_ () extends StObject {
    
    /** @internal */
    /* private */ var _enabled: js.Any = js.native
    
    /** @internal */
    /* private */ var _set: js.Any = js.native
    
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
  
  /**
    * The [[Trace]] singleton
    *
    * #### Example:
    * ```js
    * import {trace} from "@uirouter/core";
    * trace.enable(1, 5);
    * ```
    */
  @JSImport("@uirouter/core/lib/common/trace", "trace")
  @js.native
  val trace: Trace_ = js.native
}
