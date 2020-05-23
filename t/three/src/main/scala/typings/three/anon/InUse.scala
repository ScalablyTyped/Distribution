package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InUse extends js.Object {
  var inUse: Double
  var total: Double
}

object InUse {
  @scala.inline
  def apply(inUse: Double, total: Double): InUse = {
    val __obj = js.Dynamic.literal(inUse = inUse.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[InUse]
  }
}

