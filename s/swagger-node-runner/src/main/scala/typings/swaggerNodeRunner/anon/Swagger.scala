package typings.swaggerNodeRunner.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Swagger extends js.Object {
  var swagger: Path
}

object Swagger {
  @scala.inline
  def apply(swagger: Path): Swagger = {
    val __obj = js.Dynamic.literal(swagger = swagger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Swagger]
  }
}

