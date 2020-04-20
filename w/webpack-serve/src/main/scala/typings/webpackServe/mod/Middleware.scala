package typings.webpackServe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Middleware extends js.Object {
  /** Function to call to add koa-static */
  def content(): Unit
  /** Function to call to add the webpack-dev-middleware */
  def webpack(): Unit
}

object Middleware {
  @scala.inline
  def apply(content: () => Unit, webpack: () => Unit): Middleware = {
    val __obj = js.Dynamic.literal(content = js.Any.fromFunction0(content), webpack = js.Any.fromFunction0(webpack))
    __obj.asInstanceOf[Middleware]
  }
}

