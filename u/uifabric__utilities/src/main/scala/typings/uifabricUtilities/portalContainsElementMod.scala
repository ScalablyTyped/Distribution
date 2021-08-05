package typings.uifabricUtilities

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalContainsElementMod {
  
  @JSImport("@uifabric/utilities/lib/dom/portalContainsElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def portalContainsElement(target: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("portalContainsElement")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def portalContainsElement(target: HTMLElement, parent: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("portalContainsElement")(target.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
