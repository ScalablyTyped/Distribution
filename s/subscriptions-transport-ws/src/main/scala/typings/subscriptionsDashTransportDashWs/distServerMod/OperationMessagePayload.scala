package typings.subscriptionsDashTransportDashWs.distServerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationMessagePayload
  extends /* key */ StringDictionary[js.Any] {
  var operationName: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var variables: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object OperationMessagePayload {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    operationName: String = null,
    query: String = null,
    variables: StringDictionary[js.Any] = null
  ): OperationMessagePayload = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (operationName != null) __obj.updateDynamic("operationName")(operationName)
    if (query != null) __obj.updateDynamic("query")(query)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[OperationMessagePayload]
  }
}

