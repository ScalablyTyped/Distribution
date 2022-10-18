package typings.vueLoader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHotReloadMod {
  
  @JSImport("vue-loader/dist/hotReload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def genHotReloadCode(id: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("genHotReloadCode")(id.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def genHotReloadCode(id: String, templateRequest: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("genHotReloadCode")(id.asInstanceOf[js.Any], templateRequest.asInstanceOf[js.Any])).asInstanceOf[String]
}
