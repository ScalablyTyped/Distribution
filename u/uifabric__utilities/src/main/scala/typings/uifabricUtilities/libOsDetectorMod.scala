package typings.uifabricUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOsDetectorMod {
  
  @JSImport("@uifabric/utilities/lib/osDetector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMac(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMac")().asInstanceOf[Boolean]
  inline def isMac(reset: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMac")(reset.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
