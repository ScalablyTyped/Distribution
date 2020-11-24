package typings.swaggerTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type InitializeMiddlewareCallback12 = js.Function1[/* middleware */ typings.swaggerTools.mod.Middleware12, scala.Unit]
  
  type InitializeMiddlewareCallback20 = js.Function1[/* middleware */ typings.swaggerTools.mod.Middleware20, scala.Unit]
  
  type Swagger20Security = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type SwaggerRequestParameters = org.scalablytyped.runtime.StringDictionary[js.UndefOr[typings.swaggerTools.mod.SwaggerRequestParameter[js.Any]]]
  
  type SwaggerRouter12HandlerFunction = js.Function3[
    /* req */ typings.swaggerTools.mod.Swagger12Request, 
    /* res */ typings.node.httpMod.ServerResponse, 
    /* next */ js.Function1[/* arg */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
  
  type SwaggerRouter12OptionsControllers = org.scalablytyped.runtime.StringDictionary[typings.swaggerTools.mod.SwaggerRouter12HandlerFunction]
  
  type SwaggerRouter20HandlerFunction = js.Function3[
    /* req */ typings.swaggerTools.mod.Swagger20Request[js.Any], 
    /* res */ typings.node.httpMod.ServerResponse, 
    /* next */ js.Function1[/* arg */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
  
  type SwaggerRouter20OptionsControllers = org.scalablytyped.runtime.StringDictionary[typings.swaggerTools.mod.SwaggerRouter20HandlerFunction]
  
  type SwaggerSecurityCallback = js.Function1[/* err */ js.UndefOr[typings.swaggerTools.mod.SwaggerSecurityError], scala.Unit]
  
  type SwaggerSecurityHandler = js.Function4[
    /* request */ typings.node.httpMod.IncomingMessage, 
    /* securityDefinition */ js.Any, 
    /* scopes */ java.lang.String | js.Array[java.lang.String], 
    /* callback */ typings.swaggerTools.mod.SwaggerSecurityCallback, 
    scala.Unit
  ]
  
  type SwaggerSecurityOptions = org.scalablytyped.runtime.StringDictionary[typings.swaggerTools.mod.SwaggerSecurityHandler]
  
  type SwaggerUi12ApiDeclarations = org.scalablytyped.runtime.StringDictionary[js.Any]
}
