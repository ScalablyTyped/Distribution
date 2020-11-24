package typings.swaggerExpressMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CORSSignature = js.Function0[
    typings.express.mod.RequestHandler[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ]
  ]
  
  type DefinitionsObject = org.scalablytyped.runtime.StringDictionary[typings.swaggerExpressMiddleware.mod.SchemaObject]
  
  type ExampleObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type HeaderObject = typings.swaggerExpressMiddleware.mod.ItemsObject
  
  type HeadersObject = org.scalablytyped.runtime.StringDictionary[typings.swaggerExpressMiddleware.mod.HeaderObject]
  
  type MetadataSignature = js.Function1[
    /* router */ js.UndefOr[typings.express.mod.Application_ | typings.express.mod.Router], 
    typings.express.mod.RequestHandler[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ]
  ]
  
  type MimeTypes = js.Array[java.lang.String]
  
  type MockSignature = js.Function2[
    /* router */ js.UndefOr[typings.express.mod.Application_ | typings.express.mod.Router], 
    /* datastore */ js.UndefOr[js.Any], 
    typings.express.mod.RequestHandler[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ]
  ]
  
  type Parameters = js.Array[
    typings.swaggerExpressMiddleware.mod.ParameterObject | typings.swaggerExpressMiddleware.mod.ReferenceObject
  ]
  
  type ParametersDefinitionsObject = org.scalablytyped.runtime.StringDictionary[typings.swaggerExpressMiddleware.mod.ParameterObject]
  
  type PathsObject = org.scalablytyped.runtime.StringDictionary[typings.swaggerExpressMiddleware.mod.PathItemObject | js.Any]
  
  type ResponsesDefinitionsObject = org.scalablytyped.runtime.StringDictionary[typings.swaggerExpressMiddleware.mod.ResponseObject]
  
  type ScopesObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type SecurityDefinitionsObject = org.scalablytyped.runtime.StringDictionary[typings.swaggerExpressMiddleware.mod.SecuritySchemeObject]
  
  type SecurityRequirementObject = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  
  type SwaggerMiddlewareConstructor = js.Function3[
    /* apiDefinitionPathOrObject */ java.lang.String | typings.swaggerExpressMiddleware.mod.SwaggerObject, 
    /* appOrRouter */ typings.express.mod.Application_ | typings.express.mod.Router, 
    /* cb */ typings.swaggerExpressMiddleware.mod.SwaggerMiddlewareConstructorCallback, 
    typings.swaggerExpressMiddleware.mod.SwaggerMiddleware
  ]
  
  type SwaggerMiddlewareConstructorCallback = js.Function4[
    /* err */ js.Any, 
    /* middleware */ typings.swaggerExpressMiddleware.mod.SwaggerMiddleware, 
    /* api */ typings.swaggerExpressMiddleware.mod.SwaggerObject, 
    /* parser */ typings.swaggerParser.mod.^, 
    scala.Unit
  ]
}
