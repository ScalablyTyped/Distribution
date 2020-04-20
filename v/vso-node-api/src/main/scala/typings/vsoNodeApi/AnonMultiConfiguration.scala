package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMultiConfiguration extends js.Object {
  var multiConfiguration: Double
  var multiMachine: Double
  var none: Double
}

object AnonMultiConfiguration {
  @scala.inline
  def apply(multiConfiguration: Double, multiMachine: Double, none: Double): AnonMultiConfiguration = {
    val __obj = js.Dynamic.literal(multiConfiguration = multiConfiguration.asInstanceOf[js.Any], multiMachine = multiMachine.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMultiConfiguration]
  }
}

