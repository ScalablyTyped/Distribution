package typings.swaggerStats.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deprecated extends js.Object {
  var deprecated: js.UndefOr[String] = js.native
  var operationId: js.UndefOr[String] = js.native
  var params: js.UndefOr[String] = js.native
  var path: String = js.native
  var query: String = js.native
  var swagger: js.UndefOr[String] = js.native
  var tags: js.UndefOr[String] = js.native
}

object Deprecated {
  @scala.inline
  def apply(path: String, query: String): Deprecated = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deprecated]
  }
  @scala.inline
  implicit class DeprecatedOps[Self <: Deprecated] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeprecated(value: String): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    @scala.inline
    def setParams(value: String): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setSwagger(value: String): Self = this.set("swagger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwagger: Self = this.set("swagger", js.undefined)
    @scala.inline
    def setTags(value: String): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

