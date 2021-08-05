package typings.vueCompilerSfc

import typings.vueCompilerSfc.vueCompilerSfcStrings.camelCase
import typings.vueCompilerSfc.vueCompilerSfcStrings.camelCaseOnly
import typings.vueCompilerSfc.vueCompilerSfcStrings.dashes
import typings.vueCompilerSfc.vueCompilerSfcStrings.dashesOnly
import typings.vueCompilerSfc.vueCompilerSfcStrings.global
import typings.vueCompilerSfc.vueCompilerSfcStrings.local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait GenerateScopedName extends StObject {
    
    var generateScopedName: js.UndefOr[
        String | (js.Function3[/* name */ String, /* filename */ String, /* css */ String, String])
      ] = js.undefined
    
    var globalModulePaths: js.UndefOr[js.Array[String]] = js.undefined
    
    var hashPrefix: js.UndefOr[String] = js.undefined
    
    var localsConvention: js.UndefOr[camelCase | camelCaseOnly | dashes | dashesOnly] = js.undefined
    
    var scopeBehaviour: js.UndefOr[global | local] = js.undefined
  }
  object GenerateScopedName {
    
    inline def apply(): GenerateScopedName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateScopedName]
    }
    
    extension [Self <: GenerateScopedName](x: Self) {
      
      inline def setGenerateScopedName(value: String | (js.Function3[/* name */ String, /* filename */ String, /* css */ String, String])): Self = StObject.set(x, "generateScopedName", value.asInstanceOf[js.Any])
      
      inline def setGenerateScopedNameFunction3(value: (/* name */ String, /* filename */ String, /* css */ String) => String): Self = StObject.set(x, "generateScopedName", js.Any.fromFunction3(value))
      
      inline def setGenerateScopedNameUndefined: Self = StObject.set(x, "generateScopedName", js.undefined)
      
      inline def setGlobalModulePaths(value: js.Array[String]): Self = StObject.set(x, "globalModulePaths", value.asInstanceOf[js.Any])
      
      inline def setGlobalModulePathsUndefined: Self = StObject.set(x, "globalModulePaths", js.undefined)
      
      inline def setGlobalModulePathsVarargs(value: String*): Self = StObject.set(x, "globalModulePaths", js.Array(value :_*))
      
      inline def setHashPrefix(value: String): Self = StObject.set(x, "hashPrefix", value.asInstanceOf[js.Any])
      
      inline def setHashPrefixUndefined: Self = StObject.set(x, "hashPrefix", js.undefined)
      
      inline def setLocalsConvention(value: camelCase | camelCaseOnly | dashes | dashesOnly): Self = StObject.set(x, "localsConvention", value.asInstanceOf[js.Any])
      
      inline def setLocalsConventionUndefined: Self = StObject.set(x, "localsConvention", js.undefined)
      
      inline def setScopeBehaviour(value: global | local): Self = StObject.set(x, "scopeBehaviour", value.asInstanceOf[js.Any])
      
      inline def setScopeBehaviourUndefined: Self = StObject.set(x, "scopeBehaviour", js.undefined)
    }
  }
}
