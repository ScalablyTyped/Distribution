package typings.uifabricSetVersion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@uifabric/set-version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setVersion(packageName: String, packageVersion: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVersion")(packageName.asInstanceOf[js.Any], packageVersion.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
