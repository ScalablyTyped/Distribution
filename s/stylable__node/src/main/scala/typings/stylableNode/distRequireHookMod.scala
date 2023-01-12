package typings.stylableNode

import typings.std.Partial
import typings.stylableNode.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRequireHookMod {
  
  @JSImport("@stylable/node/dist/require-hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachHook(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachHook")().asInstanceOf[Unit]
  inline def attachHook(param0: PartialOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachHook")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var afterCompile: js.UndefOr[js.Function2[/* code */ String, /* filename */ String, String]] = js.undefined
    
    var ignoreJSModules: js.UndefOr[Boolean] = js.undefined
    
    def matcher(filename: String): Boolean
    
    var runtimePath: js.UndefOr[String] = js.undefined
    
    var stylableConfig: Partial[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StylableConfig */ Any
      ]
  }
  object Options {
    
    inline def apply(
      matcher: String => Boolean,
      stylableConfig: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StylableConfig */ Any
        ]
    ): Options = {
      val __obj = js.Dynamic.literal(matcher = js.Any.fromFunction1(matcher), stylableConfig = stylableConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAfterCompile(value: (/* code */ String, /* filename */ String) => String): Self = StObject.set(x, "afterCompile", js.Any.fromFunction2(value))
      
      inline def setAfterCompileUndefined: Self = StObject.set(x, "afterCompile", js.undefined)
      
      inline def setIgnoreJSModules(value: Boolean): Self = StObject.set(x, "ignoreJSModules", value.asInstanceOf[js.Any])
      
      inline def setIgnoreJSModulesUndefined: Self = StObject.set(x, "ignoreJSModules", js.undefined)
      
      inline def setMatcher(value: String => Boolean): Self = StObject.set(x, "matcher", js.Any.fromFunction1(value))
      
      inline def setRuntimePath(value: String): Self = StObject.set(x, "runtimePath", value.asInstanceOf[js.Any])
      
      inline def setRuntimePathUndefined: Self = StObject.set(x, "runtimePath", js.undefined)
      
      inline def setStylableConfig(
        value: Partial[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StylableConfig */ Any
            ]
      ): Self = StObject.set(x, "stylableConfig", value.asInstanceOf[js.Any])
    }
  }
}
