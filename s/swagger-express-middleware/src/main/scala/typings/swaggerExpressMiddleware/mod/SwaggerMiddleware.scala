package typings.swaggerExpressMiddleware.mod

import typings.express.mod.Application_
import typings.express.mod.RequestHandler
import typings.express.mod.Router
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwaggerMiddleware extends js.Object {
  /**
    * Handles CORS preflight requests and sets CORS headers for all requests according the Swagger API definition.
    */
  @JSName("CORS")
  var CORS_Original: CORSSignature = js.native
  /**
    * Serves the Swagger API file(s) in JSON and YAML formats, so they can be used with third-party front-end tools like Swagger UI and Swagger Editor.
    */
  @JSName("files")
  var files_Original: FilesSignature = js.native
  /**
    * Annotates the HTTP request (the `req` object) with Swagger metadata.
    * This middleware populates Request.swagger
    */
  @JSName("metadata")
  var metadata_Original: MetadataSignature = js.native
  /**
    * Implements mock behavior for HTTP requests, based on the Swagger API.
    */
  @JSName("mock")
  var mock_Original: MockSignature = js.native
  /**
    * Parses the HTTP request into typed values.
    */
  @JSName("parseRequest")
  var parseRequest_Original: ParseRequestSignature = js.native
  /**
    * Handles CORS preflight requests and sets CORS headers for all requests according the Swagger API definition.
    */
  def CORS(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  /**
    * Serves the Swagger API file(s) in JSON and YAML formats, so they can be used with third-party front-end tools like Swagger UI and Swagger Editor.
    */
  def files(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def files(/**
    * Options for how the files are served
    */
  options: FilesOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  /**
    * Serves the Swagger API file(s) in JSON and YAML formats, so they can be used with third-party front-end tools like Swagger UI and Swagger Editor.
    */
  def files(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Application_
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def files(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Application_,
    /**
    * Options for how the files are served
    */
  options: FilesOptions
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def files(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Router
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def files(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Router,
    /**
    * Options for how the files are served
    */
  options: FilesOptions
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  /**
    * Annotates the HTTP request (the `req` object) with Swagger metadata.
    * This middleware populates Request.swagger
    */
  def metadata(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def metadata(router: Application_): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def metadata(router: Router): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  /**
    * Implements mock behavior for HTTP requests, based on the Swagger API.
    */
  def mock(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def mock(
    /**
    * Express routing options (e.g. `caseSensitive`, `strict`).
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: js.UndefOr[scala.Nothing],
    /**
    * The data store that will be used to persist REST resources.
    * If `router` is an Express Application, then you can set/get the data store
    * using `router.get("mock data store")
    */
  datastore: js.Any
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def mock(
    /**
    * Express routing options (e.g. `caseSensitive`, `strict`).
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Application_
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
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
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def mock(
    /**
    * Express routing options (e.g. `caseSensitive`, `strict`).
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Router
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
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
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  /**
    * Parses the HTTP request into typed values.
    */
  def parseRequest(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def parseRequest(/**
    * Options for each of the request-parsing middleware
    */
  options: ParseRequestOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  /**
    * Parses the HTTP request into typed values.
    */
  def parseRequest(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: Application_
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
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
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def parseRequest(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: Router
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
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
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  /**
    * Validates the HTTP request against the Swagger API.
    * An error is sent downstream if the request is invalid for any reason.
    */
  def validateRequest(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

