package typings.swaggerNodeRunner.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Swagger extends js.Object {
  var swagger: Path = js.native
}

object Swagger {
  @scala.inline
  def apply(swagger: Path): Swagger = {
    val __obj = js.Dynamic.literal(swagger = swagger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Swagger]
  }
  @scala.inline
  implicit class SwaggerOps[Self <: Swagger] (val x: Self) extends AnyVal {
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
    def setSwagger(value: Path): Self = this.set("swagger", value.asInstanceOf[js.Any])
  }
  
}

