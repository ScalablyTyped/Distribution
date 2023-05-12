package typings.vueLoader

import typings.vueLoader.mod.VueLoaderOptions
import typings.webpack.mod.LoaderContext
import typings.webpack.mod.WebpackOptionsNormalized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilMod {
  
  @JSImport("vue-loader/dist/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOptions(loaderContext: LoaderContext[VueLoaderOptions]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")(loaderContext.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def needHMR(vueLoaderOptions: VueLoaderOptions, compilerOptions: WebpackOptionsNormalized): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("needHMR")(vueLoaderOptions.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def resolveTemplateTSOptions(
    descriptor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SFCDescriptor */ Any,
    options: VueLoaderOptions
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompilerOptions */ Any) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTemplateTSOptions")(descriptor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompilerOptions */ Any) | Null]
  
  inline def stringifyRequest(loaderContext: LoaderContext[VueLoaderOptions], request: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyRequest")(loaderContext.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[String]
}
