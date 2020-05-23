package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Intval extends js.Object {
  var int_val: Double
  var root_index: Double
}

object Intval {
  @scala.inline
  def apply(int_val: Double, root_index: Double): Intval = {
    val __obj = js.Dynamic.literal(int_val = int_val.asInstanceOf[js.Any], root_index = root_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intval]
  }
}

