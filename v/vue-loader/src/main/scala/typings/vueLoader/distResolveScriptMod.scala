package typings.vueLoader

import typings.std.Map
import typings.std.Set
import typings.std.WeakMap
import typings.webpack.mod.LoaderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distResolveScriptMod {
  
  @JSImport("vue-loader/dist/resolveScript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canInlineTemplate(
    descriptor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SFCDescriptor */ Any,
    isProd: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canInlineTemplate")(descriptor.asInstanceOf[js.Any], isProd.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("vue-loader/dist/resolveScript", "clientCache")
  @js.native
  val clientCache: WeakMap[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SFCDescriptor */ Any, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SFCScriptBlock */ Any) | Null
  ] = js.native
  
  inline def resolveScript(
    descriptor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SFCDescriptor */ Any,
    scopeId: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueLoaderOptions */ Any,
    loaderContext: LoaderContext[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueLoaderOptions */ Any
    ]
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SFCScriptBlock */ Any) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveScript")(descriptor.asInstanceOf[js.Any], scopeId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], loaderContext.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SFCScriptBlock */ Any) | Null]
  
  @JSImport("vue-loader/dist/resolveScript", "typeDepToSFCMap")
  @js.native
  val typeDepToSFCMap: Map[String, Set[String]] = js.native
}
