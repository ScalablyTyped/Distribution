package typings.swaggerExpressMw

import typings.std.Error
import typings.swaggerNodeRunner.mod.Config
import typings.swaggerNodeRunner.mod.ConnectMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("swagger-express-mw", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def create(
    config: Config,
    cb: js.Function2[/* err */ js.UndefOr[Error], /* runner */ ConnectMiddleware, Unit]
  ): Unit = js.native
}
