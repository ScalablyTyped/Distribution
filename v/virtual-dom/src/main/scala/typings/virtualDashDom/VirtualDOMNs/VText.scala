package typings.virtualDashDom.VirtualDOMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VText extends VTree {
  var text: String
  var `type`: String
  var version: String
}

object VText {
  @scala.inline
  def apply(text: String, `type`: String, version: String): VText = {
    val __obj = js.Dynamic.literal(text = text, version = version)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VText]
  }
}

