package typings
package swaggerDashNodeDashRunnerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swaggerDashNodeDashRunnerMod {
  type ExpressMiddleware = ConnectMiddleware
  type SwaggerToolsMiddleware = js.Function3[/* req */ js.Any, /* res */ js.Any, /* next */ js.Any, js.Any]
  type SwaggerToolsSecurityHandler = js.Function4[
    /* request */ js.Any, 
    /* securityDefinition */ js.Any, 
    /* scopes */ js.Any, 
    /* callback */ js.Function2[
      /* err */ js.UndefOr[stdLib.Error | SwaggerToolsSecurityHandlerCallbackError], 
      /* result */ js.UndefOr[js.Any], 
      scala.Unit
    ], 
    scala.Unit
  ]
}
