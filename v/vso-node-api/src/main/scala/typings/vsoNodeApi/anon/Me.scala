package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Me extends js.Object {
  var all: scala.Double
  var me: scala.Double
  var none: scala.Double
}

object Me {
  @scala.inline
  def apply(all: scala.Double, me: scala.Double, none: scala.Double): Me = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], me = me.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[Me]
  }
}

