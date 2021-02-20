package typings.uifabricUtilities

import typings.fluentuiDomUtilities.ivirtualelementMod.IVirtualElement
import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Window
import typings.uifabricUtilities.irectangleMod.IRectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domMod {
  
  @JSImport("@uifabric/utilities/lib/dom", "DATA_PORTAL_ATTRIBUTE")
  @js.native
  val DATA_PORTAL_ATTRIBUTE: /* "data-portal-element" */ String = js.native
  
  @JSImport("@uifabric/utilities/lib/dom", "elementContains")
  @js.native
  def elementContains(): Boolean = js.native
  @JSImport("@uifabric/utilities/lib/dom", "elementContains")
  @js.native
  def elementContains(parent: Null, child: Null, allowVirtualParents: Boolean): Boolean = js.native
  @JSImport("@uifabric/utilities/lib/dom", "elementContains")
  @js.native
  def elementContains(parent: Null, child: HTMLElement): Boolean = js.native
  @JSImport("@uifabric/utilities/lib/dom", "elementContains")
  @js.native
  def elementContains(parent: Null, child: HTMLElement, allowVirtualParents: Boolean): Boolean = js.native
  @JSImport("@uifabric/utilities/lib/dom", "elementContains")
  @js.native
  def elementContains(parent: HTMLElement): Boolean = js.native
  @JSImport("@uifabric/utilities/lib/dom", "elementContains")
  @js.native
  def elementContains(parent: HTMLElement, child: Null, allowVirtualParents: Boolean): Boolean = js.native
  @JSImport("@uifabric/utilities/lib/dom", "elementContains")
  @js.native
  def elementContains(parent: HTMLElement, child: HTMLElement): Boolean = js.native
  @JSImport("@uifabric/utilities/lib/dom", "elementContains")
  @js.native
  def elementContains(parent: HTMLElement, child: HTMLElement, allowVirtualParents: Boolean): Boolean = js.native
  
  @JSImport("@uifabric/utilities/lib/dom", "elementContainsAttribute")
  @js.native
  def elementContainsAttribute(element: HTMLElement, attribute: String): String | Null = js.native
  
  @JSImport("@uifabric/utilities/lib/dom", "findElementRecursive")
  @js.native
  def findElementRecursive(element: Null, matchFunction: js.Function1[/* element */ HTMLElement, Boolean]): HTMLElement | Null = js.native
  @JSImport("@uifabric/utilities/lib/dom", "findElementRecursive")
  @js.native
  def findElementRecursive(element: HTMLElement, matchFunction: js.Function1[/* element */ HTMLElement, Boolean]): HTMLElement | Null = js.native
  
  @JSImport("@uifabric/utilities/lib/dom", "getChildren")
  @js.native
  def getChildren(parent: HTMLElement): js.Array[HTMLElement] = js.native
  @JSImport("@uifabric/utilities/lib/dom", "getChildren")
  @js.native
  def getChildren(parent: HTMLElement, allowVirtualChildren: Boolean): js.Array[HTMLElement] = js.native
  
  @JSImport("@uifabric/utilities/lib/dom", "getDocument")
  @js.native
  def getDocument(): js.UndefOr[Document] = js.native
  @JSImport("@uifabric/utilities/lib/dom", "getDocument")
  @js.native
  def getDocument(rootElement: HTMLElement): js.UndefOr[Document] = js.native
  
  @JSImport("@uifabric/utilities/lib/dom", "getParent")
  @js.native
  def getParent(child: HTMLElement): HTMLElement | Null = js.native
  @JSImport("@uifabric/utilities/lib/dom", "getParent")
  @js.native
  def getParent(child: HTMLElement, allowVirtualParents: Boolean): HTMLElement | Null = js.native
  
  @JSImport("@uifabric/utilities/lib/dom", "getRect")
  @js.native
  def getRect(): js.UndefOr[IRectangle] = js.native
  @JSImport("@uifabric/utilities/lib/dom", "getRect")
  @js.native
  def getRect(element: HTMLElement): js.UndefOr[IRectangle] = js.native
  @JSImport("@uifabric/utilities/lib/dom", "getRect")
  @js.native
  def getRect(element: Window): js.UndefOr[IRectangle] = js.native
  
  @JSImport("@uifabric/utilities/lib/dom", "getVirtualParent")
  @js.native
  def getVirtualParent(child: HTMLElement): js.UndefOr[HTMLElement] = js.native
  
  @JSImport("@uifabric/utilities/lib/dom", "getWindow")
  @js.native
  def getWindow(): js.UndefOr[Window] = js.native
  @JSImport("@uifabric/utilities/lib/dom", "getWindow")
  @js.native
  def getWindow(rootElement: Element): js.UndefOr[Window] = js.native
  
  @JSImport("@uifabric/utilities/lib/dom", "isVirtualElement")
  @js.native
  def isVirtualElement(element: IVirtualElement): /* is @fluentui/dom-utilities.@fluentui/dom-utilities/lib/IVirtualElement.IVirtualElement */ Boolean = js.native
  @JSImport("@uifabric/utilities/lib/dom", "isVirtualElement")
  @js.native
  def isVirtualElement(element: HTMLElement): /* is @fluentui/dom-utilities.@fluentui/dom-utilities/lib/IVirtualElement.IVirtualElement */ Boolean = js.native
  
  @JSImport("@uifabric/utilities/lib/dom", "on")
  @js.native
  def on(element: Document, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): js.Function0[Unit] = js.native
  @JSImport("@uifabric/utilities/lib/dom", "on")
  @js.native
  def on(
    element: Document,
    eventName: String,
    callback: js.Function1[/* ev */ Event, Unit],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("@uifabric/utilities/lib/dom", "on")
  @js.native
  def on(element: Element, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): js.Function0[Unit] = js.native
  @JSImport("@uifabric/utilities/lib/dom", "on")
  @js.native
  def on(
    element: Element,
    eventName: String,
    callback: js.Function1[/* ev */ Event, Unit],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("@uifabric/utilities/lib/dom", "on")
  @js.native
  def on(element: Window, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): js.Function0[Unit] = js.native
  @JSImport("@uifabric/utilities/lib/dom", "on")
  @js.native
  def on(element: Window, eventName: String, callback: js.Function1[/* ev */ Event, Unit], options: Boolean): js.Function0[Unit] = js.native
  
  @JSImport("@uifabric/utilities/lib/dom", "portalContainsElement")
  @js.native
  def portalContainsElement(target: HTMLElement): Boolean = js.native
  @JSImport("@uifabric/utilities/lib/dom", "portalContainsElement")
  @js.native
  def portalContainsElement(target: HTMLElement, parent: HTMLElement): Boolean = js.native
  
  @JSImport("@uifabric/utilities/lib/dom", "raiseClick")
  @js.native
  def raiseClick(target: Element): Unit = js.native
  
  @JSImport("@uifabric/utilities/lib/dom", "setPortalAttribute")
  @js.native
  def setPortalAttribute(element: HTMLElement): Unit = js.native
  
  @JSImport("@uifabric/utilities/lib/dom", "setVirtualParent")
  @js.native
  def setVirtualParent(child: HTMLElement): Unit = js.native
  @JSImport("@uifabric/utilities/lib/dom", "setVirtualParent")
  @js.native
  def setVirtualParent(child: HTMLElement, parent: HTMLElement): Unit = js.native
}
