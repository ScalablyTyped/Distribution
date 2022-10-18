package typings.uifabricUtilities

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomSetPortalAttributeMod {
  
  @JSImport("@uifabric/utilities/lib/dom/setPortalAttribute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@uifabric/utilities/lib/dom/setPortalAttribute", "DATA_PORTAL_ATTRIBUTE")
  @js.native
  val DATA_PORTAL_ATTRIBUTE: /* "data-portal-element" */ String = js.native
  
  inline def setPortalAttribute(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPortalAttribute")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
