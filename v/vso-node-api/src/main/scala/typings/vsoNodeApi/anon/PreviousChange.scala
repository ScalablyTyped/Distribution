package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviousChange extends js.Object {
  var firstParent: scala.Double
  var none: scala.Double
  var previousChange: scala.Double
}

object PreviousChange {
  @scala.inline
  def apply(firstParent: scala.Double, none: scala.Double, previousChange: scala.Double): PreviousChange = {
    val __obj = js.Dynamic.literal(firstParent = firstParent.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], previousChange = previousChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousChange]
  }
}

