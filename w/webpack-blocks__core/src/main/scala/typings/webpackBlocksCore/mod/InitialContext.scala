package typings.webpackBlocksCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitialContext extends js.Object {
  var webpack: js.Any
  var webpackVersion: String
}

object InitialContext {
  @scala.inline
  def apply(webpack: js.Any, webpackVersion: String): InitialContext = {
    val __obj = js.Dynamic.literal(webpack = webpack.asInstanceOf[js.Any], webpackVersion = webpackVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialContext]
  }
}

