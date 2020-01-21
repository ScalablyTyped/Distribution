package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllClauses extends js.Object {
  var all: Double
  var clauses: Double
  var minimal: Double
  var none: Double
  var wiql: Double
}

object AnonAllClauses {
  @scala.inline
  def apply(all: Double, clauses: Double, minimal: Double, none: Double, wiql: Double): AnonAllClauses = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], clauses = clauses.asInstanceOf[js.Any], minimal = minimal.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], wiql = wiql.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAllClauses]
  }
}

