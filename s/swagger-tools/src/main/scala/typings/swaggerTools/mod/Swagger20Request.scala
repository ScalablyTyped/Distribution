package typings.swaggerTools.mod

import typings.node.httpMod.IncomingMessage
import typings.swaggerTools.AnonApiPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Swagger20Request[P /* <: SwaggerRequestParameters */] extends IncomingMessage {
  var swagger: AnonApiPath[P] = js.native
}

