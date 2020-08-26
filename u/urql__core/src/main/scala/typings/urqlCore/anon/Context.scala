package typings.urqlCore.anon

import typings.graphql.astMod.DocumentNode
import typings.urqlCore.typesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var context: AdditionalTypenames = js.native
  var key: Double = js.native
  var operationName: OperationType = js.native
  var query: DocumentNode = js.native
  var variables: js.UndefOr[js.Object] = js.native
}

object Context {
  @scala.inline
  def apply(context: AdditionalTypenames, key: Double, operationName: OperationType, query: DocumentNode): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], operationName = operationName.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
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
    def setContext(value: AdditionalTypenames): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Double): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationName(value: OperationType): Self = this.set("operationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: DocumentNode): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: js.Object): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

