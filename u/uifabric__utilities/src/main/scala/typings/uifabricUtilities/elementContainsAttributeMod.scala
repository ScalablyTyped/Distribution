package typings.uifabricUtilities

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementContainsAttributeMod {
  
  @JSImport("@uifabric/utilities/lib/dom/elementContainsAttribute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def elementContainsAttribute(element: HTMLElement, attribute: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("elementContainsAttribute")(element.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
