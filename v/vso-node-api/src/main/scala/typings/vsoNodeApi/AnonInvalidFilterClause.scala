package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInvalidFilterClause extends js.Object {
  var invalidFilterClause: Double
  var oK: Double
  var unknown: Double
}

object AnonInvalidFilterClause {
  @scala.inline
  def apply(invalidFilterClause: Double, oK: Double, unknown: Double): AnonInvalidFilterClause = {
    val __obj = js.Dynamic.literal(invalidFilterClause = invalidFilterClause.asInstanceOf[js.Any], oK = oK.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInvalidFilterClause]
  }
}

