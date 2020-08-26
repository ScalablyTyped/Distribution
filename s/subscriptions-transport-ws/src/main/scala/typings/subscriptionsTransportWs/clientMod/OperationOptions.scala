package typings.subscriptionsTransportWs.clientMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationOptions
  extends /* key */ StringDictionary[js.Any] {
  var operationName: js.UndefOr[String] = js.native
  var query: js.UndefOr[String | DocumentNode] = js.native
  var variables: js.UndefOr[js.Object] = js.native
}

object OperationOptions {
  @scala.inline
  def apply(): OperationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationOptions]
  }
  @scala.inline
  implicit class OperationOptionsOps[Self <: OperationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOperationName(value: String): Self = this.set("operationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationName: Self = this.set("operationName", js.undefined)
    @scala.inline
    def setQuery(value: String | DocumentNode): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setVariables(value: js.Object): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

