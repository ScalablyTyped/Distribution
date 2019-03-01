package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionResult extends js.Object {
  var data: js.Any
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
}

object ExecutionResult {
  @scala.inline
  def apply(data: js.Any, errors: js.Array[GraphQLError] = null): ExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[ExecutionResult]
  }
}

