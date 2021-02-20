package typings.vueCompilerSfc

import typings.vueCompilerSfc.vueCompilerSfcStrings.camelCase
import typings.vueCompilerSfc.vueCompilerSfcStrings.camelCaseOnly
import typings.vueCompilerSfc.vueCompilerSfcStrings.dashes
import typings.vueCompilerSfc.vueCompilerSfcStrings.dashesOnly
import typings.vueCompilerSfc.vueCompilerSfcStrings.global
import typings.vueCompilerSfc.vueCompilerSfcStrings.local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait GenerateScopedName extends StObject {
    
    var generateScopedName: js.UndefOr[
        String | (js.Function3[/* name */ String, /* filename */ String, /* css */ String, String])
      ] = js.native
    
    var globalModulePaths: js.UndefOr[js.Array[String]] = js.native
    
    var hashPrefix: js.UndefOr[String] = js.native
    
    var localsConvention: js.UndefOr[camelCase | camelCaseOnly | dashes | dashesOnly] = js.native
    
    var scopeBehaviour: js.UndefOr[global | local] = js.native
  }
  object GenerateScopedName {
    
    @scala.inline
    def apply(): GenerateScopedName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateScopedName]
    }
    
    @scala.inline
    implicit class GenerateScopedNameMutableBuilder[Self <: GenerateScopedName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGenerateScopedName(value: String | (js.Function3[/* name */ String, /* filename */ String, /* css */ String, String])): Self = StObject.set(x, "generateScopedName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateScopedNameFunction3(value: (/* name */ String, /* filename */ String, /* css */ String) => String): Self = StObject.set(x, "generateScopedName", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGenerateScopedNameUndefined: Self = StObject.set(x, "generateScopedName", js.undefined)
      
      @scala.inline
      def setGlobalModulePaths(value: js.Array[String]): Self = StObject.set(x, "globalModulePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalModulePathsUndefined: Self = StObject.set(x, "globalModulePaths", js.undefined)
      
      @scala.inline
      def setGlobalModulePathsVarargs(value: String*): Self = StObject.set(x, "globalModulePaths", js.Array(value :_*))
      
      @scala.inline
      def setHashPrefix(value: String): Self = StObject.set(x, "hashPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashPrefixUndefined: Self = StObject.set(x, "hashPrefix", js.undefined)
      
      @scala.inline
      def setLocalsConvention(value: camelCase | camelCaseOnly | dashes | dashesOnly): Self = StObject.set(x, "localsConvention", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalsConventionUndefined: Self = StObject.set(x, "localsConvention", js.undefined)
      
      @scala.inline
      def setScopeBehaviour(value: global | local): Self = StObject.set(x, "scopeBehaviour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeBehaviourUndefined: Self = StObject.set(x, "scopeBehaviour", js.undefined)
    }
  }
}
