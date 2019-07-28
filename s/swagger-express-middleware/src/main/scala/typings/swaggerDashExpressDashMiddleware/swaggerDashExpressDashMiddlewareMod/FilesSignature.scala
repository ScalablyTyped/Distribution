package typings.swaggerDashExpressDashMiddleware.swaggerDashExpressDashMiddlewareMod

import typings.express.expressMod.Application
import typings.express.expressMod.RequestHandler
import typings.express.expressMod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesSignature extends js.Object {
  def apply(): RequestHandler = js.native
  def apply(/**
    * Options for how the files are served
    */
  options: FilesOptions): RequestHandler = js.native
  def apply(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Application
  ): RequestHandler = js.native
  def apply(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Application,
    /**
    * Options for how the files are served
    */
  options: FilesOptions
  ): RequestHandler = js.native
  def apply(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Router
  ): RequestHandler = js.native
  def apply(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Router,
    /**
    * Options for how the files are served
    */
  options: FilesOptions
  ): RequestHandler = js.native
}

