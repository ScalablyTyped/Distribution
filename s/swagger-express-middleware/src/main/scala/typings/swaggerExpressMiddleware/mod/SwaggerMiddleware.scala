package typings.swaggerExpressMiddleware.mod

import typings.express.mod.Application_
import typings.express.mod.RequestHandler
import typings.express.mod.Router
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwaggerMiddleware extends StObject {
  
  /**
    * Handles CORS preflight requests and sets CORS headers for all requests according the Swagger API definition.
    */
  def CORS(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  /**
    * Handles CORS preflight requests and sets CORS headers for all requests according the Swagger API definition.
    */
  @JSName("CORS")
  var CORS_Original: CORSSignature
  
  /**
    * Serves the Swagger API file(s) in JSON and YAML formats, so they can be used with third-party front-end tools like Swagger UI and Swagger Editor.
    */
  def files(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  def files(/**
    * Options for how the files are served
    */
  options: FilesOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  /**
    * Serves the Swagger API file(s) in JSON and YAML formats, so they can be used with third-party front-end tools like Swagger UI and Swagger Editor.
    */
  def files(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Application_
  ): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  def files(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Application_,
    /**
    * Options for how the files are served
    */
  options: FilesOptions
  ): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  def files(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Router
  ): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  def files(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Router,
    /**
    * Options for how the files are served
    */
  options: FilesOptions
  ): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  /**
    * Serves the Swagger API file(s) in JSON and YAML formats, so they can be used with third-party front-end tools like Swagger UI and Swagger Editor.
    */
  @JSName("files")
  var files_Original: FilesSignature
  
  /**
    * Annotates the HTTP request (the `req` object) with Swagger metadata.
    * This middleware populates Request.swagger
    */
  def metadata(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  def metadata(router: Application_): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  def metadata(router: Router): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  /**
    * Annotates the HTTP request (the `req` object) with Swagger metadata.
    * This middleware populates Request.swagger
    */
  @JSName("metadata")
  var metadata_Original: MetadataSignature
  
  /**
    * Implements mock behavior for HTTP requests, based on the Swagger API.
    */
  def mock(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  def mock(
    /**
    * Express routing options (e.g. `caseSensitive`, `strict`).
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Unit,
    /**
    * The data store that will be used to persist REST resources.
    * If `router` is an Express Application, then you can set/get the data store
    * using `router.get("mock data store")
    */
  datastore: js.Any
  ): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  def mock(
    /**
    * Express routing options (e.g. `caseSensitive`, `strict`).
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Application_
  ): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  def mock(
    /**
    * Express routing options (e.g. `caseSensitive`, `strict`).
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Application_,
    /**
    * The data store that will be used to persist REST resources.
    * If `router` is an Express Application, then you can set/get the data store
    * using `router.get("mock data store")
    */
  datastore: js.Any
  ): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  def mock(
    /**
    * Express routing options (e.g. `caseSensitive`, `strict`).
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Router
  ): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  def mock(
    /**
    * Express routing options (e.g. `caseSensitive`, `strict`).
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Router,
    /**
    * The data store that will be used to persist REST resources.
    * If `router` is an Express Application, then you can set/get the data store
    * using `router.get("mock data store")
    */
  datastore: js.Any
  ): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  /**
    * Implements mock behavior for HTTP requests, based on the Swagger API.
    */
  @JSName("mock")
  var mock_Original: MockSignature
  
  /**
    * Parses the HTTP request into typed values.
    */
  def parseRequest(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  def parseRequest(/**
    * Options for each of the request-parsing middleware
    */
  options: ParseRequestOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  /**
    * Parses the HTTP request into typed values.
    */
  def parseRequest(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: Application_
  ): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  def parseRequest(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: Application_,
    /**
    * Options for each of the request-parsing middleware
    */
  options: ParseRequestOptions
  ): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  def parseRequest(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: Router
  ): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  def parseRequest(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: Router,
    /**
    * Options for each of the request-parsing middleware
    */
  options: ParseRequestOptions
  ): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  /**
    * Parses the HTTP request into typed values.
    */
  @JSName("parseRequest")
  var parseRequest_Original: ParseRequestSignature
  
  /**
    * Validates the HTTP request against the Swagger API.
    * An error is sent downstream if the request is invalid for any reason.
    */
  def validateRequest(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
}
object SwaggerMiddleware {
  
  @scala.inline
  def apply(
    CORS: () => RequestHandler[ParamsDictionary, js.Any, js.Any, Query],
    files: FilesSignature,
    metadata: /* router */ js.UndefOr[Application_ | Router] => RequestHandler[ParamsDictionary, js.Any, js.Any, Query],
    mock: (/* router */ js.UndefOr[Application_ | Router], /* datastore */ js.UndefOr[js.Any]) => RequestHandler[ParamsDictionary, js.Any, js.Any, Query],
    parseRequest: ParseRequestSignature,
    validateRequest: () => RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
  ): SwaggerMiddleware = {
    val __obj = js.Dynamic.literal(CORS = js.Any.fromFunction0(CORS), files = files.asInstanceOf[js.Any], metadata = js.Any.fromFunction1(metadata), mock = js.Any.fromFunction2(mock), parseRequest = parseRequest.asInstanceOf[js.Any], validateRequest = js.Any.fromFunction0(validateRequest))
    __obj.asInstanceOf[SwaggerMiddleware]
  }
  
  @scala.inline
  implicit class SwaggerMiddlewareMutableBuilder[Self <: SwaggerMiddleware] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCORS(value: () => RequestHandler[ParamsDictionary, js.Any, js.Any, Query]): Self = StObject.set(x, "CORS", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFiles(value: FilesSignature): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(
      value: /* router */ js.UndefOr[Application_ | Router] => RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
    ): Self = StObject.set(x, "metadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMock(
      value: (/* router */ js.UndefOr[Application_ | Router], /* datastore */ js.UndefOr[js.Any]) => RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
    ): Self = StObject.set(x, "mock", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParseRequest(value: ParseRequestSignature): Self = StObject.set(x, "parseRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateRequest(value: () => RequestHandler[ParamsDictionary, js.Any, js.Any, Query]): Self = StObject.set(x, "validateRequest", js.Any.fromFunction0(value))
  }
}
