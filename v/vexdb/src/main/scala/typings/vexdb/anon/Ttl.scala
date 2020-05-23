package typings.vexdb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ttl extends js.Object {
  var ttl: Double
}

object Ttl {
  @scala.inline
  def apply(ttl: Double): Ttl = {
    val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ttl]
  }
}

