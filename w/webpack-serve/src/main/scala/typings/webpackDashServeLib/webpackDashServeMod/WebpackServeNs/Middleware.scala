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

object Middleware {
  @scala.inline
  def apply(content: js.Function0[scala.Unit], webpack: js.Function0[scala.Unit]): Middleware = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("webpack")(webpack)
    __obj.asInstanceOf[Middleware]
  }
}

