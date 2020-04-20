package typings.vexdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTtl extends js.Object {
  var ttl: Double
}

object AnonTtl {
  @scala.inline
  def apply(ttl: Double): AnonTtl = {
    val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTtl]
  }
}

