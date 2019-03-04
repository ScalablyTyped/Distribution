package typings
package virtualDashDomLib.VirtualDOMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VText extends VTree {
  var text: java.lang.String
  var `type`: java.lang.String
  var version: java.lang.String
}

object VText {
  @scala.inline
  def apply(text: java.lang.String, `type`: java.lang.String, version: java.lang.String): VText = {
    val __obj = js.Dynamic.literal(text = text, version = version)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VText]
  }
}

