package typings
package webpackDashServeLib.webpackDashServeMod.WebpackServeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Middleware extends js.Object {
  /** Function to call to add koa-static */
  def content(): scala.Unit
  /** Function to call to add the webpack-dev-middleware */
  def webpack(): scala.Unit
}

