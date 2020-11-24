package typings.swaggerTools.mod

import typings.connect.mod.NextHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Middleware12 extends Middleware {
  
  def swaggerRouter(): NextHandleFunction = js.native
  def swaggerRouter(options: SwaggerRouter12Options): NextHandleFunction = js.native
  
  def swaggerUi(apiDeclarations: SwaggerUi12ApiDeclarations): NextHandleFunction = js.native
  def swaggerUi(apiDeclarations: SwaggerUi12ApiDeclarations, options: SwaggerUiOptions): NextHandleFunction = js.native
}
