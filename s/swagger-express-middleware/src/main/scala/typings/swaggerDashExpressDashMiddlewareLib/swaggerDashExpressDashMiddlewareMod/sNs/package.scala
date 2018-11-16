package typings
package swaggerDashExpressDashMiddlewareLib.swaggerDashExpressDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sNs {
  type CORSSignature = js.Function0[expressLib.expressMod.eNs.RequestHandler]
  type HeaderObject = ItemsObject
  type MetadataSignature = js.Function1[
    /* router */ js.UndefOr[expressLib.expressMod.eNs.Application | expressLib.expressMod.eNs.Router], 
    expressLib.expressMod.eNs.RequestHandler
  ]
  type MimeTypes = js.Array[java.lang.String]
  type MockSignature = js.Function2[
    /* router */ js.UndefOr[expressLib.expressMod.eNs.Application | expressLib.expressMod.eNs.Router], 
    /* datastore */ js.UndefOr[js.Any], 
    expressLib.expressMod.eNs.RequestHandler
  ]
  type Parameters = js.Array[ParameterObject | ReferenceObject]
  type Response = ResponseObject | ReferenceObject
  type SwaggerMiddlewareConstructor = js.Function3[
    /* apiDefinitionPathOrObject */ java.lang.String | SwaggerObject, 
    /* appOrRouter */ expressLib.expressMod.eNs.Application | expressLib.expressMod.eNs.Router, 
    /* cb */ SwaggerMiddlewareConstructorCallback, 
    SwaggerMiddleware
  ]
  type SwaggerMiddlewareConstructorCallback = js.Function2[/* err */ js.Any, /* middleware */ SwaggerMiddleware, scala.Unit]
}
