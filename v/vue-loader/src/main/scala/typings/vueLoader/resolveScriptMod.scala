package typings.vueLoader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveScriptMod {
  
  @JSImport("vue-loader/dist/resolveScript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canInlineTemplate(
    descriptor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SFCDescriptor */ Any,
    isProd: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canInlineTemplate")(descriptor.asInstanceOf[js.Any], isProd.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def resolveScript(
    descriptor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SFCDescriptor */ Any,
    scopeId: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueLoaderOptions */ Any,
    loaderContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ Any
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SFCScriptBlock */ Any) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveScript")(descriptor.asInstanceOf[js.Any], scopeId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], loaderContext.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SFCScriptBlock */ Any) | Null]
}
