package typings.swaggerNodeRunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSwagger extends js.Object {
  var swagger: AnonPath
}

object AnonSwagger {
  @scala.inline
  def apply(swagger: AnonPath): AnonSwagger = {
    val __obj = js.Dynamic.literal(swagger = swagger.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSwagger]
  }
}

