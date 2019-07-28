package typings.subscriptionsDashTransportDashWs.distClientMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationOptions
  extends /* key */ StringDictionary[js.Any] {
  var operationName: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[String | DocumentNode] = js.undefined
  var variables: js.UndefOr[js.Object] = js.undefined
}

object OperationOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    operationName: String = null,
    query: String | DocumentNode = null,
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

