package typings.vite.mod

import typings.std.Record
import typings.vite.viteStrings.camelCase
import typings.vite.viteStrings.camelCaseOnly
import typings.vite.viteStrings.dashes
import typings.vite.viteStrings.dashesOnly
import typings.vite.viteStrings.global
import typings.vite.viteStrings.local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSModulesOptions extends StObject {
  
  var generateScopedName: js.UndefOr[
    String | (js.Function3[/* name */ String, /* filename */ String, /* css */ String, String])
  ] = js.undefined
  
  var getJSON: js.UndefOr[
    js.Function3[
      /* cssFileName */ String, 
      /* json */ Record[String, String], 
      /* outputFileName */ String, 
      Unit
    ]
  ] = js.undefined
  
  var globalModulePaths: js.UndefOr[js.Array[js.RegExp]] = js.undefined
  
  var hashPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * default: null
    */
  var localsConvention: js.UndefOr[camelCase | camelCaseOnly | dashes | dashesOnly | Null] = js.undefined
  
  var scopeBehaviour: js.UndefOr[global | local] = js.undefined
}
object CSSModulesOptions {
  
  inline def apply(): CSSModulesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSModulesOptions]
  }
  
  extension [Self <: CSSModulesOptions](x: Self) {
    
    inline def setGenerateScopedName(value: String | (js.Function3[/* name */ String, /* filename */ String, /* css */ String, String])): Self = StObject.set(x, "generateScopedName", value.asInstanceOf[js.Any])
    
    inline def setGenerateScopedNameFunction3(value: (/* name */ String, /* filename */ String, /* css */ String) => String): Self = StObject.set(x, "generateScopedName", js.Any.fromFunction3(value))
    
    inline def setGenerateScopedNameUndefined: Self = StObject.set(x, "generateScopedName", js.undefined)
    
    inline def setGetJSON(
      value: (/* cssFileName */ String, /* json */ Record[String, String], /* outputFileName */ String) => Unit
    ): Self = StObject.set(x, "getJSON", js.Any.fromFunction3(value))
    
    inline def setGetJSONUndefined: Self = StObject.set(x, "getJSON", js.undefined)
    
    inline def setGlobalModulePaths(value: js.Array[js.RegExp]): Self = StObject.set(x, "globalModulePaths", value.asInstanceOf[js.Any])
    
    inline def setGlobalModulePathsUndefined: Self = StObject.set(x, "globalModulePaths", js.undefined)
    
    inline def setGlobalModulePathsVarargs(value: js.RegExp*): Self = StObject.set(x, "globalModulePaths", js.Array(value*))
    
    inline def setHashPrefix(value: String): Self = StObject.set(x, "hashPrefix", value.asInstanceOf[js.Any])
    
    inline def setHashPrefixUndefined: Self = StObject.set(x, "hashPrefix", js.undefined)
    
    inline def setLocalsConvention(value: camelCase | camelCaseOnly | dashes | dashesOnly): Self = StObject.set(x, "localsConvention", value.asInstanceOf[js.Any])
    
    inline def setLocalsConventionNull: Self = StObject.set(x, "localsConvention", null)
    
    inline def setLocalsConventionUndefined: Self = StObject.set(x, "localsConvention", js.undefined)
    
    inline def setScopeBehaviour(value: global | local): Self = StObject.set(x, "scopeBehaviour", value.asInstanceOf[js.Any])
    
    inline def setScopeBehaviourUndefined: Self = StObject.set(x, "scopeBehaviour", js.undefined)
  }
}
