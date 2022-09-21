package typings.swaggerTools

import org.scalablytyped.runtime.StringDictionary
import typings.connect.mod.NextHandleFunction
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.swaggerTools.anon.Api
import typings.swaggerTools.anon.ApiPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swagger-tools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initializeMiddleware(swaggerObject: Any, callback: InitializeMiddlewareCallback20): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeMiddleware")(swaggerObject.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initializeMiddleware(swaggerObject: Any, resources: js.Array[Resource], callback: InitializeMiddlewareCallback12): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeMiddleware")(swaggerObject.asInstanceOf[js.Any], resources.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type InitializeMiddlewareCallback12 = js.Function1[/* middleware */ Middleware12, Unit]
  
  type InitializeMiddlewareCallback20 = js.Function1[/* middleware */ Middleware20, Unit]
  
  @js.native
  trait Middleware extends StObject {
    
    def swaggerMetadata(): NextHandleFunction = js.native
    
    def swaggerSecurity(): NextHandleFunction = js.native
    def swaggerSecurity(options: SwaggerSecurityOptions): NextHandleFunction = js.native
    
    def swaggerValidator(): NextHandleFunction = js.native
    def swaggerValidator(options: SwaggerValidatorOptions): NextHandleFunction = js.native
  }
  
  @js.native
  trait Middleware12
    extends StObject
       with Middleware {
    
    def swaggerRouter(): NextHandleFunction = js.native
    def swaggerRouter(options: SwaggerRouter12Options): NextHandleFunction = js.native
    
    def swaggerUi(apiDeclarations: SwaggerUi12ApiDeclarations): NextHandleFunction = js.native
    def swaggerUi(apiDeclarations: SwaggerUi12ApiDeclarations, options: SwaggerUiOptions): NextHandleFunction = js.native
  }
  
  @js.native
  trait Middleware20
    extends StObject
       with Middleware {
    
    def swaggerRouter(): NextHandleFunction = js.native
    def swaggerRouter(options: SwaggerRouter20Options): NextHandleFunction = js.native
    
    def swaggerUi(): NextHandleFunction = js.native
    def swaggerUi(options: SwaggerUiOptions): NextHandleFunction = js.native
  }
  
  trait OperationParameter extends StObject {
    
    var path: js.Array[String]
    
    var schema: SwaggerParameterSchema
  }
  object OperationParameter {
    
    inline def apply(path: js.Array[String], schema: SwaggerParameterSchema): OperationParameter = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationParameter]
    }
    
    extension [Self <: OperationParameter](x: Self) {
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setSchema(value: SwaggerParameterSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
  
  trait Resource extends StObject {
    
    var resourcePath: String
  }
  object Resource {
    
    inline def apply(resourcePath: String): Resource = {
      val __obj = js.Dynamic.literal(resourcePath = resourcePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resource]
    }
    
    extension [Self <: Resource](x: Self) {
      
      inline def setResourcePath(value: String): Self = StObject.set(x, "resourcePath", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Swagger12Request extends IncomingMessage {
    
    var swagger: Api = js.native
  }
  
  trait Swagger20Operation extends StObject {
    
    var operationId: js.UndefOr[String] = js.undefined
    
    var parameters: js.UndefOr[js.Array[SwaggerParameterSchema]] = js.undefined
    
    var responses: StringDictionary[Swagger20Response]
    
    var security: js.UndefOr[js.Array[Swagger20Security]] = js.undefined
    
    var summary: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Swagger20Operation {
    
    inline def apply(responses: StringDictionary[Swagger20Response]): Swagger20Operation = {
      val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
      __obj.asInstanceOf[Swagger20Operation]
    }
    
    extension [Self <: Swagger20Operation](x: Self) {
      
      inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
      
      inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
      
      inline def setParameters(value: js.Array[SwaggerParameterSchema]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParametersVarargs(value: SwaggerParameterSchema*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setResponses(value: StringDictionary[Swagger20Response]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
      
      inline def setSecurity(value: js.Array[Swagger20Security]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSecurityVarargs(value: Swagger20Security*): Self = StObject.set(x, "security", js.Array(value*))
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  @js.native
  trait Swagger20Request[P /* <: SwaggerRequestParameters */] extends IncomingMessage {
    
    var swagger: ApiPath[P] = js.native
  }
  
  trait Swagger20Response extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var schema: js.UndefOr[Any] = js.undefined
  }
  object Swagger20Response {
    
    inline def apply(): Swagger20Response = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Swagger20Response]
    }
    
    extension [Self <: Swagger20Response](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setSchema(value: Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
  
  type Swagger20Security = StringDictionary[Any]
  
  trait SwaggerParameterSchema extends StObject {
    
    var allowMultiple: js.UndefOr[Boolean] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var in: js.UndefOr[String] = js.undefined
    
    var maximum: js.UndefOr[String] = js.undefined
    
    var minimum: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var paramType: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var `type`: String
  }
  object SwaggerParameterSchema {
    
    inline def apply(name: String, `type`: String): SwaggerParameterSchema = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwaggerParameterSchema]
    }
    
    extension [Self <: SwaggerParameterSchema](x: Self) {
      
      inline def setAllowMultiple(value: Boolean): Self = StObject.set(x, "allowMultiple", value.asInstanceOf[js.Any])
      
      inline def setAllowMultipleUndefined: Self = StObject.set(x, "allowMultiple", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setMaximum(value: String): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      inline def setMinimum(value: String): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParamType(value: String): Self = StObject.set(x, "paramType", value.asInstanceOf[js.Any])
      
      inline def setParamTypeUndefined: Self = StObject.set(x, "paramType", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SwaggerRequestParameter[T] extends StObject {
    
    var originalValue: Any
    
    var path: js.Array[String]
    
    var schema: SwaggerParameterSchema
    
    var value: T
  }
  object SwaggerRequestParameter {
    
    inline def apply[T](originalValue: Any, path: js.Array[String], schema: SwaggerParameterSchema, value: T): SwaggerRequestParameter[T] = {
      val __obj = js.Dynamic.literal(originalValue = originalValue.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwaggerRequestParameter[T]]
    }
    
    extension [Self <: SwaggerRequestParameter[?], T](x: Self & SwaggerRequestParameter[T]) {
      
      inline def setOriginalValue(value: Any): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setSchema(value: SwaggerParameterSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type SwaggerRequestParameters = StringDictionary[js.UndefOr[SwaggerRequestParameter[Any]]]
  
  type SwaggerRouter12HandlerFunction = js.Function3[
    /* req */ Swagger12Request, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function1[/* arg */ js.UndefOr[Any], Unit], 
    Unit
  ]
  
  trait SwaggerRouter12Options extends StObject {
    
    var controllers: js.UndefOr[SwaggerRouter12OptionsControllers | String | js.Array[String]] = js.undefined
    
    var ignoreMissingHandlers: js.UndefOr[Boolean] = js.undefined
    
    var useStubs: js.UndefOr[Boolean] = js.undefined
  }
  object SwaggerRouter12Options {
    
    inline def apply(): SwaggerRouter12Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwaggerRouter12Options]
    }
    
    extension [Self <: SwaggerRouter12Options](x: Self) {
      
      inline def setControllers(value: SwaggerRouter12OptionsControllers | String | js.Array[String]): Self = StObject.set(x, "controllers", value.asInstanceOf[js.Any])
      
      inline def setControllersUndefined: Self = StObject.set(x, "controllers", js.undefined)
      
      inline def setControllersVarargs(value: String*): Self = StObject.set(x, "controllers", js.Array(value*))
      
      inline def setIgnoreMissingHandlers(value: Boolean): Self = StObject.set(x, "ignoreMissingHandlers", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMissingHandlersUndefined: Self = StObject.set(x, "ignoreMissingHandlers", js.undefined)
      
      inline def setUseStubs(value: Boolean): Self = StObject.set(x, "useStubs", value.asInstanceOf[js.Any])
      
      inline def setUseStubsUndefined: Self = StObject.set(x, "useStubs", js.undefined)
    }
  }
  
  type SwaggerRouter12OptionsControllers = StringDictionary[SwaggerRouter12HandlerFunction]
  
  type SwaggerRouter20HandlerFunction = js.Function3[
    /* req */ Swagger20Request[Any], 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function1[/* arg */ js.UndefOr[Any], Unit], 
    Unit
  ]
  
  trait SwaggerRouter20Options extends StObject {
    
    var controllers: js.UndefOr[SwaggerRouter20OptionsControllers | String | js.Array[String]] = js.undefined
    
    var ignoreMissingHandlers: js.UndefOr[Boolean] = js.undefined
    
    var useStubs: js.UndefOr[Boolean] = js.undefined
  }
  object SwaggerRouter20Options {
    
    inline def apply(): SwaggerRouter20Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwaggerRouter20Options]
    }
    
    extension [Self <: SwaggerRouter20Options](x: Self) {
      
      inline def setControllers(value: SwaggerRouter20OptionsControllers | String | js.Array[String]): Self = StObject.set(x, "controllers", value.asInstanceOf[js.Any])
      
      inline def setControllersUndefined: Self = StObject.set(x, "controllers", js.undefined)
      
      inline def setControllersVarargs(value: String*): Self = StObject.set(x, "controllers", js.Array(value*))
      
      inline def setIgnoreMissingHandlers(value: Boolean): Self = StObject.set(x, "ignoreMissingHandlers", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMissingHandlersUndefined: Self = StObject.set(x, "ignoreMissingHandlers", js.undefined)
      
      inline def setUseStubs(value: Boolean): Self = StObject.set(x, "useStubs", value.asInstanceOf[js.Any])
      
      inline def setUseStubsUndefined: Self = StObject.set(x, "useStubs", js.undefined)
    }
  }
  
  type SwaggerRouter20OptionsControllers = StringDictionary[SwaggerRouter20HandlerFunction]
  
  type SwaggerSecurityCallback = js.Function1[/* err */ js.UndefOr[SwaggerSecurityError], Unit]
  
  trait SwaggerSecurityError extends StObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object SwaggerSecurityError {
    
    inline def apply(): SwaggerSecurityError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwaggerSecurityError]
    }
    
    extension [Self <: SwaggerSecurityError](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  type SwaggerSecurityHandler = js.Function4[
    /* request */ IncomingMessage, 
    /* securityDefinition */ Any, 
    /* scopes */ String | js.Array[String], 
    /* callback */ SwaggerSecurityCallback, 
    Unit
  ]
  
  type SwaggerSecurityOptions = StringDictionary[SwaggerSecurityHandler]
  
  type SwaggerUi12ApiDeclarations = StringDictionary[Any]
  
  trait SwaggerUiOptions extends StObject {
    
    var apiDocs: js.UndefOr[String] = js.undefined
    
    var apiDocsPrefix: js.UndefOr[String] = js.undefined
    
    var swaggerUi: js.UndefOr[String] = js.undefined
    
    var swaggerUiDir: js.UndefOr[String] = js.undefined
    
    var swaggerUiPrefix: js.UndefOr[String] = js.undefined
  }
  object SwaggerUiOptions {
    
    inline def apply(): SwaggerUiOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwaggerUiOptions]
    }
    
    extension [Self <: SwaggerUiOptions](x: Self) {
      
      inline def setApiDocs(value: String): Self = StObject.set(x, "apiDocs", value.asInstanceOf[js.Any])
      
      inline def setApiDocsPrefix(value: String): Self = StObject.set(x, "apiDocsPrefix", value.asInstanceOf[js.Any])
      
      inline def setApiDocsPrefixUndefined: Self = StObject.set(x, "apiDocsPrefix", js.undefined)
      
      inline def setApiDocsUndefined: Self = StObject.set(x, "apiDocs", js.undefined)
      
      inline def setSwaggerUi(value: String): Self = StObject.set(x, "swaggerUi", value.asInstanceOf[js.Any])
      
      inline def setSwaggerUiDir(value: String): Self = StObject.set(x, "swaggerUiDir", value.asInstanceOf[js.Any])
      
      inline def setSwaggerUiDirUndefined: Self = StObject.set(x, "swaggerUiDir", js.undefined)
      
      inline def setSwaggerUiPrefix(value: String): Self = StObject.set(x, "swaggerUiPrefix", value.asInstanceOf[js.Any])
      
      inline def setSwaggerUiPrefixUndefined: Self = StObject.set(x, "swaggerUiPrefix", js.undefined)
      
      inline def setSwaggerUiUndefined: Self = StObject.set(x, "swaggerUi", js.undefined)
    }
  }
  
  trait SwaggerValidatorOptions extends StObject {
    
    var validateResponse: js.UndefOr[Boolean] = js.undefined
  }
  object SwaggerValidatorOptions {
    
    inline def apply(): SwaggerValidatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwaggerValidatorOptions]
    }
    
    extension [Self <: SwaggerValidatorOptions](x: Self) {
      
      inline def setValidateResponse(value: Boolean): Self = StObject.set(x, "validateResponse", value.asInstanceOf[js.Any])
      
      inline def setValidateResponseUndefined: Self = StObject.set(x, "validateResponse", js.undefined)
    }
  }
}
