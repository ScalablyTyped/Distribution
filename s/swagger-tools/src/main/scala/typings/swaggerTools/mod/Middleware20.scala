package typings.swaggerTools.mod

import typings.connect.mod.NextHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Middleware20 extends Middleware {
  def swaggerRouter(): NextHandleFunction = js.native
  def swaggerRouter(options: SwaggerRouter20Options): NextHandleFunction = js.native
  def swaggerUi(): NextHandleFunction = js.native
  def swaggerUi(options: SwaggerUiOptions): NextHandleFunction = js.native
}

