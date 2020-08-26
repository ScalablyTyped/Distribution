package typings.swaggerJsdoc.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends /* key */ StringDictionary[js.Any] {
  var apis: js.UndefOr[js.Array[String]] = js.native
  var definition: js.UndefOr[SwaggerDefinition] = js.native
  var swaggerDefinition: js.UndefOr[SwaggerDefinition] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setApisVarargs(value: String*): Self = this.set("apis", js.Array(value :_*))
    @scala.inline
    def setApis(value: js.Array[String]): Self = this.set("apis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApis: Self = this.set("apis", js.undefined)
    @scala.inline
    def setDefinition(value: SwaggerDefinition): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    @scala.inline
    def setSwaggerDefinition(value: SwaggerDefinition): Self = this.set("swaggerDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwaggerDefinition: Self = this.set("swaggerDefinition", js.undefined)
  }
  
}

