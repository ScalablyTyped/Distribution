package typings
package swaggerDashExpressDashMiddlewareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swaggerDashExpressDashMiddlewareMod {
  type CORSSignature = js.Function0[expressLib.expressMod.RequestHandler]
  type DefinitionsObject = org.scalablytyped.runtime.StringDictionary[SchemaObject]
  type ExampleObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type HeaderObject = ItemsObject
  type HeadersObject = org.scalablytyped.runtime.StringDictionary[HeaderObject]
  type MetadataSignature = js.Function1[
    /* router */ js.UndefOr[expressLib.expressMod.Application | expressLib.expressMod.Router], 
    expressLib.expressMod.RequestHandler
  ]
  type MimeTypes = js.Array[java.lang.String]
  type MockSignature = js.Function2[
    /* router */ js.UndefOr[expressLib.expressMod.Application | expressLib.expressMod.Router], 
    /* datastore */ js.UndefOr[js.Any], 
    expressLib.expressMod.RequestHandler
  ]
  type Parameters = js.Array[ParameterObject | ReferenceObject]
  type ParametersDefinitionsObject = org.scalablytyped.runtime.StringDictionary[ParameterObject]
  type PathsObject = org.scalablytyped.runtime.StringDictionary[PathItemObject | js.Any]
  type ResponsesDefinitionsObject = org.scalablytyped.runtime.StringDictionary[ResponseObject]
  type ScopesObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type SecurityDefinitionsObject = org.scalablytyped.runtime.StringDictionary[SecuritySchemeObject]
  type SecurityRequirementObject = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  type SwaggerMiddlewareConstructor = js.Function3[
    /* apiDefinitionPathOrObject */ java.lang.String | SwaggerObject, 
    /* appOrRouter */ expressLib.expressMod.Application | expressLib.expressMod.Router, 
    /* cb */ SwaggerMiddlewareConstructorCallback, 
    SwaggerMiddleware
  ]
  type SwaggerMiddlewareConstructorCallback = js.Function4[
    /* err */ js.Any, 
    /* middleware */ SwaggerMiddleware, 
    /* api */ SwaggerObject, 
    /* parser */ swaggerDashParserLib.swaggerDashParserMod.^, 
    scala.Unit
  ]
}
