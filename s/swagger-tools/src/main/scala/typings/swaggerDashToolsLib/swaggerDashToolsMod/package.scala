package typings
package swaggerDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swaggerDashToolsMod {
  type InitializeMiddlewareCallback12 = js.Function1[/* middleware */ Middleware12, scala.Unit]
  type InitializeMiddlewareCallback20 = js.Function1[/* middleware */ Middleware20, scala.Unit]
  type Swagger20Security = org.scalablytyped.runtime.StringDictionary[js.Any]
  type SwaggerRequestParameters = org.scalablytyped.runtime.StringDictionary[js.UndefOr[SwaggerRequestParameter[js.Any]]]
  type SwaggerRouter12HandlerFunction = js.Function3[
    /* req */ Swagger12Request, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* next */ js.Function1[/* arg */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
  type SwaggerRouter12OptionsControllers = org.scalablytyped.runtime.StringDictionary[SwaggerRouter12HandlerFunction]
  type SwaggerRouter20HandlerFunction = js.Function3[
    /* req */ Swagger20Request[js.Any], 
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* next */ js.Function1[/* arg */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
  type SwaggerRouter20OptionsControllers = org.scalablytyped.runtime.StringDictionary[SwaggerRouter20HandlerFunction]
  type SwaggerSecurityCallback = js.Function1[/* err */ js.UndefOr[SwaggerSecurityError], scala.Unit]
  type SwaggerSecurityHandler = js.Function4[
    /* request */ nodeLib.httpMod.IncomingMessage, 
    /* securityDefinition */ js.Any, 
    /* scopes */ java.lang.String | js.Array[java.lang.String], 
    /* callback */ SwaggerSecurityCallback, 
    scala.Unit
  ]
  type SwaggerSecurityOptions = org.scalablytyped.runtime.StringDictionary[SwaggerSecurityHandler]
  type SwaggerUi12ApiDeclarations = org.scalablytyped.runtime.StringDictionary[js.Any]
}
