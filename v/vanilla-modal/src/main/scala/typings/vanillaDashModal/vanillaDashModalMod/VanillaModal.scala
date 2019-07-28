package typings.vanillaDashModal.vanillaDashModalMod

import typings.std.Event
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VanillaModal extends js.Object {
  def addLoadedCssClass(): Unit = js.native
  def captureNode(node: Node): Unit = js.native
  def close(): Unit = js.native
  def close(e: Event): Unit = js.native
  def closeKeyHandler(e: Event): Unit = js.native
  def closeModal(e: Event): Unit = js.native
  def closeModalWithTransition(e: Event): Unit = js.native
  def delegateClose(e: Event): Unit = js.native
  def delegateOpen(e: Event): Unit = js.native
  def destroy(): Unit = js.native
  def detectTransition(): Boolean = js.native
  def getDomNodes(): VanillaModalDomNodes = js.native
  def listen(): Unit = js.native
  def open(allMatches: String): Unit = js.native
  def open(allMatches: String, e: Event): Unit = js.native
  def outsideClickHandler(e: Event): Unit = js.native
  def releaseNode(node: Node): Unit = js.native
  def removeOpenId(): Unit = js.native
  def setOpenId(id: String): Unit = js.native
}

