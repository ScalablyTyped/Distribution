package typings
package subscriptionsDashTransportDashWsLib.distClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var operationName: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[java.lang.String | graphqlLib.languageAstMod.DocumentNode] = js.undefined
  var variables: js.UndefOr[js.Object] = js.undefined
}

object OperationOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    operationName: java.lang.String = null,
    query: java.lang.String | graphqlLib.languageAstMod.DocumentNode = null,
    variables: js.Object = null
  ): OperationOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (operationName != null) __obj.updateDynamic("operationName")(operationName)
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[OperationOptions]
  }
}

