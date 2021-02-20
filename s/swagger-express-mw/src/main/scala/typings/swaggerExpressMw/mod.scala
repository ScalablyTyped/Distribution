package typings.swaggerExpressMw

import typings.std.Error
import typings.swaggerNodeRunner.mod.Config
import typings.swaggerNodeRunner.mod.ConnectMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swagger-express-mw", "create")
  @js.native
  def create(
    config: Config,
    cb: js.Function2[/* err */ js.UndefOr[Error], /* runner */ ConnectMiddleware, Unit]
  ): Unit = js.native
}
