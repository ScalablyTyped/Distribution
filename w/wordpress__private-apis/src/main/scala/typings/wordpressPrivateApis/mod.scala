package typings.wordpressPrivateApis

import typings.wordpressPrivateApis.anon.Lock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/private-apis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dangerousOptInToUnstableAPIsOnlyForCoreModules(consent: String, moduleName: String): Lock = (^.asInstanceOf[js.Dynamic].applyDynamic("__dangerousOptInToUnstableAPIsOnlyForCoreModules")(consent.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any])).asInstanceOf[Lock]
}
