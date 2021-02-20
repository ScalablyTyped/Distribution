package typings.swaggerTools

import org.scalablytyped.runtime.StringDictionary
import typings.connect.mod.NextHandleFunction
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.swaggerTools.anon.Api
import typings.swaggerTools.anon.ApiPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swagger-tools", "initializeMiddleware")
  @js.native
  def initializeMiddleware(swaggerObject: js.Any, callback: InitializeMiddlewareCallback20): Unit = js.native
  @JSImport("swagger-tools", "initializeMiddleware")
  @js.native
  def initializeMiddleware(swaggerObject: js.Any, resources: js.Array[Resource], callback: InitializeMiddlewareCallback12): Unit = js.native
  
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
  trait Middleware12 extends Middleware {
    
    def swaggerRouter(): NextHandleFunction = js.native
    def swaggerRouter(options: SwaggerRouter12Options): NextHandleFunction = js.native
    
    def swaggerUi(apiDeclarations: SwaggerUi12ApiDeclarations): NextHandleFunction = js.native
    def swaggerUi(apiDeclarations: SwaggerUi12ApiDeclarations, options: SwaggerUiOptions): NextHandleFunction = js.native
  }
  
  @js.native
  trait Middleware20 extends Middleware {
    
    def swaggerRouter(): NextHandleFunction = js.native
    def swaggerRouter(options: SwaggerRouter20Options): NextHandleFunction = js.native
    
    def swaggerUi(): NextHandleFunction = js.native
    def swaggerUi(options: SwaggerUiOptions): NextHandleFunction = js.native
  }
  
  @js.native
  trait OperationParameter extends StObject {
    
    var path: js.Array[String] = js.native
    
    var schema: SwaggerParameterSchema = js.native
  }
  object OperationParameter {
    
    @scala.inline
    def apply(path: js.Array[String], schema: SwaggerParameterSchema): OperationParameter = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationParameter]
    }
    
    @scala.inline
    implicit class OperationParameterMutableBuilder[Self <: OperationParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setSchema(value: SwaggerParameterSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Resource extends StObject {
    
    var resourcePath: String = js.native
  }
  object Resource {
    
    @scala.inline
    def apply(resourcePath: String): Resource = {
      val __obj = js.Dynamic.literal(resourcePath = resourcePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resource]
    }
    
    @scala.inline
    implicit class ResourceMutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResourcePath(value: String): Self = StObject.set(x, "resourcePath", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Swagger12Request extends IncomingMessage {
    
    var swagger: Api = js.native
  }
  
  @js.native
  trait Swagger20Operation extends StObject {
    
    var operationId: js.UndefOr[String] = js.native
    
    var parameters: js.UndefOr[js.Array[SwaggerParameterSchema]] = js.native
    
    var responses: StringDictionary[Swagger20Response] = js.native
    
    var security: js.UndefOr[js.Array[Swagger20Security]] = js.native
    
    var summary: js.UndefOr[String] = js.native
    
    var tags: js.UndefOr[js.Array[String]] = js.native
  }
  object Swagger20Operation {
    
    @scala.inline
    def apply(responses: StringDictionary[Swagger20Response]): Swagger20Operation = {
      val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
      __obj.asInstanceOf[Swagger20Operation]
    }
    
    @scala.inline
    implicit class Swagger20OperationMutableBuilder[Self <: Swagger20Operation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
      
      @scala.inline
      def setParameters(value: js.Array[SwaggerParameterSchema]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setParametersVarargs(value: SwaggerParameterSchema*): Self = StObject.set(x, "parameters", js.Array(value :_*))
      
      @scala.inline
      def setResponses(value: StringDictionary[Swagger20Response]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurity(value: js.Array[Swagger20Security]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSecurityVarargs(value: Swagger20Security*): Self = StObject.set(x, "security", js.Array(value :_*))
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Swagger20Request[P /* <: SwaggerRequestParameters */] extends IncomingMessage {
    
    var swagger: ApiPath[P] = js.native
  }
  
  @js.native
  trait Swagger20Response extends StObject {
    
    var description: js.UndefOr[String] = js.native
    
    var schema: js.UndefOr[js.Any] = js.native
  }
  object Swagger20Response {
    
    @scala.inline
    def apply(): Swagger20Response = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Swagger20Response]
    }
    
    @scala.inline
    implicit class Swagger20ResponseMutableBuilder[Self <: Swagger20Response] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setSchema(value: js.Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
  
  type Swagger20Security = StringDictionary[js.Any]
  
  @js.native
  trait SwaggerParameterSchema extends StObject {
    
    var allowMultiple: js.UndefOr[Boolean] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var format: js.UndefOr[String] = js.native
    
    var in: js.UndefOr[String] = js.native
    
    var maximum: js.UndefOr[String] = js.native
    
    var minimum: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var paramType: js.UndefOr[String] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var `type`: String = js.native
  }
  object SwaggerParameterSchema {
    
    @scala.inline
    def apply(name: String, `type`: String): SwaggerParameterSchema = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwaggerParameterSchema]
    }
    
    @scala.inline
    implicit class SwaggerParameterSchemaMutableBuilder[Self <: SwaggerParameterSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowMultiple(value: Boolean): Self = StObject.set(x, "allowMultiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMultipleUndefined: Self = StObject.set(x, "allowMultiple", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      @scala.inline
      def setMaximum(value: String): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      @scala.inline
      def setMinimum(value: String): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamType(value: String): Self = StObject.set(x, "paramType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamTypeUndefined: Self = StObject.set(x, "paramType", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SwaggerRequestParameter[T] extends StObject {
    
    var originalValue: js.Any = js.native
    
    var path: js.Array[String] = js.native
    
    var schema: SwaggerParameterSchema = js.native
    
    var value: T = js.native
  }
  object SwaggerRequestParameter {
    
    @scala.inline
    def apply[T](originalValue: js.Any, path: js.Array[String], schema: SwaggerParameterSchema, value: T): SwaggerRequestParameter[T] = {
      val __obj = js.Dynamic.literal(originalValue = originalValue.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwaggerRequestParameter[T]]
    }
    
    @scala.inline
    implicit class SwaggerRequestParameterMutableBuilder[Self <: SwaggerRequestParameter[_], T] (val x: Self with SwaggerRequestParameter[T]) extends AnyVal {
      
      @scala.inline
      def setOriginalValue(value: js.Any): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setSchema(value: SwaggerParameterSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type SwaggerRequestParameters = StringDictionary[js.UndefOr[SwaggerRequestParameter[js.Any]]]
  
  type SwaggerRouter12HandlerFunction = js.Function3[
    /* req */ Swagger12Request, 
    /* res */ ServerResponse, 
    /* next */ js.Function1[/* arg */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  
  @js.native
  trait SwaggerRouter12Options extends StObject {
    
    var controllers: js.UndefOr[SwaggerRouter12OptionsControllers | String | js.Array[String]] = js.native
    
    var ignoreMissingHandlers: js.UndefOr[Boolean] = js.native
    
    var useStubs: js.UndefOr[Boolean] = js.native
  }
  object SwaggerRouter12Options {
    
    @scala.inline
    def apply(): SwaggerRouter12Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwaggerRouter12Options]
    }
    
    @scala.inline
    implicit class SwaggerRouter12OptionsMutableBuilder[Self <: SwaggerRouter12Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControllers(value: SwaggerRouter12OptionsControllers | String | js.Array[String]): Self = StObject.set(x, "controllers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControllersUndefined: Self = StObject.set(x, "controllers", js.undefined)
      
      @scala.inline
      def setControllersVarargs(value: String*): Self = StObject.set(x, "controllers", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreMissingHandlers(value: Boolean): Self = StObject.set(x, "ignoreMissingHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreMissingHandlersUndefined: Self = StObject.set(x, "ignoreMissingHandlers", js.undefined)
      
      @scala.inline
      def setUseStubs(value: Boolean): Self = StObject.set(x, "useStubs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseStubsUndefined: Self = StObject.set(x, "useStubs", js.undefined)
    }
  }
  
  type SwaggerRouter12OptionsControllers = StringDictionary[SwaggerRouter12HandlerFunction]
  
  type SwaggerRouter20HandlerFunction = js.Function3[
    /* req */ Swagger20Request[js.Any], 
    /* res */ ServerResponse, 
    /* next */ js.Function1[/* arg */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  
  @js.native
  trait SwaggerRouter20Options extends StObject {
    
    var controllers: js.UndefOr[SwaggerRouter20OptionsControllers | String | js.Array[String]] = js.native
    
    var ignoreMissingHandlers: js.UndefOr[Boolean] = js.native
    
    var useStubs: js.UndefOr[Boolean] = js.native
  }
  object SwaggerRouter20Options {
    
    @scala.inline
    def apply(): SwaggerRouter20Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwaggerRouter20Options]
    }
    
    @scala.inline
    implicit class SwaggerRouter20OptionsMutableBuilder[Self <: SwaggerRouter20Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControllers(value: SwaggerRouter20OptionsControllers | String | js.Array[String]): Self = StObject.set(x, "controllers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControllersUndefined: Self = StObject.set(x, "controllers", js.undefined)
      
      @scala.inline
      def setControllersVarargs(value: String*): Self = StObject.set(x, "controllers", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreMissingHandlers(value: Boolean): Self = StObject.set(x, "ignoreMissingHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreMissingHandlersUndefined: Self = StObject.set(x, "ignoreMissingHandlers", js.undefined)
      
      @scala.inline
      def setUseStubs(value: Boolean): Self = StObject.set(x, "useStubs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseStubsUndefined: Self = StObject.set(x, "useStubs", js.undefined)
    }
  }
  
  type SwaggerRouter20OptionsControllers = StringDictionary[SwaggerRouter20HandlerFunction]
  
  type SwaggerSecurityCallback = js.Function1[/* err */ js.UndefOr[SwaggerSecurityError], Unit]
  
  @js.native
  trait SwaggerSecurityError extends StObject {
    
    var code: js.UndefOr[String] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var state: js.UndefOr[String] = js.native
    
    var statusCode: js.UndefOr[Double] = js.native
  }
  object SwaggerSecurityError {
    
    @scala.inline
    def apply(): SwaggerSecurityError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwaggerSecurityError]
    }
    
    @scala.inline
    implicit class SwaggerSecurityErrorMutableBuilder[Self <: SwaggerSecurityError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  type SwaggerSecurityHandler = js.Function4[
    /* request */ IncomingMessage, 
    /* securityDefinition */ js.Any, 
    /* scopes */ String | js.Array[String], 
    /* callback */ SwaggerSecurityCallback, 
    Unit
  ]
  
  type SwaggerSecurityOptions = StringDictionary[SwaggerSecurityHandler]
  
  type SwaggerUi12ApiDeclarations = StringDictionary[js.Any]
  
  @js.native
  trait SwaggerUiOptions extends StObject {
    
    var apiDocs: js.UndefOr[String] = js.native
    
    var apiDocsPrefix: js.UndefOr[String] = js.native
    
    var swaggerUi: js.UndefOr[String] = js.native
    
    var swaggerUiDir: js.UndefOr[String] = js.native
    
    var swaggerUiPrefix: js.UndefOr[String] = js.native
  }
  object SwaggerUiOptions {
    
    @scala.inline
    def apply(): SwaggerUiOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwaggerUiOptions]
    }
    
    @scala.inline
    implicit class SwaggerUiOptionsMutableBuilder[Self <: SwaggerUiOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiDocs(value: String): Self = StObject.set(x, "apiDocs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiDocsPrefix(value: String): Self = StObject.set(x, "apiDocsPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiDocsPrefixUndefined: Self = StObject.set(x, "apiDocsPrefix", js.undefined)
      
      @scala.inline
      def setApiDocsUndefined: Self = StObject.set(x, "apiDocs", js.undefined)
      
      @scala.inline
      def setSwaggerUi(value: String): Self = StObject.set(x, "swaggerUi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwaggerUiDir(value: String): Self = StObject.set(x, "swaggerUiDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwaggerUiDirUndefined: Self = StObject.set(x, "swaggerUiDir", js.undefined)
      
      @scala.inline
      def setSwaggerUiPrefix(value: String): Self = StObject.set(x, "swaggerUiPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwaggerUiPrefixUndefined: Self = StObject.set(x, "swaggerUiPrefix", js.undefined)
      
      @scala.inline
      def setSwaggerUiUndefined: Self = StObject.set(x, "swaggerUi", js.undefined)
    }
  }
  
  @js.native
  trait SwaggerValidatorOptions extends StObject {
    
    var validateResponse: js.UndefOr[Boolean] = js.native
  }
  object SwaggerValidatorOptions {
    
    @scala.inline
    def apply(): SwaggerValidatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwaggerValidatorOptions]
    }
    
    @scala.inline
    implicit class SwaggerValidatorOptionsMutableBuilder[Self <: SwaggerValidatorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValidateResponse(value: Boolean): Self = StObject.set(x, "validateResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateResponseUndefined: Self = StObject.set(x, "validateResponse", js.undefined)
    }
  }
}
