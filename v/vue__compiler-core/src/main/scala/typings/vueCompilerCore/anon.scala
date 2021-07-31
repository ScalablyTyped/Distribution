package typings.vueCompilerCore

import typings.vueCompilerCore.mod.BindingMetadata
import typings.vueCompilerCore.mod.CodegenContext
import typings.vueCompilerCore.mod.DirectiveNode
import typings.vueCompilerCore.mod.PropsExpression
import typings.vueCompilerCore.mod.SlotsExpression
import typings.vueCompilerCore.vueCompilerCoreStrings.function
import typings.vueCompilerCore.vueCompilerCoreStrings.module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @vue/compiler-core.@vue/compiler-core.CodegenOptions & {  onContextCreated :(context : @vue/compiler-core.@vue/compiler-core.CodegenContext): void | undefined} */
  trait CodegenOptionsonContextCr extends StObject {
    
    var bindingMetadata: js.UndefOr[BindingMetadata] = js.undefined
    
    /**
      * Filename for source map generation.
      * @default 'template.vue.html'
      */
    var filename: js.UndefOr[String] = js.undefined
    
    /**
      * - `module` mode will generate ES module import statements for helpers
      * and export the render function as the default export.
      * - `function` mode will generate a single `const { helpers... } = Vue`
      * statement and return the render function. It expects `Vue` to be globally
      * available (or passed by wrapping the code with an IIFE). It is meant to be
      * used with `new Function(code)()` to generate a render function at runtime.
      * @default 'function'
      */
    var mode: js.UndefOr[module | function] = js.undefined
    
    var onContextCreated: js.UndefOr[js.Function1[/* context */ CodegenContext, Unit]] = js.undefined
    
    /**
      * Option to optimize helper import bindings via variable assignment
      * (only used for webpack code-split)
      * @default false
      */
    var optimizeImports: js.UndefOr[Boolean] = js.undefined
    
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
    
    var ssr: js.UndefOr[Boolean] = js.undefined
  }
  object CodegenOptionsonContextCr {
    
    @scala.inline
    def apply(): CodegenOptionsonContextCr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodegenOptionsonContextCr]
    }
    
    @scala.inline
    implicit class CodegenOptionsonContextCrMutableBuilder[Self <: CodegenOptionsonContextCr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBindingMetadata(value: BindingMetadata): Self = StObject.set(x, "bindingMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindingMetadataUndefined: Self = StObject.set(x, "bindingMetadata", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setMode(value: module | function): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOnContextCreated(value: /* context */ CodegenContext => Unit): Self = StObject.set(x, "onContextCreated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextCreatedUndefined: Self = StObject.set(x, "onContextCreated", js.undefined)
      
      @scala.inline
      def setOptimizeImports(value: Boolean): Self = StObject.set(x, "optimizeImports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizeImportsUndefined: Self = StObject.set(x, "optimizeImports", js.undefined)
      
      @scala.inline
      def setPrefixIdentifiers(value: Boolean): Self = StObject.set(x, "prefixIdentifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixIdentifiersUndefined: Self = StObject.set(x, "prefixIdentifiers", js.undefined)
      
      @scala.inline
      def setRuntimeGlobalName(value: String): Self = StObject.set(x, "runtimeGlobalName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeGlobalNameUndefined: Self = StObject.set(x, "runtimeGlobalName", js.undefined)
      
      @scala.inline
      def setRuntimeModuleName(value: String): Self = StObject.set(x, "runtimeModuleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeModuleNameUndefined: Self = StObject.set(x, "runtimeModuleName", js.undefined)
      
      @scala.inline
      def setScopeId(value: String): Self = StObject.set(x, "scopeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeIdNull: Self = StObject.set(x, "scopeId", null)
      
      @scala.inline
      def setScopeIdUndefined: Self = StObject.set(x, "scopeId", js.undefined)
      
      @scala.inline
      def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      @scala.inline
      def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
    }
  }
  
  trait Directives extends StObject {
    
    var directives: js.Array[DirectiveNode]
    
    var dynamicPropNames: js.Array[String]
    
    var patchFlag: Double
    
    var props: js.UndefOr[PropsExpression] = js.undefined
  }
  object Directives {
    
    @scala.inline
    def apply(directives: js.Array[DirectiveNode], dynamicPropNames: js.Array[String], patchFlag: Double): Directives = {
      val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], dynamicPropNames = dynamicPropNames.asInstanceOf[js.Any], patchFlag = patchFlag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Directives]
    }
    
    @scala.inline
    implicit class DirectivesMutableBuilder[Self <: Directives] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectives(value: js.Array[DirectiveNode]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectivesVarargs(value: DirectiveNode*): Self = StObject.set(x, "directives", js.Array(value :_*))
      
      @scala.inline
      def setDynamicPropNames(value: js.Array[String]): Self = StObject.set(x, "dynamicPropNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicPropNamesVarargs(value: String*): Self = StObject.set(x, "dynamicPropNames", js.Array(value :_*))
      
      @scala.inline
      def setPatchFlag(value: Double): Self = StObject.set(x, "patchFlag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: PropsExpression): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
  
  trait HasDynamicSlots extends StObject {
    
    var hasDynamicSlots: Boolean
    
    var slots: SlotsExpression
  }
  object HasDynamicSlots {
    
    @scala.inline
    def apply(hasDynamicSlots: Boolean, slots: SlotsExpression): HasDynamicSlots = {
      val __obj = js.Dynamic.literal(hasDynamicSlots = hasDynamicSlots.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasDynamicSlots]
    }
    
    @scala.inline
    implicit class HasDynamicSlotsMutableBuilder[Self <: HasDynamicSlots] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasDynamicSlots(value: Boolean): Self = StObject.set(x, "hasDynamicSlots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlots(value: SlotsExpression): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    }
  }
  
  trait VFor extends StObject {
    
    var vFor: Double
    
    var vOnce: Double
    
    var vPre: Double
    
    var vSlot: Double
  }
  object VFor {
    
    @scala.inline
    def apply(vFor: Double, vOnce: Double, vPre: Double, vSlot: Double): VFor = {
      val __obj = js.Dynamic.literal(vFor = vFor.asInstanceOf[js.Any], vOnce = vOnce.asInstanceOf[js.Any], vPre = vPre.asInstanceOf[js.Any], vSlot = vSlot.asInstanceOf[js.Any])
      __obj.asInstanceOf[VFor]
    }
    
    @scala.inline
    implicit class VForMutableBuilder[Self <: VFor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVFor(value: Double): Self = StObject.set(x, "vFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVOnce(value: Double): Self = StObject.set(x, "vOnce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVPre(value: Double): Self = StObject.set(x, "vPre", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVSlot(value: Double): Self = StObject.set(x, "vSlot", value.asInstanceOf[js.Any])
    }
  }
}
