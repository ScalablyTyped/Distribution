package typings.stylableNode

import typings.std.Partial
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Errors extends StObject {
    
    var errors: js.Array[js.Error]
    
    var result: Set[String]
  }
  object Errors {
    
    inline def apply(errors: js.Array[js.Error], result: Set[String]): Errors = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errors]
    }
    
    extension [Self <: Errors](x: Self) {
      
      inline def setErrors(value: js.Array[js.Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: js.Error*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setResult(value: Set[String]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@stylable/node.@stylable/node/dist/require-hook.Options> */
  trait PartialOptions extends StObject {
    
    var afterCompile: js.UndefOr[js.Function2[/* code */ String, /* filename */ String, String]] = js.undefined
    
    var ignoreJSModules: js.UndefOr[Boolean] = js.undefined
    
    var matcher: js.UndefOr[js.Function1[/* filename */ String, Boolean]] = js.undefined
    
    var runtimePath: js.UndefOr[String] = js.undefined
    
    var stylableConfig: js.UndefOr[
        Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StylableConfig */ Any
        ]
      ] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setAfterCompile(value: (/* code */ String, /* filename */ String) => String): Self = StObject.set(x, "afterCompile", js.Any.fromFunction2(value))
      
      inline def setAfterCompileUndefined: Self = StObject.set(x, "afterCompile", js.undefined)
      
      inline def setIgnoreJSModules(value: Boolean): Self = StObject.set(x, "ignoreJSModules", value.asInstanceOf[js.Any])
      
      inline def setIgnoreJSModulesUndefined: Self = StObject.set(x, "ignoreJSModules", js.undefined)
      
      inline def setMatcher(value: /* filename */ String => Boolean): Self = StObject.set(x, "matcher", js.Any.fromFunction1(value))
      
      inline def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
      
      inline def setRuntimePath(value: String): Self = StObject.set(x, "runtimePath", value.asInstanceOf[js.Any])
      
      inline def setRuntimePathUndefined: Self = StObject.set(x, "runtimePath", js.undefined)
      
      inline def setStylableConfig(
        value: Partial[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StylableConfig */ Any
            ]
      ): Self = StObject.set(x, "stylableConfig", value.asInstanceOf[js.Any])
      
      inline def setStylableConfigUndefined: Self = StObject.set(x, "stylableConfig", js.undefined)
    }
  }
  
  /* Inlined std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IFileSystem * / any, 'readdirSync' | 'statSync'> */
  trait PickanyreaddirSyncstatSyn extends StObject {
    
    var readdirSync: js.UndefOr[Any] = js.undefined
    
    var statSync: js.UndefOr[Any] = js.undefined
  }
  object PickanyreaddirSyncstatSyn {
    
    inline def apply(): PickanyreaddirSyncstatSyn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickanyreaddirSyncstatSyn]
    }
    
    extension [Self <: PickanyreaddirSyncstatSyn](x: Self) {
      
      inline def setReaddirSync(value: Any): Self = StObject.set(x, "readdirSync", value.asInstanceOf[js.Any])
      
      inline def setReaddirSyncUndefined: Self = StObject.set(x, "readdirSync", js.undefined)
      
      inline def setStatSync(value: Any): Self = StObject.set(x, "statSync", value.asInstanceOf[js.Any])
      
      inline def setStatSyncUndefined: Self = StObject.set(x, "statSync", js.undefined)
    }
  }
}
