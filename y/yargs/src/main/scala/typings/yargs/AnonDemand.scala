package typings.yargs

import typings.yargs.yargsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDemand extends js.Object {
  var demand: String | `true`
}

object AnonDemand {
  @scala.inline
  def apply(demand: String | `true`): AnonDemand = {
    val __obj = js.Dynamic.literal(demand = demand.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDemand]
  }
}

