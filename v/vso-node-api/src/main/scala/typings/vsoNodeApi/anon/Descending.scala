package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Descending extends js.Object {
  var ascending: scala.Double
  var descending: scala.Double
  var none: scala.Double
}

object Descending {
  @scala.inline
  def apply(ascending: scala.Double, descending: scala.Double, none: scala.Double): Descending = {
    val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], descending = descending.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descending]
  }
}

