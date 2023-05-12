package typings.wordpressPrivateApis

import typings.wordpressPrivateApis.anon.Lock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesImplementationMod {
  
  @JSImport("@wordpress/private-apis/build-types/implementation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allowCoreModule(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowCoreModule")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def dangerousOptInToUnstableAPIsOnlyForCoreModules(consent: String, moduleName: String): Lock = (^.asInstanceOf[js.Dynamic].applyDynamic("__dangerousOptInToUnstableAPIsOnlyForCoreModules")(consent.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any])).asInstanceOf[Lock]
  
  inline def resetAllowedCoreModules(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetAllowedCoreModules")().asInstanceOf[Unit]
  
  inline def resetRegisteredPrivateApis(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetRegisteredPrivateApis")().asInstanceOf[Unit]
}
