package typings.vueLoader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSelectMod {
  
  @JSImport("vue-loader/dist/select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def selectBlock(
    descriptor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SFCDescriptor */ Any,
    scopeId: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueLoaderOptions */ Any,
    loaderContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ Any,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
    appendExtension: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectBlock")(descriptor.asInstanceOf[js.Any], scopeId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], loaderContext.asInstanceOf[js.Any], query.asInstanceOf[js.Any], appendExtension.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
