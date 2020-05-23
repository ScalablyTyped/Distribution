package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiConfiguration extends js.Object {
  var multiConfiguration: scala.Double
  var multiMachine: scala.Double
  var none: scala.Double
}

object MultiConfiguration {
  @scala.inline
  def apply(multiConfiguration: scala.Double, multiMachine: scala.Double, none: scala.Double): MultiConfiguration = {
    val __obj = js.Dynamic.literal(multiConfiguration = multiConfiguration.asInstanceOf[js.Any], multiMachine = multiMachine.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiConfiguration]
  }
}

