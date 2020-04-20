package typings.urql.useMutationMod

import typings.std.Record
import typings.urqlCore.mod.CombinedError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseMutationState[T] extends js.Object {
  var data: js.UndefOr[T] = js.undefined
  var error: js.UndefOr[CombinedError] = js.undefined
  var extensions: js.UndefOr[Record[String, _]] = js.undefined
  var fetching: Boolean
  var stale: Boolean
}

object UseMutationState {
  @scala.inline
  def apply[T](
    fetching: Boolean,
    stale: Boolean,
    data: T = null,
    error: CombinedError = null,
    extensions: Record[String, _] = null
  ): UseMutationState[T] = {
    val __obj = js.Dynamic.literal(fetching = fetching.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMutationState[T]]
  }
}

