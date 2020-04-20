package typings.urqlCore.ssrMod

import typings.urqlCore.AnonGraphQLErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedResult extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[AnonGraphQLErrors] = js.undefined
}

object SerializedResult {
  @scala.inline
  def apply(data: js.Any = null, error: AnonGraphQLErrors = null): SerializedResult = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedResult]
  }
}

