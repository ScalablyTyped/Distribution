package typings.uifabricSetVersion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setVersionMod {
  
  @JSImport("@uifabric/set-version/lib/setVersion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setVersion(packageName: String, packageVersion: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVersion")(packageName.asInstanceOf[js.Any], packageVersion.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
