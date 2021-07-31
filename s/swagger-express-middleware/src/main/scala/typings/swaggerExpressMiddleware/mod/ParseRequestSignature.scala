package typings.swaggerExpressMiddleware.mod

import typings.express.mod.Application_
import typings.express.mod.RequestHandler
import typings.express.mod.Router
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseRequestSignature extends StObject {
  
  def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
  def apply(/**
    * Options for each of the request-parsing middleware
    */
  options: ParseRequestOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
  def apply(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: Application_
  ): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
  def apply(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: Application_,
    /**
    * Options for each of the request-parsing middleware
    */
  options: ParseRequestOptions
  ): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
  def apply(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: Router
  ): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
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
  ): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
}
