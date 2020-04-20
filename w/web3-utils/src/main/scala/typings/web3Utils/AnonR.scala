package typings.web3Utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonR extends js.Object {
  var r: String
  var s: String
  var v: Double
}

object AnonR {
  @scala.inline
  def apply(r: String, s: String, v: Double): AnonR = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonR]
  }
}

