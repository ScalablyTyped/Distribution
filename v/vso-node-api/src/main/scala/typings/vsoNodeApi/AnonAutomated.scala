package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutomated extends js.Object {
  var automated: Double
  var manual: Double
  var none: Double
  var scheduled: Double
}

object AnonAutomated {
  @scala.inline
  def apply(automated: Double, manual: Double, none: Double, scheduled: Double): AnonAutomated = {
    val __obj = js.Dynamic.literal(automated = automated.asInstanceOf[js.Any], manual = manual.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAutomated]
  }
}

