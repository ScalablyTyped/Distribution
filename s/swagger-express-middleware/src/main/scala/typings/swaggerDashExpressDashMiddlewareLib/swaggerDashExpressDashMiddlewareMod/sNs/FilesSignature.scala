package typings
package swaggerDashExpressDashMiddlewareLib.swaggerDashExpressDashMiddlewareMod.sNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesSignature extends js.Object {
  def apply(): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(/**
    * Options for how the files are served
    */
  options: FilesOptions): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: expressLib.expressMod.eNs.Application
  ): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: expressLib.expressMod.eNs.Application,
    /**
    * Options for how the files are served
    */
  options: FilesOptions
  ): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: expressLib.expressMod.eNs.Router
  ): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: expressLib.expressMod.eNs.Router,
    /**
    * Options for how the files are served
    */
  options: FilesOptions
  ): expressLib.expressMod.eNs.RequestHandler = js.native
}

