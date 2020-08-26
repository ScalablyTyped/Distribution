package typings.swaggerNodeRunner.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigInternal extends js.Object {
  /** Config of SwaggerNodeRunner  */
  var swagger: js.UndefOr[Config] = js.native
}

object ConfigInternal {
  @scala.inline
  def apply(): ConfigInternal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigInternal]
  }
  @scala.inline
  implicit class ConfigInternalOps[Self <: ConfigInternal] (val x: Self) extends AnyVal {
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
    def setSwagger(value: Config): Self = this.set("swagger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwagger: Self = this.set("swagger", js.undefined)
  }
  
}

