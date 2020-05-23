package typings.urqlCore.fetchOptionsMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchBody extends js.Object {
  var extensions: js.UndefOr[Record[String, _]] = js.undefined
  var operationName: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var variables: js.UndefOr[Record[String, _]] = js.undefined
}

object FetchBody {
  @scala.inline
  def apply(
    extensions: Record[String, _] = null,
    operationName: String = null,
    query: String = null,
    variables: Record[String, _] = null
  ): FetchBody = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (operationName != null) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchBody]
  }
}

