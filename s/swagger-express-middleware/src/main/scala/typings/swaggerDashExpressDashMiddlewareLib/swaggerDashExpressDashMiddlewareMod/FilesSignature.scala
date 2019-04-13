package typings
package swaggerDashExpressDashMiddlewareLib.swaggerDashExpressDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesSignature extends js.Object {
  def apply(): expressLib.expressMod.RequestHandler = js.native
  def apply(/**
    * Options for how the files are served
    */
  options: FilesOptions): expressLib.expressMod.RequestHandler = js.native
  def apply(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: expressLib.expressMod.Application
  ): expressLib.expressMod.RequestHandler = js.native
  def apply(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: expressLib.expressMod.Application,
    /**
    * Options for how the files are served
    */
  options: FilesOptions
  ): expressLib.expressMod.RequestHandler = js.native
  def apply(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: expressLib.expressMod.Router
  ): expressLib.expressMod.RequestHandler = js.native
  def apply(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: expressLib.expressMod.Router,
    /**
    * Options for how the files are served
    */
  options: FilesOptions
  ): expressLib.expressMod.RequestHandler = js.native
}

