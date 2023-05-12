package typings.workboxBuild

import typings.workboxBuild.buildTypesMod.BuildType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibCdnUtilsMod {
  
  @JSImport("workbox-build/build/lib/cdn-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getModuleURL(moduleName: String, buildType: BuildType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getModuleURL")(moduleName.asInstanceOf[js.Any], buildType.asInstanceOf[js.Any])).asInstanceOf[String]
}
