package typings.web3Utils

import typings.bnJs.mod.^
import typings.web3Utils.mod._Mixed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonT extends _Mixed {
  var t: String
  var v: String | ^  | Double
}

object AnonT {
  @scala.inline
  def apply(t: String, v: String | ^  | Double): AnonT = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonT]
  }
}

