package typings.vitejsPluginBasicSsl

import typings.vite.mod.Plugin2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@vitejs/plugin-basic-ssl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Plugin2 = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugin2]
  
  inline def getCertificate(cacheDir: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCertificate")(cacheDir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
