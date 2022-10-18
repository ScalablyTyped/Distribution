package typings.vueLoader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPitcherMod {
  
  @JSImport("vue-loader/dist/pitcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vue-loader/dist/pitcher", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.Loader */ Any = js.native
  
  inline def pitch(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pitch")().asInstanceOf[js.UndefOr[String]]
}
