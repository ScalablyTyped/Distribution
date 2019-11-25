package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InUse extends js.Object {
  var inUse: Double
  var total: Double
}

object Anon_InUse {
  @scala.inline
  def apply(inUse: Double, total: Double): Anon_InUse = {
    val __obj = js.Dynamic.literal(inUse = inUse.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_InUse]
  }
}

