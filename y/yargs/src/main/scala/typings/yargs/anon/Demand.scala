package typings.yargs.anon

import typings.yargs.yargsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Demand extends js.Object {
  var demand: java.lang.String | `true`
}

object Demand {
  @scala.inline
  def apply(demand: java.lang.String | `true`): Demand = {
    val __obj = js.Dynamic.literal(demand = demand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Demand]
  }
}

