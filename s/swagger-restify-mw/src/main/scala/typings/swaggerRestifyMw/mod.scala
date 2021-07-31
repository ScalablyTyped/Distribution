package typings.swaggerRestifyMw

import typings.std.Error
import typings.swaggerNodeRunner.mod.Config
import typings.swaggerNodeRunner.mod.RestifyMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swagger-restify-mw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(
    config: Config,
    cb: js.Function2[/* err */ js.UndefOr[Error], /* middleware */ RestifyMiddleware, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
