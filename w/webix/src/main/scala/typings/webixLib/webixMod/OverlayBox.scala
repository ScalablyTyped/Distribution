package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayBox extends js.Object {
  def hideOverlay(): scala.Unit
  def showOverlay(): scala.Unit
}

object OverlayBox {
  @scala.inline
  def apply(hideOverlay: () => scala.Unit, showOverlay: () => scala.Unit): OverlayBox = {
    val __obj = js.Dynamic.literal(hideOverlay = js.Any.fromFunction0(hideOverlay), showOverlay = js.Any.fromFunction0(showOverlay))
  
    __obj.asInstanceOf[OverlayBox]
  }
}

