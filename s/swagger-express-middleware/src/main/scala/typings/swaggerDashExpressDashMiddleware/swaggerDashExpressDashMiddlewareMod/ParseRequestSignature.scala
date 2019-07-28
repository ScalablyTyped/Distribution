package typings.swaggerDashExpressDashMiddleware.swaggerDashExpressDashMiddlewareMod

import typings.express.expressMod.Application
import typings.express.expressMod.RequestHandler
import typings.express.expressMod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseRequestSignature extends js.Object {
  def apply(): RequestHandler = js.native
  def apply(/**
    * Options for each of the request-parsing middleware
    */
  options: ParseRequestOptions): RequestHandler = js.native
  def apply(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: Application
  ): RequestHandler = js.native
  def apply(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: Application,
    /**
    * Options for each of the request-parsing middleware
    */
  options: ParseRequestOptions
  ): RequestHandler = js.native
  def apply(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: Router
  ): RequestHandler = js.native
  def apply(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: Router,
    /**
    * Options for each of the request-parsing middleware
    */
  options: ParseRequestOptions
  ): RequestHandler = js.native
}

