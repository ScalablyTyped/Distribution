package typings.webpackFailPlugin

import typings.webpack.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-fail-plugin", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Webpack plugin that will make the process return status code 1 when it finishes with errors in single-run mode.
    */
  def apply(): Plugin = js.native
}

