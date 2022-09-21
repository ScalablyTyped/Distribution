package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.vueReactivity.mod.DebuggerEvent
import typings.vueRuntimeCore.vueRuntimeCoreBooleans.`false`
import typings.vueRuntimeCore.vueRuntimeCoreStrings.B
import typings.vueRuntimeCore.vueRuntimeCoreStrings.Defaults
import typings.vueRuntimeCore.vueRuntimeCoreStrings.P
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegacyOptions[Props, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */]
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * #3468
    *
    * type-only, used to assist Mixin's type inference,
    * typescript will try to simplify the inferred `Mixin` type,
    * with the `__differentiator`, typescript won't be able to combine different mixins,
    * because the `__differentiator` will be different
    */
  var __differentiator: js.UndefOr[/* keyof D */ String] = js.undefined
  
  var activated: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var beforeCreate: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** @deprecated use `beforeUnmount` instead */
  var beforeDestroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var beforeMount: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var beforeUnmount: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var beforeUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var compatConfig: js.UndefOr[CompatConfig] = js.undefined
  
  var computed: js.UndefOr[C] = js.undefined
  
  var created: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var data: js.UndefOr[
    js.ThisFunction1[
      /* this */ CreateComponentPublicInstance[
        Props, 
        js.Object, 
        js.Object, 
        js.Object, 
        MethodOptions, 
        Mixin, 
        Extends, 
        js.Object, 
        Props, 
        js.Object, 
        `false`, 
        IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], P]) & EnsureNonVoid[Props], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], B]) & EnsureNonVoid[js.Object], 
        (UnwrapMixinsType[
          IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
          typings.vueRuntimeCore.vueRuntimeCoreStrings.D
        ]) & EnsureNonVoid[js.Object], 
        (UnwrapMixinsType[
          IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
          typings.vueRuntimeCore.vueRuntimeCoreStrings.C
        ]) & EnsureNonVoid[js.Object], 
        (UnwrapMixinsType[
          IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
          typings.vueRuntimeCore.vueRuntimeCoreStrings.M
        ]) & EnsureNonVoid[MethodOptions], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], Defaults]) & EnsureNonVoid[js.Object]
      ], 
      /* vm */ CreateComponentPublicInstance[
        Props, 
        js.Object, 
        js.Object, 
        js.Object, 
        MethodOptions, 
        Mixin, 
        Extends, 
        js.Object, 
        Props, 
        js.Object, 
        `false`, 
        IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], P]) & EnsureNonVoid[Props], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], B]) & EnsureNonVoid[js.Object], 
        (UnwrapMixinsType[
          IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
          typings.vueRuntimeCore.vueRuntimeCoreStrings.D
        ]) & EnsureNonVoid[js.Object], 
        (UnwrapMixinsType[
          IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
          typings.vueRuntimeCore.vueRuntimeCoreStrings.C
        ]) & EnsureNonVoid[js.Object], 
        (UnwrapMixinsType[
          IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
          typings.vueRuntimeCore.vueRuntimeCoreStrings.M
        ]) & EnsureNonVoid[MethodOptions], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], Defaults]) & EnsureNonVoid[js.Object]
      ], 
      D
    ]
  ] = js.undefined
  
  var deactivated: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * runtime compile only
    * @deprecated use `compilerOptions.delimiters` instead.
    */
  var delimiters: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  
  /** @deprecated use `unmounted` instead */
  var destroyed: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var errorCaptured: js.UndefOr[ErrorCapturedHook[Any]] = js.undefined
  
  var `extends`: js.UndefOr[Extends] = js.undefined
  
  var filters: js.UndefOr[Record[String, js.Function]] = js.undefined
  
  var inject: js.UndefOr[ComponentInjectOptions] = js.undefined
  
  var methods: js.UndefOr[M] = js.undefined
  
  var mixins: js.UndefOr[js.Array[Mixin]] = js.undefined
  
  var mounted: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var provide: js.UndefOr[ComponentProvideOptions] = js.undefined
  
  var renderTracked: js.UndefOr[DebuggerHook] = js.undefined
  
  var renderTriggered: js.UndefOr[DebuggerHook] = js.undefined
  
  var unmounted: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var updated: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var watch: js.UndefOr[ComponentWatchOptions] = js.undefined
}
object LegacyOptions {
  
