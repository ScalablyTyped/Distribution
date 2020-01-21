package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabledNone extends js.Object {
  var disabled: Double
  var none: Double
  var serviceFlags: Double
  var unChanged: Double
  var verified: Double
}

object AnonDisabledNone {
  @scala.inline
  def apply(disabled: Double, none: Double, serviceFlags: Double, unChanged: Double, verified: Double): AnonDisabledNone = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], serviceFlags = serviceFlags.asInstanceOf[js.Any], unChanged = unChanged.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDisabledNone]
  }
}

