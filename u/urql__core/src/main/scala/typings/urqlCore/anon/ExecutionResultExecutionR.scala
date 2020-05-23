package typings.urqlCore.anon

import typings.graphql.executeMod.ExecutionResultDataDefault
import typings.graphql.graphQLErrorMod.GraphQLError
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @urql/core.@urql/core/dist/types/types.ExecutionResult<graphql.graphql/execution/execute.ExecutionResultDataDefault> & {  extensions ? :std.Record<string, any>} */
trait ExecutionResultExecutionR extends js.Object {
  var data: js.UndefOr[ExecutionResultDataDefault | Null] = js.undefined
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
  var extensions: js.UndefOr[Record[String, _]] = js.undefined
}

object ExecutionResultExecutionR {
  @scala.inline
  def apply(
    data: js.UndefOr[Null | ExecutionResultDataDefault] = js.undefined,
    errors: js.Array[GraphQLError] = null,
    extensions: Record[String, _] = null
  ): ExecutionResultExecutionR = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionResultExecutionR]
  }
}

