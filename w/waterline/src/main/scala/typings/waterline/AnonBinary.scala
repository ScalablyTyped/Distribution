package typings.waterline

import typings.waterline.waterlineStrings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBinary extends js.Object {
  var `type`: binary
}

object AnonBinary {
  @scala.inline
  def apply(`type`: binary): AnonBinary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBinary]
  }
}

