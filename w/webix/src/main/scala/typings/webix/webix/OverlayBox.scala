package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayBox extends js.Object {
  def hideOverlay(): Unit
  def showOverlay(): Unit
}

object OverlayBox {
  @scala.inline
  def apply(hideOverlay: () => Unit, showOverlay: () => Unit): OverlayBox = {
    val __obj = js.Dynamic.literal(hideOverlay = js.Any.fromFunction0(hideOverlay), showOverlay = js.Any.fromFunction0(showOverlay))
    __obj.asInstanceOf[OverlayBox]
  }
}

