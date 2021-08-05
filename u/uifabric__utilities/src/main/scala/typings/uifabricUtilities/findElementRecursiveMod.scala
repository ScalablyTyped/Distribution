package typings.uifabricUtilities

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findElementRecursiveMod {
  
  @JSImport("@uifabric/utilities/lib/dom/findElementRecursive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findElementRecursive(element: Null, matchFunction: js.Function1[/* element */ HTMLElement, Boolean]): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findElementRecursive")(element.asInstanceOf[js.Any], matchFunction.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  inline def findElementRecursive(element: HTMLElement, matchFunction: js.Function1[/* element */ HTMLElement, Boolean]): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findElementRecursive")(element.asInstanceOf[js.Any], matchFunction.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
}
