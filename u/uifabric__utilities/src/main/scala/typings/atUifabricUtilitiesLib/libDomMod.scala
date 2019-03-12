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
  def elementContains(parent: scala.Null, child: scala.Null, allowVirtualParents: scala.Boolean): scala.Boolean = js.native
  def elementContains(parent: scala.Null, child: stdLib.HTMLElement): scala.Boolean = js.native
  def elementContains(parent: scala.Null, child: stdLib.HTMLElement, allowVirtualParents: scala.Boolean): scala.Boolean = js.native
  def elementContains(parent: stdLib.HTMLElement): scala.Boolean = js.native
  def elementContains(parent: stdLib.HTMLElement, child: scala.Null, allowVirtualParents: scala.Boolean): scala.Boolean = js.native
  def elementContains(parent: stdLib.HTMLElement, child: stdLib.HTMLElement): scala.Boolean = js.native
  def elementContains(parent: stdLib.HTMLElement, child: stdLib.HTMLElement, allowVirtualParents: scala.Boolean): scala.Boolean = js.native
  def elementContainsAttribute(element: stdLib.HTMLElement, attribute: java.lang.String): java.lang.String | scala.Null = js.native
  def findElementRecursive(element: scala.Null, matchFunction: js.Function1[/* element */ stdLib.HTMLElement, scala.Boolean]): stdLib.HTMLElement | scala.Null = js.native
  def findElementRecursive(
    element: stdLib.HTMLElement,
    matchFunction: js.Function1[/* element */ stdLib.HTMLElement, scala.Boolean]
  ): stdLib.HTMLElement | scala.Null = js.native
  def getChildren(parent: stdLib.HTMLElement): js.Array[stdLib.HTMLElement] = js.native
  def getChildren(parent: stdLib.HTMLElement, allowVirtualChildren: scala.Boolean): js.Array[stdLib.HTMLElement] = js.native
  def getDocument(): js.UndefOr[stdLib.Document] = js.native
  def getDocument(rootElement: stdLib.HTMLElement): js.UndefOr[stdLib.Document] = js.native
  def getParent(child: stdLib.HTMLElement): stdLib.HTMLElement | scala.Null = js.native
  def getParent(child: stdLib.HTMLElement, allowVirtualParents: scala.Boolean): stdLib.HTMLElement | scala.Null = js.native
  def getRect(): js.UndefOr[atUifabricUtilitiesLib.libIRectangleMod.IRectangle] = js.native
  def getRect(element: stdLib.HTMLElement): js.UndefOr[atUifabricUtilitiesLib.libIRectangleMod.IRectangle] = js.native
  def getRect(element: stdLib.Window): js.UndefOr[atUifabricUtilitiesLib.libIRectangleMod.IRectangle] = js.native
  def getVirtualParent(child: stdLib.HTMLElement): js.UndefOr[stdLib.HTMLElement] = js.native
  def getWindow(): js.UndefOr[stdLib.Window] = js.native
  def getWindow(rootElement: stdLib.Element): js.UndefOr[stdLib.Window] = js.native
  def isVirtualElement(element: atUifabricUtilitiesLib.libDomIVirtualElementMod.IVirtualElement): /* is @uifabric/utilities.@uifabric/utilities/lib/dom/IVirtualElement.IVirtualElement */ scala.Boolean = js.native
  def isVirtualElement(element: stdLib.HTMLElement): /* is @uifabric/utilities.@uifabric/utilities/lib/dom/IVirtualElement.IVirtualElement */ scala.Boolean = js.native
  def on(
    element: stdLib.Element,
    eventName: java.lang.String,
    callback: js.Function1[/* ev */ stdLib.Event, scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def on(
    element: stdLib.Element,
    eventName: java.lang.String,
    callback: js.Function1[/* ev */ stdLib.Event, scala.Unit],
    options: scala.Boolean
  ): js.Function0[scala.Unit] = js.native
  def on(
    element: stdLib.Window,
    eventName: java.lang.String,
    callback: js.Function1[/* ev */ stdLib.Event, scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def on(
    element: stdLib.Window,
    eventName: java.lang.String,
    callback: js.Function1[/* ev */ stdLib.Event, scala.Unit],
    options: scala.Boolean
  ): js.Function0[scala.Unit] = js.native
  def portalContainsElement(target: stdLib.HTMLElement): scala.Boolean = js.native
  def portalContainsElement(target: stdLib.HTMLElement, parent: stdLib.HTMLElement): scala.Boolean = js.native
  def raiseClick(target: stdLib.Element): scala.Unit = js.native
  def setPortalAttribute(element: stdLib.HTMLElement): scala.Unit = js.native
  def setVirtualParent(child: stdLib.HTMLElement, parent: stdLib.HTMLElement): scala.Unit = js.native
}

