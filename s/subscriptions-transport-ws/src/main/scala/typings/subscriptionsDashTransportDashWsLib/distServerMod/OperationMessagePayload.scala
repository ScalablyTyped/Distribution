package typings
package subscriptionsDashTransportDashWsLib.distServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationMessagePayload
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var operationName: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
  var variables: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object OperationMessagePayload {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    operationName: java.lang.String = null,
    query: java.lang.String = null,
    variables: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): OperationMessagePayload = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (operationName != null) __obj.updateDynamic("operationName")(operationName)
    if (query != null) __obj.updateDynamic("query")(query)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[OperationMessagePayload]
  }
}

