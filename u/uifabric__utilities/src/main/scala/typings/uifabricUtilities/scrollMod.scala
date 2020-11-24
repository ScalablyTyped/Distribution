package typings.uifabricUtilities

import typings.std.HTMLElement
import typings.std.Window
import typings.uifabricUtilities.eventGroupMod.EventGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/utilities/lib/scroll", JSImport.Namespace)
@js.native
object scrollMod extends js.Object {
  
  val DATA_IS_SCROLLABLE_ATTRIBUTE: /* "data-is-scrollable" */ String = js.native
  
  def allowOverscrollOnElement(element: Null, events: EventGroup): Unit = js.native
  def allowOverscrollOnElement(element: HTMLElement, events: EventGroup): Unit = js.native
  
  def allowScrollOnElement(element: Null, events: EventGroup): Unit = js.native
  def allowScrollOnElement(element: HTMLElement, events: EventGroup): Unit = js.native
  
  def disableBodyScroll(): Unit = js.native
  
  def enableBodyScroll(): Unit = js.native
  
  def findScrollableParent(): js.UndefOr[HTMLElement | Window | Null] = js.native
  def findScrollableParent(startingElement: HTMLElement): js.UndefOr[HTMLElement | Window | Null] = js.native
  
  def getScrollbarWidth(): Double = js.native
}
