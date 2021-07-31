package typings.uifabricUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object osDetectorMod {
  
  @JSImport("@uifabric/utilities/lib/osDetector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isMac(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMac")().asInstanceOf[Boolean]
  @scala.inline
  def isMac(reset: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMac")(reset.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
