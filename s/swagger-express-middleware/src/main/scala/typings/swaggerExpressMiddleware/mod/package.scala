package typings.swaggerExpressMiddleware.mod

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Application_
import typings.express.mod.RequestHandler
import typings.express.mod.Router
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CORSSignature = js.Function0[
RequestHandler[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
  Any, 
  Any, 
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
  Record[String, Any]
]]

type DefinitionsObject = StringDictionary[SchemaObject]

type ExampleObject = StringDictionary[Any]

type HeaderObject = ItemsObject

type HeadersObject = StringDictionary[HeaderObject]

type MetadataSignature = js.Function1[
/* router */ js.UndefOr[Application_ | Router], 
RequestHandler[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
  Any, 
  Any, 
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
  Record[String, Any]
]]

type MimeTypes = js.Array[String]

type MockSignature = js.Function2[
/* router */ js.UndefOr[Application_ | Router], 
/* datastore */ js.UndefOr[Any], 
RequestHandler[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
  Any, 
  Any, 
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
  Record[String, Any]
]]

type Parameters = js.Array[ParameterObject | ReferenceObject]

type ParametersDefinitionsObject = StringDictionary[ParameterObject]

type PathsObject = StringDictionary[PathItemObject | Any]

type ResponsesDefinitionsObject = StringDictionary[ResponseObject]

type ScopesObject = StringDictionary[Any]

type SecurityDefinitionsObject = StringDictionary[SecuritySchemeObject]

type SecurityRequirementObject = StringDictionary[js.Array[String]]

type SwaggerMiddlewareConstructor = js.Function3[
/* apiDefinitionPathOrObject */ String | SwaggerObject, 
/* appOrRouter */ Application_ | Router, 
/* cb */ SwaggerMiddlewareConstructorCallback, 
SwaggerMiddleware]

type SwaggerMiddlewareConstructorCallback = js.Function4[
/* err */ Any, 
/* middleware */ SwaggerMiddleware, 
/* api */ SwaggerObject, 
/* parser */ typings.swaggerParser.mod.^, 
Unit]
