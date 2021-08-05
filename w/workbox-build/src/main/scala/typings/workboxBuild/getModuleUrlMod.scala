package typings.workboxBuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getModuleUrlMod {
  
  @JSImport("workbox-build/lib/get-module-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getModuleURL(moduleName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getModuleURL")(moduleName.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getModuleURL(moduleName: String, buildType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getModuleURL")(moduleName.asInstanceOf[js.Any], buildType.asInstanceOf[js.Any])).asInstanceOf[String]
}
