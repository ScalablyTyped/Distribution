package typings.swaggerDashExpressDashMiddleware.swaggerDashExpressDashMiddlewareMod

import typings.express.expressMod.Application
import typings.express.expressMod.RequestHandler
import typings.express.expressMod.Router
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
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
  def CORS(): RequestHandler[ParamsDictionary] = js.native
  /**
    * Serves the Swagger API file(s) in JSON and YAML formats, so they can be used with third-party front-end tools like Swagger UI and Swagger Editor.
    */
  def files(): RequestHandler[ParamsDictionary] = js.native
  def files(/**
    * Options for how the files are served
    */
  options: FilesOptions): RequestHandler[ParamsDictionary] = js.native
  /**
    * Serves the Swagger API file(s) in JSON and YAML formats, so they can be used with third-party front-end tools like Swagger UI and Swagger Editor.
    */
  def files(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Application
  ): RequestHandler[ParamsDictionary] = js.native
  def files(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Application,
    /**
    * Options for how the files are served
    */
  options: FilesOptions
  ): RequestHandler[ParamsDictionary] = js.native
  def files(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Router
  ): RequestHandler[ParamsDictionary] = js.native
  def files(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Router,
    /**
    * Options for how the files are served
    */
  options: FilesOptions
  ): RequestHandler[ParamsDictionary] = js.native
  /**
    * Annotates the HTTP request (the `req` object) with Swagger metadata.
    * This middleware populates Request.swagger
    */
  def metadata(): RequestHandler[ParamsDictionary] = js.native
  def metadata(router: Application): RequestHandler[ParamsDictionary] = js.native
  def metadata(router: Router): RequestHandler[ParamsDictionary] = js.native
  /**
    * Implements mock behavior for HTTP requests, based on the Swagger API.
    */
  def mock(): RequestHandler[ParamsDictionary] = js.native
  def mock(
    /**
    * Express routing options (e.g. `caseSensitive`, `strict`).
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Application
  ): RequestHandler[ParamsDictionary] = js.native
  def mock(
    /**
    * Express routing options (e.g. `caseSensitive`, `strict`).
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Application,
    /**
    * The data store that will be used to persist REST resources.
    * If `router` is an Express Application, then you can set/get the data store
    * using `router.get("mock data store")
    */
  datastore: js.Any
  ): RequestHandler[ParamsDictionary] = js.native
  def mock(
    /**
    * Express routing options (e.g. `caseSensitive`, `strict`).
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Router
  ): RequestHandler[ParamsDictionary] = js.native
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
  ): RequestHandler[ParamsDictionary] = js.native
  /**
    * Parses the HTTP request into typed values.
    */
  def parseRequest(): RequestHandler[ParamsDictionary] = js.native
  def parseRequest(/**
    * Options for each of the request-parsing middleware
    */
  options: ParseRequestOptions): RequestHandler[ParamsDictionary] = js.native
  /**
    * Parses the HTTP request into typed values.
    */
  def parseRequest(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: Application
  ): RequestHandler[ParamsDictionary] = js.native
  def parseRequest(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: Application,
    /**
    * Options for each of the request-parsing middleware
    */
  options: ParseRequestOptions
  ): RequestHandler[ParamsDictionary] = js.native
  def parseRequest(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: Router
  ): RequestHandler[ParamsDictionary] = js.native
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
  ): RequestHandler[ParamsDictionary] = js.native
  /**
    * Validates the HTTP request against the Swagger API.
    * An error is sent downstream if the request is invalid for any reason.
    */
  def validateRequest(): RequestHandler[ParamsDictionary] = js.native
}

