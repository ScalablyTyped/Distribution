package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/dom", JSImport.Namespace)
@js.native
object libDomMod extends js.Object {
  val DATA_PORTAL_ATTRIBUTE: /* data-portal-element */ java.lang.String = js.native
  def elementContains(): scala.Boolean = js.native
  def elementContains(parent: reactLib.HTMLElement): scala.Boolean = js.native
  def elementContains(parent: reactLib.HTMLElement, child: reactLib.HTMLElement): scala.Boolean = js.native
  def elementContains(parent: reactLib.HTMLElement, child: reactLib.HTMLElement, allowVirtualParents: scala.Boolean): scala.Boolean = js.native
  def elementContains(parent: reactLib.HTMLElement, child: scala.Null, allowVirtualParents: scala.Boolean): scala.Boolean = js.native
  def elementContains(parent: scala.Null, child: reactLib.HTMLElement): scala.Boolean = js.native
  def elementContains(parent: scala.Null, child: reactLib.HTMLElement, allowVirtualParents: scala.Boolean): scala.Boolean = js.native
  def elementContains(parent: scala.Null, child: scala.Null, allowVirtualParents: scala.Boolean): scala.Boolean = js.native
  def elementContainsAttribute(element: reactLib.HTMLElement, attribute: java.lang.String): java.lang.String | scala.Null = js.native
  def findElementRecursive(
    element: reactLib.HTMLElement,
    matchFunction: js.Function1[/* element */ reactLib.HTMLElement, scala.Boolean]
  ): reactLib.HTMLElement | scala.Null = js.native
  def findElementRecursive(
    element: scala.Null,
    matchFunction: js.Function1[/* element */ reactLib.HTMLElement, scala.Boolean]
  ): reactLib.HTMLElement | scala.Null = js.native
  def getChildren(parent: reactLib.HTMLElement): js.Array[reactLib.HTMLElement] = js.native
  def getChildren(parent: reactLib.HTMLElement, allowVirtualChildren: scala.Boolean): js.Array[reactLib.HTMLElement] = js.native
  def getDocument(): js.UndefOr[reactLib.Document] = js.native
  def getDocument(rootElement: reactLib.HTMLElement): js.UndefOr[reactLib.Document] = js.native
  def getParent(child: reactLib.HTMLElement): reactLib.HTMLElement | scala.Null = js.native
  def getParent(child: reactLib.HTMLElement, allowVirtualParents: scala.Boolean): reactLib.HTMLElement | scala.Null = js.native
  def getRect(): js.UndefOr[atUifabricUtilitiesLib.libIRectangleMod.IRectangle] = js.native
  def getRect(element: reactLib.HTMLElement): js.UndefOr[atUifabricUtilitiesLib.libIRectangleMod.IRectangle] = js.native
  def getRect(element: stdLib.Window): js.UndefOr[atUifabricUtilitiesLib.libIRectangleMod.IRectangle] = js.native
  def getVirtualParent(child: reactLib.HTMLElement): js.UndefOr[reactLib.HTMLElement] = js.native
  def getWindow(): js.UndefOr[stdLib.Window] = js.native
  def getWindow(rootElement: reactLib.Element): js.UndefOr[stdLib.Window] = js.native
  def isVirtualElement(element: atUifabricUtilitiesLib.libDomIVirtualElementMod.IVirtualElement): /* is @uifabric/utilities.@uifabric/utilities/lib/dom/IVirtualElement.IVirtualElement */ scala.Boolean = js.native
  def isVirtualElement(element: reactLib.HTMLElement): /* is @uifabric/utilities.@uifabric/utilities/lib/dom/IVirtualElement.IVirtualElement */ scala.Boolean = js.native
  def portalContainsElement(target: reactLib.HTMLElement): scala.Boolean = js.native
  def portalContainsElement(target: reactLib.HTMLElement, parent: reactLib.HTMLElement): scala.Boolean = js.native
  def setPortalAttribute(element: reactLib.HTMLElement): scala.Unit = js.native
}

