package typings.vanillaSwipe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkIsPassiveSupportedMod {
  
  @JSImport("vanilla-swipe/lib/utils/checkIsPassiveSupported", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkIsPassiveSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkIsPassiveSupported")().asInstanceOf[Boolean]
  inline def checkIsPassiveSupported(isPassiveSupported: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkIsPassiveSupported")(isPassiveSupported.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
}
