package typings.vueLoader

import typings.vueLoader.mod.VueLoaderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilMod {
  
  @JSImport("vue-loader/dist/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveTemplateTSOptions(
    descriptor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SFCDescriptor */ Any,
    options: VueLoaderOptions
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompilerOptions */ Any) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTemplateTSOptions")(descriptor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompilerOptions */ Any) | Null]
}
