package typings.urqlCore.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var operationName: js.UndefOr[String] = js.undefined
  var query: String
  var variables: Unit | js.Object
}

object Body {
  @scala.inline
  def apply(query: String, variables: Unit | js.Object, operationName: String = null): Body = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (operationName != null) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

