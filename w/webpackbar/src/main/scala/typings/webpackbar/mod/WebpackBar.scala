package typings.webpackbar.mod

import typings.webpack.mod.ProgressPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Elegant ProgressBar and Profiler for Webpack
  */
@js.native
trait WebpackBar extends ProgressPlugin {
  val state: Status = js.native
}

