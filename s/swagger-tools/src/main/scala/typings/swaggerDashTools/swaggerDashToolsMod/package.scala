package typings.swaggerDashTools

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swaggerDashToolsMod {
  type InitializeMiddlewareCallback12 = js.Function1[/* middleware */ Middleware12, Unit]
  type InitializeMiddlewareCallback20 = js.Function1[/* middleware */ Middleware20, Unit]
  type Swagger20Security = StringDictionary[js.Any]
  type SwaggerRequestParameters = StringDictionary[js.UndefOr[SwaggerRequestParameter[js.Any]]]
  type SwaggerRouter12HandlerFunction = js.Function3[
    /* req */ Swagger12Request, 
    /* res */ ServerResponse, 
    /* next */ js.Function1[/* arg */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  type SwaggerRouter12OptionsControllers = StringDictionary[SwaggerRouter12HandlerFunction]
  type SwaggerRouter20HandlerFunction = js.Function3[
    /* req */ Swagger20Request[js.Any], 
    /* res */ ServerResponse, 
    /* next */ js.Function1[/* arg */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  type SwaggerRouter20OptionsControllers = StringDictionary[SwaggerRouter20HandlerFunction]
  type SwaggerSecurityCallback = js.Function1[/* err */ js.UndefOr[SwaggerSecurityError], Unit]
  type SwaggerSecurityHandler = js.Function4[
    /* request */ IncomingMessage, 
    /* securityDefinition */ js.Any, 
    /* scopes */ String | js.Array[String], 
    /* callback */ SwaggerSecurityCallback, 
    Unit
  ]
  type SwaggerSecurityOptions = StringDictionary[SwaggerSecurityHandler]
  type SwaggerUi12ApiDeclarations = StringDictionary[js.Any]
}
