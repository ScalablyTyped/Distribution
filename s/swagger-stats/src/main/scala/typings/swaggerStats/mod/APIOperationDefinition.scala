package typings.swaggerStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIOperationDefinition extends js.Object {
  var deprecated: Boolean = js.native
  var description: js.UndefOr[String] = js.native
  var operationId: js.UndefOr[String] = js.native
  var summary: js.UndefOr[String] = js.native
  var swagger: Boolean = js.native
  var tags: js.UndefOr[js.Any] = js.native
}

object APIOperationDefinition {
  @scala.inline
  def apply(deprecated: Boolean, swagger: Boolean): APIOperationDefinition = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], swagger = swagger.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIOperationDefinition]
  }
  @scala.inline
  implicit class APIOperationDefinitionOps[Self <: APIOperationDefinition] (val x: Self) extends AnyVal {
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
    def setDeprecated(value: Boolean): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwagger(value: Boolean): Self = this.set("swagger", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    @scala.inline
    def setTags(value: js.Any): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

