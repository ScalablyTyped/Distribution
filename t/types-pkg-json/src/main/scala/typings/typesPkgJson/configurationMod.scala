package typings.typesPkgJson

import typings.typesPkgJson.packageJsonMod.PackageJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationMod {
  
  trait ESLintConfiguration extends StObject {
    
    /**
      * Configuration settings for eslint.
      */
    var eslintConfig: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESLintConfig */ Any
      ] = js.undefined
  }
  object ESLintConfiguration {
    
    inline def apply(): ESLintConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ESLintConfiguration]
    }
    
    extension [Self <: ESLintConfiguration](x: Self) {
      
      inline def setEslintConfig(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESLintConfig */ Any
      ): Self = StObject.set(x, "eslintConfig", value.asInstanceOf[js.Any])
      
      inline def setEslintConfigUndefined: Self = StObject.set(x, "eslintConfig", js.undefined)
    }
  }
  
  trait JSPMConfiguration extends StObject {
    
    /**
      * JSPM configuration.
      */
    var jspm: js.UndefOr[PackageJSON] = js.undefined
  }
  object JSPMConfiguration {
    
    inline def apply(): JSPMConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSPMConfiguration]
    }
    
    extension [Self <: JSPMConfiguration](x: Self) {
      
      inline def setJspm(value: PackageJSON): Self = StObject.set(x, "jspm", value.asInstanceOf[js.Any])
      
      inline def setJspmUndefined: Self = StObject.set(x, "jspm", js.undefined)
    }
  }
  
  trait TypeScriptConfiguration extends StObject {
    
    /**
      * Location of the bundled TypeScript declaration file.
      */
    var types: js.UndefOr[String] = js.undefined
    
    /**
      * Location of the bundled TypeScript declaration file. Alias of `types`.
      */
    @JSName("typings")
    var typings_ : js.UndefOr[String] = js.undefined
  }
  object TypeScriptConfiguration {
    
    inline def apply(): TypeScriptConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeScriptConfiguration]
    }
    
    extension [Self <: TypeScriptConfiguration](x: Self) {
      
      inline def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setTypings_(value: String): Self = StObject.set(x, "typings", value.asInstanceOf[js.Any])
      
      inline def setTypings_Undefined: Self = StObject.set(x, "typings", js.undefined)
    }
  }
}
