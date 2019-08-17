package typings.swaggerDashExpressDashMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swaggerDashExpressDashMiddlewareMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.express.expressMod.Application
  import typings.express.expressMod.RequestHandler
  import typings.express.expressMod.Router

  type CORSSignature = js.Function0[RequestHandler]
  type DefinitionsObject = StringDictionary[SchemaObject]
  type ExampleObject = StringDictionary[js.Any]
  type HeaderObject = ItemsObject
  type HeadersObject = StringDictionary[HeaderObject]
  type MetadataSignature = js.Function1[/* router */ js.UndefOr[Application | Router], RequestHandler]
  type MimeTypes = js.Array[String]
  type MockSignature = js.Function2[
    /* router */ js.UndefOr[Application | Router], 
    /* datastore */ js.UndefOr[js.Any], 
    RequestHandler
  ]
  type Parameters = js.Array[ParameterObject | ReferenceObject]
  type ParametersDefinitionsObject = StringDictionary[ParameterObject]
  type PathsObject = StringDictionary[PathItemObject | js.Any]
  type ResponsesDefinitionsObject = StringDictionary[ResponseObject]
  type ScopesObject = StringDictionary[js.Any]
  type SecurityDefinitionsObject = StringDictionary[SecuritySchemeObject]
  type SecurityRequirementObject = StringDictionary[js.Array[String]]
  type SwaggerMiddlewareConstructor = js.Function3[
    /* apiDefinitionPathOrObject */ String | SwaggerObject, 
    /* appOrRouter */ Application | Router, 
    /* cb */ SwaggerMiddlewareConstructorCallback, 
    SwaggerMiddleware
  ]
  type SwaggerMiddlewareConstructorCallback = js.Function4[
    /* err */ js.Any, 
    /* middleware */ SwaggerMiddleware, 
    /* api */ SwaggerObject, 
    /* parser */ typings.swaggerDashParser.swaggerDashParserMod.^, 
    Unit
  ]
}
