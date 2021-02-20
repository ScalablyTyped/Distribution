package typings.uifabricUtilities

import typings.std.HTMLElement
import typings.std.Window
import typings.uifabricUtilities.eventGroupMod.EventGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollMod {
  
  @JSImport("@uifabric/utilities/lib/scroll", "DATA_IS_SCROLLABLE_ATTRIBUTE")
  @js.native
  val DATA_IS_SCROLLABLE_ATTRIBUTE: /* "data-is-scrollable" */ String = js.native
  
  @JSImport("@uifabric/utilities/lib/scroll", "allowOverscrollOnElement")
  @js.native
  def allowOverscrollOnElement(element: Null, events: EventGroup): Unit = js.native
  @JSImport("@uifabric/utilities/lib/scroll", "allowOverscrollOnElement")
  @js.native
  def allowOverscrollOnElement(element: HTMLElement, events: EventGroup): Unit = js.native
  
  @JSImport("@uifabric/utilities/lib/scroll", "allowScrollOnElement")
  @js.native
  def allowScrollOnElement(element: Null, events: EventGroup): Unit = js.native
  @JSImport("@uifabric/utilities/lib/scroll", "allowScrollOnElement")
  @js.native
  def allowScrollOnElement(element: HTMLElement, events: EventGroup): Unit = js.native
  
  @JSImport("@uifabric/utilities/lib/scroll", "disableBodyScroll")
  @js.native
  def disableBodyScroll(): Unit = js.native
  
  @JSImport("@uifabric/utilities/lib/scroll", "enableBodyScroll")
  @js.native
  def enableBodyScroll(): Unit = js.native
  
  @JSImport("@uifabric/utilities/lib/scroll", "findScrollableParent")
  @js.native
  def findScrollableParent(): js.UndefOr[HTMLElement | Window | Null] = js.native
  @JSImport("@uifabric/utilities/lib/scroll", "findScrollableParent")
  @js.native
  def findScrollableParent(startingElement: HTMLElement): js.UndefOr[HTMLElement | Window | Null] = js.native
  
  @JSImport("@uifabric/utilities/lib/scroll", "getScrollbarWidth")
  @js.native
  def getScrollbarWidth(): Double = js.native
}
