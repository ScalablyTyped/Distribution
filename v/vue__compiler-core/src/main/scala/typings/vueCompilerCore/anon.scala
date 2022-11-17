package typings.vueCompilerCore

import typings.vueCompilerCore.mod.BindingMetadata
import typings.vueCompilerCore.mod.CodegenContext
import typings.vueCompilerCore.mod.DirectiveNode
import typings.vueCompilerCore.mod.PropsExpression
import typings.vueCompilerCore.mod.SlotsExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @vue/compiler-core.@vue/compiler-core.CodegenOptions & {  onContextCreated :(context : @vue/compiler-core.@vue/compiler-core.CodegenContext): void | undefined} */
  trait CodegenOptionsonContextCr extends StObject {
    
    /**
      * Optional binding metadata analyzed from script - used to optimize
      * binding access when `prefixIdentifiers` is enabled.
      */
    var bindingMetadata: js.UndefOr[BindingMetadata] = js.undefined
    
    /**
      * Filename for source map generation.
      * Also used for self-recursive reference in templates
      * @default 'template.vue.html'
      */
    var filename: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates whether the compiler generates code for SSR,
      * it is always true when generating code for SSR,
      * regardless of whether we are generating code for SSR's fallback branch,
      * this means that when the compiler generates code for SSR's fallback branch:
      *  - context.ssr = false
      *  - context.inSSR = true
      */
    var inSSR: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Compile the function for inlining inside setup().
      * This allows the function to directly access setup() local bindings.
      */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates that transforms and codegen should try to output valid TS code
      */
    var isTS: js.UndefOr[Boolean] = js.undefined
    
    /**
      * - `module` mode will generate ES module import statements for helpers
      * and export the render function as the default export.
      * - `function` mode will generate a single `const { helpers... } = Vue`
      * statement and return the render function. It expects `Vue` to be globally
      * available (or passed by wrapping the code with an IIFE). It is meant to be
      * used with `new Function(code)()` to generate a render function at runtime.
      * @default 'function'
      */
    var mode: js.UndefOr["module" | "function"] = js.undefined
    
    var onContextCreated: js.UndefOr[js.Function1[/* context */ CodegenContext, Unit]] = js.undefined
    
    /**
      * Option to optimize helper import bindings via variable assignment
      * (only used for webpack code-split)
      * @default false
      */
    var optimizeImports: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Transform expressions like {{ foo }} to `_ctx.foo`.
      * If this option is false, the generated code will be wrapped in a
      * `with (this) { ... }` block.
      * - This is force-enabled in module mode, since modules are by default strict
      * and cannot use `with`
      * @default mode === 'module'
      */
    var prefixIdentifiers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Customize the global variable name of `Vue` to get helpers from
      * in function mode
      * @default 'Vue'
      */
    var runtimeGlobalName: js.UndefOr[String] = js.undefined
    
    /**
      * Customize where to import runtime helpers from.
      * @default 'vue'
      */
    var runtimeModuleName: js.UndefOr[String] = js.undefined
    
    /**
      * SFC scoped styles ID
      */
    var scopeId: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Generate source map?
      * @default false
      */
    var sourceMap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Control whether generate SSR-optimized render functions instead.
      * The resulting function must be attached to the component via the
      * `ssrRender` option instead of `render`.
      *
      * When compiler generates code for SSR's fallback branch, we need to set it to false:
      *  - context.ssr = false
      *
      * see `subTransform` in `ssrTransformComponent.ts`
      */
    var ssr: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Customize where to import ssr runtime helpers from/ **
      * @default 'vue/server-renderer'
      */
    var ssrRuntimeModuleName: js.UndefOr[String] = js.undefined
  }
  object CodegenOptionsonContextCr {
    
    inline def apply(): CodegenOptionsonContextCr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodegenOptionsonContextCr]
    }
    
    extension [Self <: CodegenOptionsonContextCr](x: Self) {
      
      inline def setBindingMetadata(value: BindingMetadata): Self = StObject.set(x, "bindingMetadata", value.asInstanceOf[js.Any])
      
      inline def setBindingMetadataUndefined: Self = StObject.set(x, "bindingMetadata", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setInSSR(value: Boolean): Self = StObject.set(x, "inSSR", value.asInstanceOf[js.Any])
      
      inline def setInSSRUndefined: Self = StObject.set(x, "inSSR", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setIsTS(value: Boolean): Self = StObject.set(x, "isTS", value.asInstanceOf[js.Any])
      
      inline def setIsTSUndefined: Self = StObject.set(x, "isTS", js.undefined)
      
      inline def setMode(value: "module" | "function"): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnContextCreated(value: /* context */ CodegenContext => Unit): Self = StObject.set(x, "onContextCreated", js.Any.fromFunction1(value))
      
      inline def setOnContextCreatedUndefined: Self = StObject.set(x, "onContextCreated", js.undefined)
      
      inline def setOptimizeImports(value: Boolean): Self = StObject.set(x, "optimizeImports", value.asInstanceOf[js.Any])
      
      inline def setOptimizeImportsUndefined: Self = StObject.set(x, "optimizeImports", js.undefined)
      
      inline def setPrefixIdentifiers(value: Boolean): Self = StObject.set(x, "prefixIdentifiers", value.asInstanceOf[js.Any])
      
      inline def setPrefixIdentifiersUndefined: Self = StObject.set(x, "prefixIdentifiers", js.undefined)
      
      inline def setRuntimeGlobalName(value: String): Self = StObject.set(x, "runtimeGlobalName", value.asInstanceOf[js.Any])
      
      inline def setRuntimeGlobalNameUndefined: Self = StObject.set(x, "runtimeGlobalName", js.undefined)
      
      inline def setRuntimeModuleName(value: String): Self = StObject.set(x, "runtimeModuleName", value.asInstanceOf[js.Any])
      
      inline def setRuntimeModuleNameUndefined: Self = StObject.set(x, "runtimeModuleName", js.undefined)
      
      inline def setScopeId(value: String): Self = StObject.set(x, "scopeId", value.asInstanceOf[js.Any])
      
      inline def setScopeIdNull: Self = StObject.set(x, "scopeId", null)
      
      inline def setScopeIdUndefined: Self = StObject.set(x, "scopeId", js.undefined)
      
      inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
      
      inline def setSsrRuntimeModuleName(value: String): Self = StObject.set(x, "ssrRuntimeModuleName", value.asInstanceOf[js.Any])
      
      inline def setSsrRuntimeModuleNameUndefined: Self = StObject.set(x, "ssrRuntimeModuleName", js.undefined)
      
      inline def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
    }
  }
  
  trait Directives extends StObject {
    
    var directives: js.Array[DirectiveNode]
    
    var dynamicPropNames: js.Array[String]
    
    var patchFlag: Double
    
    var props: js.UndefOr[PropsExpression] = js.undefined
    
    var shouldUseBlock: Boolean
  }
  object Directives {
    
    inline def apply(
      directives: js.Array[DirectiveNode],
      dynamicPropNames: js.Array[String],
      patchFlag: Double,
      shouldUseBlock: Boolean
    ): Directives = {
      val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], dynamicPropNames = dynamicPropNames.asInstanceOf[js.Any], patchFlag = patchFlag.asInstanceOf[js.Any], shouldUseBlock = shouldUseBlock.asInstanceOf[js.Any])
      __obj.asInstanceOf[Directives]
    }
    
    extension [Self <: Directives](x: Self) {
      
      inline def setDirectives(value: js.Array[DirectiveNode]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      inline def setDirectivesVarargs(value: DirectiveNode*): Self = StObject.set(x, "directives", js.Array(value*))
      
      inline def setDynamicPropNames(value: js.Array[String]): Self = StObject.set(x, "dynamicPropNames", value.asInstanceOf[js.Any])
      
      inline def setDynamicPropNamesVarargs(value: String*): Self = StObject.set(x, "dynamicPropNames", js.Array(value*))
      
      inline def setPatchFlag(value: Double): Self = StObject.set(x, "patchFlag", value.asInstanceOf[js.Any])
      
      inline def setProps(value: PropsExpression): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setShouldUseBlock(value: Boolean): Self = StObject.set(x, "shouldUseBlock", value.asInstanceOf[js.Any])
    }
  }
  
  trait HasDynamicSlots extends StObject {
    
    var hasDynamicSlots: Boolean
    
    var slots: SlotsExpression
  }
  object HasDynamicSlots {
    
    inline def apply(hasDynamicSlots: Boolean, slots: SlotsExpression): HasDynamicSlots = {
      val __obj = js.Dynamic.literal(hasDynamicSlots = hasDynamicSlots.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasDynamicSlots]
    }
    
    extension [Self <: HasDynamicSlots](x: Self) {
      
      inline def setHasDynamicSlots(value: Boolean): Self = StObject.set(x, "hasDynamicSlots", value.asInstanceOf[js.Any])
      
      inline def setSlots(value: SlotsExpression): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    }
  }
  
  trait VFor extends StObject {
    
    var vFor: Double
    
    var vOnce: Double
    
    var vPre: Double
    
    var vSlot: Double
  }
  object VFor {
    
    inline def apply(vFor: Double, vOnce: Double, vPre: Double, vSlot: Double): VFor = {
      val __obj = js.Dynamic.literal(vFor = vFor.asInstanceOf[js.Any], vOnce = vOnce.asInstanceOf[js.Any], vPre = vPre.asInstanceOf[js.Any], vSlot = vSlot.asInstanceOf[js.Any])
      __obj.asInstanceOf[VFor]
    }
    
    extension [Self <: VFor](x: Self) {
      
      inline def setVFor(value: Double): Self = StObject.set(x, "vFor", value.asInstanceOf[js.Any])
      
      inline def setVOnce(value: Double): Self = StObject.set(x, "vOnce", value.asInstanceOf[js.Any])
      
      inline def setVPre(value: Double): Self = StObject.set(x, "vPre", value.asInstanceOf[js.Any])
      
      inline def setVSlot(value: Double): Self = StObject.set(x, "vSlot", value.asInstanceOf[js.Any])
    }
  }
}
