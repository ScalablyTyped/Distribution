package typings.webcola

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonT1 extends js.Object {
  var t1: Double
  var t2: Double
}

object AnonT1 {
  @scala.inline
  def apply(t1: Double, t2: Double): AnonT1 = {
    val __obj = js.Dynamic.literal(t1 = t1.asInstanceOf[js.Any], t2 = t2.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonT1]
  }
}

