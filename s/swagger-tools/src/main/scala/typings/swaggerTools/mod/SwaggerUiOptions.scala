package typings.swaggerTools.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwaggerUiOptions extends js.Object {
  var apiDocs: js.UndefOr[String] = js.native
  var apiDocsPrefix: js.UndefOr[String] = js.native
  var swaggerUi: js.UndefOr[String] = js.native
  var swaggerUiDir: js.UndefOr[String] = js.native
  var swaggerUiPrefix: js.UndefOr[String] = js.native
}

object SwaggerUiOptions {
  @scala.inline
  def apply(): SwaggerUiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwaggerUiOptions]
  }
  @scala.inline
  implicit class SwaggerUiOptionsOps[Self <: SwaggerUiOptions] (val x: Self) extends AnyVal {
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
    def setApiDocs(value: String): Self = this.set("apiDocs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiDocs: Self = this.set("apiDocs", js.undefined)
    @scala.inline
    def setApiDocsPrefix(value: String): Self = this.set("apiDocsPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiDocsPrefix: Self = this.set("apiDocsPrefix", js.undefined)
    @scala.inline
    def setSwaggerUi(value: String): Self = this.set("swaggerUi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwaggerUi: Self = this.set("swaggerUi", js.undefined)
    @scala.inline
    def setSwaggerUiDir(value: String): Self = this.set("swaggerUiDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwaggerUiDir: Self = this.set("swaggerUiDir", js.undefined)
    @scala.inline
    def setSwaggerUiPrefix(value: String): Self = this.set("swaggerUiPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwaggerUiPrefix: Self = this.set("swaggerUiPrefix", js.undefined)
  }
  
}

