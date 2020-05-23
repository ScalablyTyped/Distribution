package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ascending extends js.Object {
  var ascending: scala.Double
  var default: scala.Double
  var descending: scala.Double
}

object Ascending {
  @scala.inline
  def apply(ascending: scala.Double, default: scala.Double, descending: scala.Double): Ascending = {
    val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], descending = descending.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ascending]
  }
}

