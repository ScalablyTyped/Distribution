package typings.swaggerDashNodeDashRunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swaggerDashNodeDashRunnerMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error

  type ExpressMiddleware = ConnectMiddleware
  type SwaggerSecurityHandlers = StringDictionary[SwaggerToolsSecurityHandler]
  type SwaggerToolsMiddleware = js.Function3[/* req */ js.Any, /* res */ js.Any, /* next */ js.Any, js.Any]
  type SwaggerToolsSecurityHandler = js.Function4[
    /* request */ js.Any, 
    /* securityDefinition */ js.Any, 
    /* scopes */ js.Any, 
    /* callback */ js.Function2[
      /* err */ js.UndefOr[Error | SwaggerToolsSecurityHandlerCallbackError], 
      /* result */ js.UndefOr[js.Any], 
      Unit
    ], 
    Unit
  ]
}
