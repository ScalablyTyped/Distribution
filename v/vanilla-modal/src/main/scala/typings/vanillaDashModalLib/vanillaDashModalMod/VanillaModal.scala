package typings
package vanillaDashModalLib.vanillaDashModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VanillaModal extends js.Object {
  def addLoadedCssClass(): scala.Unit = js.native
  def captureNode(node: stdLib.Node): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def close(e: stdLib.Event): scala.Unit = js.native
  def closeKeyHandler(e: stdLib.Event): scala.Unit = js.native
  def closeModal(e: stdLib.Event): scala.Unit = js.native
  def closeModalWithTransition(e: stdLib.Event): scala.Unit = js.native
  def delegateClose(e: stdLib.Event): scala.Unit = js.native
  def delegateOpen(e: stdLib.Event): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def detectTransition(): scala.Boolean = js.native
  def getDomNodes(): VanillaModalDomNodes = js.native
  def listen(): scala.Unit = js.native
  def open(allMatches: java.lang.String): scala.Unit = js.native
  def open(allMatches: java.lang.String, e: stdLib.Event): scala.Unit = js.native
  def outsideClickHandler(e: stdLib.Event): scala.Unit = js.native
  def releaseNode(node: stdLib.Node): scala.Unit = js.native
  def removeOpenId(): scala.Unit = js.native
  def setOpenId(id: java.lang.String): scala.Unit = js.native
}

