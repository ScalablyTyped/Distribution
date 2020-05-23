package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidFilterClause extends js.Object {
  var invalidFilterClause: scala.Double
  var oK: scala.Double
  var unknown: scala.Double
}

object InvalidFilterClause {
  @scala.inline
  def apply(invalidFilterClause: scala.Double, oK: scala.Double, unknown: scala.Double): InvalidFilterClause = {
    val __obj = js.Dynamic.literal(invalidFilterClause = invalidFilterClause.asInstanceOf[js.Any], oK = oK.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidFilterClause]
  }
}

