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
  def apply(hideOverlay: js.Function0[scala.Unit], showOverlay: js.Function0[scala.Unit]): OverlayBox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hideOverlay")(hideOverlay)
    __obj.updateDynamic("showOverlay")(showOverlay)
    __obj.asInstanceOf[OverlayBox]
  }
}

