package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AscendingDescending extends js.Object {
  var ascending: scala.Double
  var descending: scala.Double
}

object AscendingDescending {
  @scala.inline
  def apply(ascending: scala.Double, descending: scala.Double): AscendingDescending = {
    val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], descending = descending.asInstanceOf[js.Any])
    __obj.asInstanceOf[AscendingDescending]
  }
}

