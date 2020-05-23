package typings.web3Utils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R extends js.Object {
  var r: String
  var s: String
  var v: Double
}

object R {
  @scala.inline
  def apply(r: String, s: String, v: Double): R = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[R]
  }
}

