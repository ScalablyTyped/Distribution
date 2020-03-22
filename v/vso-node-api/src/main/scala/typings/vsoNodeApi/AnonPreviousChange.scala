package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreviousChange extends js.Object {
  var firstParent: Double
  var none: Double
  var previousChange: Double
}

object AnonPreviousChange {
  @scala.inline
  def apply(firstParent: Double, none: Double, previousChange: Double): AnonPreviousChange = {
    val __obj = js.Dynamic.literal(firstParent = firstParent.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], previousChange = previousChange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPreviousChange]
  }
}

