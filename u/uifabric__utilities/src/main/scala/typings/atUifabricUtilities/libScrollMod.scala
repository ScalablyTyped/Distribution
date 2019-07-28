package typings.atUifabricUtilities

import typings.atUifabricUtilities.atUifabricUtilitiesStrings.`data-is-scrollable`
import typings.atUifabricUtilities.libEventGroupMod.EventGroup
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/scroll", JSImport.Namespace)
@js.native
object libScrollMod extends js.Object {
  val DATA_IS_SCROLLABLE_ATTRIBUTE: `data-is-scrollable` = js.native
  def allowScrollOnElement(element: Null, events: EventGroup): Unit = js.native
  def allowScrollOnElement(element: HTMLElement, events: EventGroup): Unit = js.native
  def disableBodyScroll(): Unit = js.native
  def enableBodyScroll(): Unit = js.native
  def findScrollableParent(): HTMLElement | Null = js.native
  def findScrollableParent(startingElement: HTMLElement): HTMLElement | Null = js.native
  def getScrollbarWidth(): Double = js.native
}