  inline def apply[Props, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */](): LegacyOptions[Props, D, C, M, Mixin, Extends] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegacyOptions[Props, D, C, M, Mixin, Extends]]
  }
  
  extension [Self <: LegacyOptions[?, ?, ?, ?, ?, ?], Props, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */](x: Self & (LegacyOptions[Props, D, C, M, Mixin, Extends])) {
    
    inline def setActivated(value: () => Unit): Self = StObject.set(x, "activated", js.Any.fromFunction0(value))
    
    inline def setActivatedUndefined: Self = StObject.set(x, "activated", js.undefined)
    
    inline def setBeforeCreate(value: () => Unit): Self = StObject.set(x, "beforeCreate", js.Any.fromFunction0(value))
    
    inline def setBeforeCreateUndefined: Self = StObject.set(x, "beforeCreate", js.undefined)
    
    inline def setBeforeDestroy(value: () => Unit): Self = StObject.set(x, "beforeDestroy", js.Any.fromFunction0(value))
    
    inline def setBeforeDestroyUndefined: Self = StObject.set(x, "beforeDestroy", js.undefined)
    
    inline def setBeforeMount(value: () => Unit): Self = StObject.set(x, "beforeMount", js.Any.fromFunction0(value))
    
    inline def setBeforeMountUndefined: Self = StObject.set(x, "beforeMount", js.undefined)
    
    inline def setBeforeUnmount(value: () => Unit): Self = StObject.set(x, "beforeUnmount", js.Any.fromFunction0(value))
    
    inline def setBeforeUnmountUndefined: Self = StObject.set(x, "beforeUnmount", js.undefined)
    
    inline def setBeforeUpdate(value: () => Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction0(value))
    
    inline def setBeforeUpdateUndefined: Self = StObject.set(x, "beforeUpdate", js.undefined)
    
    inline def setCompatConfig(value: CompatConfig): Self = StObject.set(x, "compatConfig", value.asInstanceOf[js.Any])
    
    inline def setCompatConfigUndefined: Self = StObject.set(x, "compatConfig", js.undefined)
    
    inline def setComputed(value: C): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setComputedUndefined: Self = StObject.set(x, "computed", js.undefined)
    
    inline def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setData(
      value: js.ThisFunction1[
          /* this */ CreateComponentPublicInstance[
            Props, 
            js.Object, 
            js.Object, 
            js.Object, 
            MethodOptions, 
            Mixin, 
            Extends, 
            js.Object, 
            Props, 
            js.Object, 
            `false`, 
            IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
            (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], P]) & EnsureNonVoid[Props], 
            (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], B]) & EnsureNonVoid[js.Object], 
            (UnwrapMixinsType[
              IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
              typings.vueRuntimeCore.vueRuntimeCoreStrings.D
            ]) & EnsureNonVoid[js.Object], 
            (UnwrapMixinsType[
              IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
              typings.vueRuntimeCore.vueRuntimeCoreStrings.C
            ]) & EnsureNonVoid[js.Object], 
            (UnwrapMixinsType[
              IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
              typings.vueRuntimeCore.vueRuntimeCoreStrings.M
            ]) & EnsureNonVoid[MethodOptions], 
            (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], Defaults]) & EnsureNonVoid[js.Object]
          ], 
          /* vm */ CreateComponentPublicInstance[
            Props, 
            js.Object, 
            js.Object, 
            js.Object, 
            MethodOptions, 
            Mixin, 
            Extends, 
            js.Object, 
            Props, 
            js.Object, 
            `false`, 
            IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
            (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], P]) & EnsureNonVoid[Props], 
            (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], B]) & EnsureNonVoid[js.Object], 
            (UnwrapMixinsType[
              IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
              typings.vueRuntimeCore.vueRuntimeCoreStrings.D
            ]) & EnsureNonVoid[js.Object], 
            (UnwrapMixinsType[
              IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
              typings.vueRuntimeCore.vueRuntimeCoreStrings.C
            ]) & EnsureNonVoid[js.Object], 
            (UnwrapMixinsType[
              IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
              typings.vueRuntimeCore.vueRuntimeCoreStrings.M
            ]) & EnsureNonVoid[MethodOptions], 
            (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], Defaults]) & EnsureNonVoid[js.Object]
          ], 
          D
        ]
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDeactivated(value: () => Unit): Self = StObject.set(x, "deactivated", js.Any.fromFunction0(value))
    
    inline def setDeactivatedUndefined: Self = StObject.set(x, "deactivated", js.undefined)
    
    inline def setDelimiters(value: js.Tuple2[String, String]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
    
    inline def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
    
    inline def setDestroyed(value: () => Unit): Self = StObject.set(x, "destroyed", js.Any.fromFunction0(value))
    
    inline def setDestroyedUndefined: Self = StObject.set(x, "destroyed", js.undefined)
    
    inline def setErrorCaptured(
      value: (Any, /* instance */ (ComponentPublicInstance[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          `false`, 
          ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
        ]) | Null, /* info */ String) => Boolean | Unit
    ): Self = StObject.set(x, "errorCaptured", js.Any.fromFunction3(value))
    
    inline def setErrorCapturedUndefined: Self = StObject.set(x, "errorCaptured", js.undefined)
    
    inline def setExtends(value: Extends): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    inline def setFilters(value: Record[String, js.Function]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setInject(value: ComponentInjectOptions): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
    
    inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
    
    inline def setInjectVarargs(value: String*): Self = StObject.set(x, "inject", js.Array(value*))
    
    inline def setMethods(value: M): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    inline def setMixins(value: js.Array[Mixin]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
    
    inline def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
    
    inline def setMixinsVarargs(value: Mixin*): Self = StObject.set(x, "mixins", js.Array(value*))
    
    inline def setMounted(value: () => Unit): Self = StObject.set(x, "mounted", js.Any.fromFunction0(value))
    
    inline def setMountedUndefined: Self = StObject.set(x, "mounted", js.undefined)
    
    inline def setProvide(value: ComponentProvideOptions): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
    
    inline def setProvideUndefined: Self = StObject.set(x, "provide", js.undefined)
    
    inline def setRenderTracked(value: /* e */ DebuggerEvent => Unit): Self = StObject.set(x, "renderTracked", js.Any.fromFunction1(value))
    
    inline def setRenderTrackedUndefined: Self = StObject.set(x, "renderTracked", js.undefined)
    
    inline def setRenderTriggered(value: /* e */ DebuggerEvent => Unit): Self = StObject.set(x, "renderTriggered", js.Any.fromFunction1(value))
    
    inline def setRenderTriggeredUndefined: Self = StObject.set(x, "renderTriggered", js.undefined)
    
    inline def setUnmounted(value: () => Unit): Self = StObject.set(x, "unmounted", js.Any.fromFunction0(value))
    
    inline def setUnmountedUndefined: Self = StObject.set(x, "unmounted", js.undefined)
    
    inline def setUpdated(value: () => Unit): Self = StObject.set(x, "updated", js.Any.fromFunction0(value))
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setWatch(value: ComponentWatchOptions): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    
    inline def set__differentiator(value: /* keyof D */ String): Self = StObject.set(x, "__differentiator", value.asInstanceOf[js.Any])
    
    inline def set__differentiatorUndefined: Self = StObject.set(x, "__differentiator", js.undefined)
  }
}
