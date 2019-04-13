package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/scroll", JSImport.Namespace)
@js.native
object libScrollMod extends js.Object {
  val DATA_IS_SCROLLABLE_ATTRIBUTE: atUifabricUtilitiesLib.atUifabricUtilitiesLibStrings.`data-is-scrollable` = js.native
  def allowScrollOnElement(element: scala.Null, events: atUifabricUtilitiesLib.libEventGroupMod.EventGroup): scala.Unit = js.native
  def allowScrollOnElement(element: stdLib.HTMLElement, events: atUifabricUtilitiesLib.libEventGroupMod.EventGroup): scala.Unit = js.native
  def disableBodyScroll(): scala.Unit = js.native
  def enableBodyScroll(): scala.Unit = js.native
  def findScrollableParent(): stdLib.HTMLElement | scala.Null = js.native
  def findScrollableParent(startingElement: stdLib.HTMLElement): stdLib.HTMLElement | scala.Null = js.native
  def getScrollbarWidth(): scala.Double = js.native
}

