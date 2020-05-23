package typings.webcola.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait T1 extends js.Object {
  var t1: Double
  var t2: Double
}

object T1 {
  @scala.inline
  def apply(t1: Double, t2: Double): T1 = {
    val __obj = js.Dynamic.literal(t1 = t1.asInstanceOf[js.Any], t2 = t2.asInstanceOf[js.Any])
    __obj.asInstanceOf[T1]
  }
}

