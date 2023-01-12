package typings.vueCompilerSfc.mod

import typings.vueCompilerSfc.vueCompilerSfcStrings.camelCase
import typings.vueCompilerSfc.vueCompilerSfcStrings.camelCaseOnly
import typings.vueCompilerSfc.vueCompilerSfcStrings.dashes
import typings.vueCompilerSfc.vueCompilerSfcStrings.dashesOnly
import typings.vueCompilerSfc.vueCompilerSfcStrings.global
import typings.vueCompilerSfc.vueCompilerSfcStrings.local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Aligns with postcss-modules
  * https://github.com/css-modules/postcss-modules
  */
trait CSSModulesOptions extends StObject {
  
  var exportGlobals: js.UndefOr[Boolean] = js.undefined
  
  var generateScopedName: js.UndefOr[
    String | (js.Function3[/* name */ String, /* filename */ String, /* css */ String, String])
  ] = js.undefined
  
  var globalModulePaths: js.UndefOr[js.Array[js.RegExp]] = js.undefined
  
  var hashPrefix: js.UndefOr[String] = js.undefined
  
  var localsConvention: js.UndefOr[camelCase | camelCaseOnly | dashes | dashesOnly] = js.undefined
  
  var scopeBehaviour: js.UndefOr[global | local] = js.undefined
}
object CSSModulesOptions {
  
  inline def apply(): CSSModulesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSModulesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSModulesOptions] (val x: Self) extends AnyVal {
    
    inline def setExportGlobals(value: Boolean): Self = StObject.set(x, "exportGlobals", value.asInstanceOf[js.Any])
    
    inline def setExportGlobalsUndefined: Self = StObject.set(x, "exportGlobals", js.undefined)
    
    inline def setGenerateScopedName(value: String | (js.Function3[/* name */ String, /* filename */ String, /* css */ String, String])): Self = StObject.set(x, "generateScopedName", value.asInstanceOf[js.Any])
    
    inline def setGenerateScopedNameFunction3(value: (/* name */ String, /* filename */ String, /* css */ String) => String): Self = StObject.set(x, "generateScopedName", js.Any.fromFunction3(value))
    
    inline def setGenerateScopedNameUndefined: Self = StObject.set(x, "generateScopedName", js.undefined)
    
    inline def setGlobalModulePaths(value: js.Array[js.RegExp]): Self = StObject.set(x, "globalModulePaths", value.asInstanceOf[js.Any])
    
    inline def setGlobalModulePathsUndefined: Self = StObject.set(x, "globalModulePaths", js.undefined)
    
    inline def setGlobalModulePathsVarargs(value: js.RegExp*): Self = StObject.set(x, "globalModulePaths", js.Array(value*))
    
    inline def setHashPrefix(value: String): Self = StObject.set(x, "hashPrefix", value.asInstanceOf[js.Any])
    
    inline def setHashPrefixUndefined: Self = StObject.set(x, "hashPrefix", js.undefined)
    
    inline def setLocalsConvention(value: camelCase | camelCaseOnly | dashes | dashesOnly): Self = StObject.set(x, "localsConvention", value.asInstanceOf[js.Any])
    
    inline def setLocalsConventionUndefined: Self = StObject.set(x, "localsConvention", js.undefined)
    
    inline def setScopeBehaviour(value: global | local): Self = StObject.set(x, "scopeBehaviour", value.asInstanceOf[js.Any])
    
    inline def setScopeBehaviourUndefined: Self = StObject.set(x, "scopeBehaviour", js.undefined)
  }
}
