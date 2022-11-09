package typings.vueRuntimeCore.mod

import typings.std.Record
import typings.std.ThisType
import typings.vueShared.mod.LooseRequired
import typings.vueShared.mod.UnionToIntersection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentOptionsBase[Props, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, Defaults, I /* <: ComponentInjectOptions */, II /* <: String */]
  extends StObject
     with LegacyOptions[Props, D, C, M, Mixin, Extends, I, II]
     with ComponentInternalOptions
     with ComponentCustomOptions {
  
  var __defaults: js.UndefOr[Defaults] = js.undefined
  
  var __isFragment: js.UndefOr[scala.Nothing] = js.undefined
  
  var __isSuspense: js.UndefOr[scala.Nothing] = js.undefined
  
  var __isTeleport: js.UndefOr[scala.Nothing] = js.undefined
  
  /* Excluded from this release type: ssrRender */
  /* Excluded from this release type: __ssrInlineRender */
  /* Excluded from this release type: __asyncLoader */
  /* Excluded from this release type: __asyncResolved */
  var call: js.UndefOr[js.ThisFunction1[/* this */ Any, /* repeated */ Any, scala.Nothing]] = js.undefined
  
  var compilerOptions: js.UndefOr[RuntimeCompilerOptions] = js.undefined
  
  var components: js.UndefOr[Record[String, Component[Any, Any, Any, ComputedOptions, MethodOptions]]] = js.undefined
  
  var directives: js.UndefOr[Record[String, Directive[Any, Any]]] = js.undefined
  
  var emits: js.UndefOr[(E & ThisType[Unit]) | (js.Array[EE] & ThisType[Unit])] = js.undefined
  
  var expose: js.UndefOr[js.Array[String]] = js.undefined
  
  var inheritAttrs: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var render: js.UndefOr[js.Function] = js.undefined
  
  var serverPrefetch: js.UndefOr[js.Function0[js.Promise[Any]]] = js.undefined
  
  var setup: js.UndefOr[
    js.ThisFunction2[
      /* this */ Unit, 
      /* props */ LooseRequired[
        Props & UnionToIntersection[ExtractOptionProp[Mixin]] & UnionToIntersection[ExtractOptionProp[Extends]]
      ], 
      /* ctx */ SetupContext[E], 
      js.Promise[RawBindings] | RawBindings | RenderFunction | Unit
    ]
  ] = js.undefined
  
  var template: js.UndefOr[String | js.Object] = js.undefined
}
object ComponentOptionsBase {
  
  inline def apply[Props, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, Defaults, I /* <: ComponentInjectOptions */, II /* <: String */](): ComponentOptionsBase[Props, RawBindings, D, C, M, Mixin, Extends, E, EE, Defaults, I, II] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptionsBase[Props, RawBindings, D, C, M, Mixin, Extends, E, EE, Defaults, I, II]]
  }
  
  extension [Self <: ComponentOptionsBase[?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?], Props, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, Defaults, I /* <: ComponentInjectOptions */, II /* <: String */](x: Self & (ComponentOptionsBase[Props, RawBindings, D, C, M, Mixin, Extends, E, EE, Defaults, I, II])) {
    
    inline def setCall(value: js.ThisFunction1[/* this */ Any, /* repeated */ Any, scala.Nothing]): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
    
    inline def setCallUndefined: Self = StObject.set(x, "call", js.undefined)
    
    inline def setCompilerOptions(value: RuntimeCompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
    
    inline def setComponents(value: Record[String, Component[Any, Any, Any, ComputedOptions, MethodOptions]]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setDirectives(value: Record[String, Directive[Any, Any]]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
    
    inline def setEmits(value: (E & ThisType[Unit]) | (js.Array[EE] & ThisType[Unit])): Self = StObject.set(x, "emits", value.asInstanceOf[js.Any])
    
    inline def setEmitsUndefined: Self = StObject.set(x, "emits", js.undefined)
    
    inline def setExpose(value: js.Array[String]): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
    
    inline def setExposeUndefined: Self = StObject.set(x, "expose", js.undefined)
    
    inline def setExposeVarargs(value: String*): Self = StObject.set(x, "expose", js.Array(value*))
    
    inline def setInheritAttrs(value: Boolean): Self = StObject.set(x, "inheritAttrs", value.asInstanceOf[js.Any])
    
    inline def setInheritAttrsUndefined: Self = StObject.set(x, "inheritAttrs", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRender(value: js.Function): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setServerPrefetch(value: () => js.Promise[Any]): Self = StObject.set(x, "serverPrefetch", js.Any.fromFunction0(value))
    
    inline def setServerPrefetchUndefined: Self = StObject.set(x, "serverPrefetch", js.undefined)
    
    inline def setSetup(
      value: js.ThisFunction2[
          /* this */ Unit, 
          /* props */ LooseRequired[
            Props & UnionToIntersection[ExtractOptionProp[Mixin]] & UnionToIntersection[ExtractOptionProp[Extends]]
          ], 
          /* ctx */ SetupContext[E], 
          js.Promise[RawBindings] | RawBindings | RenderFunction | Unit
        ]
    ): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
    
    inline def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
    
    inline def setTemplate(value: String | js.Object): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def set__defaults(value: Defaults): Self = StObject.set(x, "__defaults", value.asInstanceOf[js.Any])
    
    inline def set__defaultsUndefined: Self = StObject.set(x, "__defaults", js.undefined)
  }
}
