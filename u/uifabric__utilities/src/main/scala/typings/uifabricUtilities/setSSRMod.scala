package typings.uifabricUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setSSRMod {
  
  @JSImport("@uifabric/utilities/lib/dom/setSSR", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@uifabric/utilities/lib/dom/setSSR", "_isSSR")
  @js.native
  def isSSR: Boolean = js.native
  
  inline def isSSR_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_isSSR")(x.asInstanceOf[js.Any])
  
  inline def setSSR(isEnabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSSR")(isEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
