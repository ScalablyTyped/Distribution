package typings
package swaggerDashExpressDashMiddlewareLib.swaggerDashExpressDashMiddlewareMod.sNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseRequestSignature extends js.Object {
  def apply(): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(/**
    * Options for each of the request-parsing middleware
    */
  options: ParseRequestOptions): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: expressLib.expressMod.eNs.Application
  ): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: expressLib.expressMod.eNs.Application,
    /**
    * Options for each of the request-parsing middleware
    */
  options: ParseRequestOptions
  ): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: expressLib.expressMod.eNs.Router
  ): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: expressLib.expressMod.eNs.Router,
    /**
    * Options for each of the request-parsing middleware
    */
  options: ParseRequestOptions
  ): expressLib.expressMod.eNs.RequestHandler = js.native
}

