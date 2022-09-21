package typings.welldoneSoftwareWhyDidYouRender

import typings.react.mod.Component
import typings.welldoneSoftwareWhyDidYouRender.anon.TypeofReact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(react: TypeofReact): TypeofReact = ^.asInstanceOf[js.Dynamic].apply(react.asInstanceOf[js.Any]).asInstanceOf[TypeofReact]
    inline def apply(react: TypeofReact, options: WhyDidYouRenderOptions): TypeofReact = (^.asInstanceOf[js.Dynamic].apply(react.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TypeofReact]
    
    @JSImport("@welldone-software/why-did-you-render", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@welldone-software/why-did-you-render", "default.defaultNotifier")
    @js.native
    val defaultNotifier: Notifier = js.native
  }
  
  /* augmented module */
  object reactAugmentingMod {
    
    object Component {
      
      @JSImport("react", "Component.whyDidYouRender")
      @js.native
      val whyDidYouRender: WhyDidYouRenderComponentMember = js.native
    }
    
    trait ExoticComponent[P] extends StObject {
      
      var whyDidYouRender: js.UndefOr[WhyDidYouRenderComponentMember] = js.undefined
    }
    object ExoticComponent {
      
      inline def apply[P](): ExoticComponent[P] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ExoticComponent[P]]
      }
      
      extension [Self <: ExoticComponent[?], P](x: Self & ExoticComponent[P]) {
        
        inline def setWhyDidYouRender(value: WhyDidYouRenderComponentMember): Self = StObject.set(x, "whyDidYouRender", value.asInstanceOf[js.Any])
        
        inline def setWhyDidYouRenderUndefined: Self = StObject.set(x, "whyDidYouRender", js.undefined)
      }
    }
    
    trait FunctionComponent[P] extends StObject {
      
      var whyDidYouRender: js.UndefOr[WhyDidYouRenderComponentMember] = js.undefined
    }
    object FunctionComponent {
      
      inline def apply[P](): FunctionComponent[P] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FunctionComponent[P]]
      }
      
      extension [Self <: FunctionComponent[?], P](x: Self & FunctionComponent[P]) {
        
        inline def setWhyDidYouRender(value: WhyDidYouRenderComponentMember): Self = StObject.set(x, "whyDidYouRender", value.asInstanceOf[js.Any])
        
        inline def setWhyDidYouRenderUndefined: Self = StObject.set(x, "whyDidYouRender", js.undefined)
      }
    }
    
    trait VoidFunctionComponent[P] extends StObject {
      
      var whyDidYouRender: js.UndefOr[WhyDidYouRenderComponentMember] = js.undefined
    }
    object VoidFunctionComponent {
      
      inline def apply[P](): VoidFunctionComponent[P] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VoidFunctionComponent[P]]
      }
      
      extension [Self <: VoidFunctionComponent[?], P](x: Self & VoidFunctionComponent[P]) {
        
        inline def setWhyDidYouRender(value: WhyDidYouRenderComponentMember): Self = StObject.set(x, "whyDidYouRender", value.asInstanceOf[js.Any])
        
        inline def setWhyDidYouRenderUndefined: Self = StObject.set(x, "whyDidYouRender", js.undefined)
      }
    }
  }
  
  type ExtraHookToTrack = js.Tuple2[Any, String]
  
  trait HookDifference extends StObject {
    
    var diffType: String
    
    var nextValue: Any
    
    var pathString: String
    
    var prevValue: Any
  }
  object HookDifference {
    
    inline def apply(diffType: String, nextValue: Any, pathString: String, prevValue: Any): HookDifference = {
      val __obj = js.Dynamic.literal(diffType = diffType.asInstanceOf[js.Any], nextValue = nextValue.asInstanceOf[js.Any], pathString = pathString.asInstanceOf[js.Any], prevValue = prevValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[HookDifference]
    }
    
    extension [Self <: HookDifference](x: Self) {
      
      inline def setDiffType(value: String): Self = StObject.set(x, "diffType", value.asInstanceOf[js.Any])
      
      inline def setNextValue(value: Any): Self = StObject.set(x, "nextValue", value.asInstanceOf[js.Any])
      
      inline def setPathString(value: String): Self = StObject.set(x, "pathString", value.asInstanceOf[js.Any])
      
      inline def setPrevValue(value: Any): Self = StObject.set(x, "prevValue", value.asInstanceOf[js.Any])
    }
  }
  
  type Notifier = js.Function1[/* options */ UpdateInfo, Unit]
  
  trait ReasonForUpdate extends StObject {
    
    var hookDifferences: js.Array[HookDifference]
    
    var propsDifferences: Boolean
    
    var stateDifferences: Boolean
  }
  object ReasonForUpdate {
    
    inline def apply(hookDifferences: js.Array[HookDifference], propsDifferences: Boolean, stateDifferences: Boolean): ReasonForUpdate = {
      val __obj = js.Dynamic.literal(hookDifferences = hookDifferences.asInstanceOf[js.Any], propsDifferences = propsDifferences.asInstanceOf[js.Any], stateDifferences = stateDifferences.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReasonForUpdate]
    }
    
    extension [Self <: ReasonForUpdate](x: Self) {
      
      inline def setHookDifferences(value: js.Array[HookDifference]): Self = StObject.set(x, "hookDifferences", value.asInstanceOf[js.Any])
      
      inline def setHookDifferencesVarargs(value: HookDifference*): Self = StObject.set(x, "hookDifferences", js.Array(value*))
      
      inline def setPropsDifferences(value: Boolean): Self = StObject.set(x, "propsDifferences", value.asInstanceOf[js.Any])
      
      inline def setStateDifferences(value: Boolean): Self = StObject.set(x, "stateDifferences", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateInfo extends StObject {
    
    var Component: typings.react.mod.Component[js.Object, js.Object, Any]
    
    var displayName: String
    
    var hookName: js.UndefOr[String] = js.undefined
    
    var nextHook: Any
    
    var nextProps: Any
    
    var nextState: Any
    
    var options: WhyDidYouRenderOptions
    
    var prevHook: Any
    
    var prevProps: Any
    
    var prevState: Any
    
    var reason: ReasonForUpdate
  }
  object UpdateInfo {
    
    inline def apply(
      Component: Component[js.Object, js.Object, Any],
      displayName: String,
      nextHook: Any,
      nextProps: Any,
      nextState: Any,
      options: WhyDidYouRenderOptions,
      prevHook: Any,
      prevProps: Any,
      prevState: Any,
      reason: ReasonForUpdate
    ): UpdateInfo = {
      val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], nextHook = nextHook.asInstanceOf[js.Any], nextProps = nextProps.asInstanceOf[js.Any], nextState = nextState.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], prevHook = prevHook.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateInfo]
    }
    
    extension [Self <: UpdateInfo](x: Self) {
      
      inline def setComponent(value: Component[js.Object, js.Object, Any]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setHookName(value: String): Self = StObject.set(x, "hookName", value.asInstanceOf[js.Any])
      
      inline def setHookNameUndefined: Self = StObject.set(x, "hookName", js.undefined)
      
      inline def setNextHook(value: Any): Self = StObject.set(x, "nextHook", value.asInstanceOf[js.Any])
      
      inline def setNextProps(value: Any): Self = StObject.set(x, "nextProps", value.asInstanceOf[js.Any])
      
      inline def setNextState(value: Any): Self = StObject.set(x, "nextState", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: WhyDidYouRenderOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPrevHook(value: Any): Self = StObject.set(x, "prevHook", value.asInstanceOf[js.Any])
      
      inline def setPrevProps(value: Any): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
      
      inline def setPrevState(value: Any): Self = StObject.set(x, "prevState", value.asInstanceOf[js.Any])
      
      inline def setReason(value: ReasonForUpdate): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  type WhyDidYouRenderComponentMember = WhyDidYouRenderOptions | Boolean
  
  trait WhyDidYouRenderOptions extends StObject {
    
    var collapseGroups: js.UndefOr[Boolean] = js.undefined
    
    var customName: js.UndefOr[String] = js.undefined
    
    var diffNameColor: js.UndefOr[String] = js.undefined
    
    var diffPathColor: js.UndefOr[String] = js.undefined
    
    var exclude: js.UndefOr[js.Array[js.RegExp]] = js.undefined
    
    var hotReloadBufferMs: js.UndefOr[Double] = js.undefined
    
    var include: js.UndefOr[js.Array[js.RegExp]] = js.undefined
    
    var logOnDifferentValues: js.UndefOr[Boolean] = js.undefined
    
    var logOwnerReasons: js.UndefOr[Boolean] = js.undefined
    
    var notifier: js.UndefOr[Notifier] = js.undefined
    
    var onlyLogs: js.UndefOr[Boolean] = js.undefined
    
    var titleColor: js.UndefOr[String] = js.undefined
    
    var trackAllPureComponents: js.UndefOr[Boolean] = js.undefined
    
    var trackExtraHooks: js.UndefOr[js.Array[ExtraHookToTrack]] = js.undefined
    
    var trackHooks: js.UndefOr[Boolean] = js.undefined
  }
  object WhyDidYouRenderOptions {
    
    inline def apply(): WhyDidYouRenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WhyDidYouRenderOptions]
    }
    
    extension [Self <: WhyDidYouRenderOptions](x: Self) {
      
      inline def setCollapseGroups(value: Boolean): Self = StObject.set(x, "collapseGroups", value.asInstanceOf[js.Any])
      
      inline def setCollapseGroupsUndefined: Self = StObject.set(x, "collapseGroups", js.undefined)
      
      inline def setCustomName(value: String): Self = StObject.set(x, "customName", value.asInstanceOf[js.Any])
      
      inline def setCustomNameUndefined: Self = StObject.set(x, "customName", js.undefined)
      
      inline def setDiffNameColor(value: String): Self = StObject.set(x, "diffNameColor", value.asInstanceOf[js.Any])
      
      inline def setDiffNameColorUndefined: Self = StObject.set(x, "diffNameColor", js.undefined)
      
      inline def setDiffPathColor(value: String): Self = StObject.set(x, "diffPathColor", value.asInstanceOf[js.Any])
      
      inline def setDiffPathColorUndefined: Self = StObject.set(x, "diffPathColor", js.undefined)
      
      inline def setExclude(value: js.Array[js.RegExp]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: js.RegExp*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setHotReloadBufferMs(value: Double): Self = StObject.set(x, "hotReloadBufferMs", value.asInstanceOf[js.Any])
      
      inline def setHotReloadBufferMsUndefined: Self = StObject.set(x, "hotReloadBufferMs", js.undefined)
      
      inline def setInclude(value: js.Array[js.RegExp]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: js.RegExp*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setLogOnDifferentValues(value: Boolean): Self = StObject.set(x, "logOnDifferentValues", value.asInstanceOf[js.Any])
      
      inline def setLogOnDifferentValuesUndefined: Self = StObject.set(x, "logOnDifferentValues", js.undefined)
      
      inline def setLogOwnerReasons(value: Boolean): Self = StObject.set(x, "logOwnerReasons", value.asInstanceOf[js.Any])
      
      inline def setLogOwnerReasonsUndefined: Self = StObject.set(x, "logOwnerReasons", js.undefined)
      
      inline def setNotifier(value: /* options */ UpdateInfo => Unit): Self = StObject.set(x, "notifier", js.Any.fromFunction1(value))
      
      inline def setNotifierUndefined: Self = StObject.set(x, "notifier", js.undefined)
      
      inline def setOnlyLogs(value: Boolean): Self = StObject.set(x, "onlyLogs", value.asInstanceOf[js.Any])
      
      inline def setOnlyLogsUndefined: Self = StObject.set(x, "onlyLogs", js.undefined)
      
      inline def setTitleColor(value: String): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      inline def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      inline def setTrackAllPureComponents(value: Boolean): Self = StObject.set(x, "trackAllPureComponents", value.asInstanceOf[js.Any])
      
      inline def setTrackAllPureComponentsUndefined: Self = StObject.set(x, "trackAllPureComponents", js.undefined)
      
      inline def setTrackExtraHooks(value: js.Array[ExtraHookToTrack]): Self = StObject.set(x, "trackExtraHooks", value.asInstanceOf[js.Any])
      
      inline def setTrackExtraHooksUndefined: Self = StObject.set(x, "trackExtraHooks", js.undefined)
      
      inline def setTrackExtraHooksVarargs(value: ExtraHookToTrack*): Self = StObject.set(x, "trackExtraHooks", js.Array(value*))
      
      inline def setTrackHooks(value: Boolean): Self = StObject.set(x, "trackHooks", value.asInstanceOf[js.Any])
      
      inline def setTrackHooksUndefined: Self = StObject.set(x, "trackHooks", js.undefined)
    }
  }
}
