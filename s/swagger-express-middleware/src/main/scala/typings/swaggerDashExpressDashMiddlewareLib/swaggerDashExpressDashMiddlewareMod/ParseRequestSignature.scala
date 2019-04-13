package typings
package swaggerDashExpressDashMiddlewareLib.swaggerDashExpressDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseRequestSignature extends js.Object {
  def apply(): expressLib.expressMod.RequestHandler = js.native
  def apply(/**
    * Options for each of the request-parsing middleware
    */
  options: ParseRequestOptions): expressLib.expressMod.RequestHandler = js.native
  def apply(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: expressLib.expressMod.Application
  ): expressLib.expressMod.RequestHandler = js.native
  def apply(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: expressLib.expressMod.Application,
    /**
    * Options for each of the request-parsing middleware
    */
  options: ParseRequestOptions
  ): expressLib.expressMod.RequestHandler = js.native
  def apply(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: expressLib.expressMod.Router
  ): expressLib.expressMod.RequestHandler = js.native
  def apply(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: expressLib.expressMod.Router,
    /**
    * Options for each of the request-parsing middleware
    */
  options: ParseRequestOptions
  ): expressLib.expressMod.RequestHandler = js.native
}

