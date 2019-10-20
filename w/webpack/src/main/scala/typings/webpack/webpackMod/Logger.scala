package typings.webpack.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://webpack.js.org/api/logging/
  * @since 4.39.0
  */
@js.native
trait Logger extends js.Object {
  def clear(): Unit = js.native
  def debug(): Unit = js.native
  def debug(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def error(): Unit = js.native
  def error(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def group(label: js.Any*): Unit = js.native
  def groupCollapsed(label: js.Any*): Unit = js.native
  def groupEnd(): Unit = js.native
  def info(): Unit = js.native
  def info(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def log(): Unit = js.native
  def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def profile(): Unit = js.native
  def profile(label: String): Unit = js.native
  def profileEnd(): Unit = js.native
  def profileEnd(label: String): Unit = js.native
  def status(): Unit = js.native
  def status(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def trace(): Unit = js.native
  def trace(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def warn(): Unit = js.native
  def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
}

