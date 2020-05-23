package typings.subscriptionsTransportWs.clientMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DocumentNode
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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    operationName: String = null,
    query: String | DocumentNode = null,
    variables: js.Object = null
  ): OperationOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (operationName != null) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationOptions]
  }
}

