package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMe extends js.Object {
  var all: Double
  var me: Double
  var none: Double
}

object AnonMe {
  @scala.inline
  def apply(all: Double, me: Double, none: Double): AnonMe = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], me = me.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMe]
  }
}

