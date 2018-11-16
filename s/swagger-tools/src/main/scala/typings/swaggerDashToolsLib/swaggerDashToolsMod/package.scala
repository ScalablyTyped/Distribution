package typings
package swaggerDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swaggerDashToolsMod {
  type InitializeMiddlewareCallback12 = js.Function1[/* middleware */ Middleware12, scala.Unit]
  type InitializeMiddlewareCallback20 = js.Function1[/* middleware */ Middleware20, scala.Unit]
  type SwaggerRouter12HandlerFunction = js.Function3[
    /* req */ Swagger12Request, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* next */ js.Function1[/* arg */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
  type SwaggerRouter20HandlerFunction = js.Function3[
    /* req */ Swagger20Request[js.Any], 
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* next */ js.Function1[/* arg */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
  type SwaggerSecurityCallback = js.Function1[/* err */ js.UndefOr[SwaggerSecurityError], scala.Unit]
  type SwaggerSecurityHandler = js.Function4[
    /* request */ nodeLib.httpMod.IncomingMessage, 
    /* securityDefinition */ js.Any, 
    /* scopes */ java.lang.String | js.Array[java.lang.String], 
    /* callback */ SwaggerSecurityCallback, 
    scala.Unit
  ]
}
