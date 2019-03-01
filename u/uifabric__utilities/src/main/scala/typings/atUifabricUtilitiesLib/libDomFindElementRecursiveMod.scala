package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/dom/findElementRecursive", JSImport.Namespace)
@js.native
object libDomFindElementRecursiveMod extends js.Object {
  def findElementRecursive(
    element: reactLib.HTMLElement,
    matchFunction: js.Function1[/* element */ reactLib.HTMLElement, scala.Boolean]
  ): reactLib.HTMLElement | scala.Null = js.native
  def findElementRecursive(
    element: scala.Null,
    matchFunction: js.Function1[/* element */ reactLib.HTMLElement, scala.Boolean]
  ): reactLib.HTMLElement | scala.Null = js.native
}

