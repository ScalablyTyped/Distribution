package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clauses extends js.Object {
  var all: scala.Double
  var clauses: scala.Double
  var minimal: scala.Double
  var none: scala.Double
  var wiql: scala.Double
}

object Clauses {
  @scala.inline
  def apply(
    all: scala.Double,
    clauses: scala.Double,
    minimal: scala.Double,
    none: scala.Double,
    wiql: scala.Double
  ): Clauses = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], clauses = clauses.asInstanceOf[js.Any], minimal = minimal.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], wiql = wiql.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clauses]
  }
}

