package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFirstParentNone extends js.Object {
  var firstParent: Double
  var none: Double
  var previousChange: Double
}

object AnonFirstParentNone {
  @scala.inline
  def apply(firstParent: Double, none: Double, previousChange: Double): AnonFirstParentNone = {
    val __obj = js.Dynamic.literal(firstParent = firstParent.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], previousChange = previousChange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFirstParentNone]
  }
}

