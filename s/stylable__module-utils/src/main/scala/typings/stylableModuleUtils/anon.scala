package typings.stylableModuleUtils

import typings.stylableModuleUtils.stylableModuleUtilsStrings.module
import typings.stylableModuleUtils.stylableModuleUtilsStrings.namespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@stylable/module-utils.@stylable/module-utils/cjs/module-factory.Options> */
  trait PartialOptions extends StObject {
    
    var injectCSS: js.UndefOr[Boolean] = js.undefined
    
    var renderableOnly: js.UndefOr[Boolean] = js.undefined
    
    var runtimePath: js.UndefOr[String] = js.undefined
    
    var runtimeStylesheetId: js.UndefOr[module | namespace] = js.undefined
    
    var staticImports: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInjectCSS(value: Boolean): Self = StObject.set(x, "injectCSS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectCSSUndefined: Self = StObject.set(x, "injectCSS", js.undefined)
      
      @scala.inline
      def setRenderableOnly(value: Boolean): Self = StObject.set(x, "renderableOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderableOnlyUndefined: Self = StObject.set(x, "renderableOnly", js.undefined)
      
      @scala.inline
      def setRuntimePath(value: String): Self = StObject.set(x, "runtimePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimePathUndefined: Self = StObject.set(x, "runtimePath", js.undefined)
      
      @scala.inline
      def setRuntimeStylesheetId(value: module | namespace): Self = StObject.set(x, "runtimeStylesheetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeStylesheetIdUndefined: Self = StObject.set(x, "runtimeStylesheetId", js.undefined)
      
      @scala.inline
      def setStaticImports(value: js.Array[String]): Self = StObject.set(x, "staticImports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticImportsUndefined: Self = StObject.set(x, "staticImports", js.undefined)
      
      @scala.inline
      def setStaticImportsVarargs(value: String*): Self = StObject.set(x, "staticImports", js.Array(value :_*))
    }
  }
}
