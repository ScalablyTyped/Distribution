package typings.web3Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDklen extends js.Object {
  var dklen: Double
  var n: Double
  var p: Double
  var r: Double
  var salt: String
}

object AnonDklen {
  @scala.inline
  def apply(dklen: Double, n: Double, p: Double, r: Double, salt: String): AnonDklen = {
    val __obj = js.Dynamic.literal(dklen = dklen.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDklen]
  }
}

