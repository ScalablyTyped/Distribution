package typings
package webpackDashServeLib.webpackDashServeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Middleware extends js.Object {
  /** Function to call to add koa-static */
  def content(): scala.Unit
  /** Function to call to add the webpack-dev-middleware */
  def webpack(): scala.Unit
}

object Middleware {
  @scala.inline
  def apply(content: () => scala.Unit, webpack: () => scala.Unit): Middleware = {
    val __obj = js.Dynamic.literal(content = js.Any.fromFunction0(content), webpack = js.Any.fromFunction0(webpack))
  
    __obj.asInstanceOf[Middleware]
  }
}

