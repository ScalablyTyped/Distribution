package typings.urqlCore.typesMod

import typings.std.Record
import typings.urqlCore.errorMod.CombinedError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationResult[Data] extends js.Object {
  /** The data returned from the Graphql server. */
  var data: js.UndefOr[Data] = js.undefined
  /** Any errors resulting from the operation. */
  var error: js.UndefOr[CombinedError] = js.undefined
  /** Optional extensions return by the Graphql server. */
  var extensions: js.UndefOr[Record[String, _]] = js.undefined
  /** The [operation]{@link Operation} which has been executed. */
  var operation: Operation
  /** Optional stale flag added by exchanges that return stale results. */
  var stale: js.UndefOr[Boolean] = js.undefined
}

object OperationResult {
  @scala.inline
  def apply[Data](
    operation: Operation,
    data: Data = null,
    error: CombinedError = null,
    extensions: Record[String, _] = null,
    stale: js.UndefOr[Boolean] = js.undefined
  ): OperationResult[Data] = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationResult[Data]]
  }
}

