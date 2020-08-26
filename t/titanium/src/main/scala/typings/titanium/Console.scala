package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Console logging facilities.
  */
@js.native
trait Console extends js.Object {
  /**
    * Log a message at the `debug` level.
    */
  def debug(message: js.Any*): Unit = js.native
  /**
    * Log a message at the `error` level.
    */
  def error(message: js.Any*): Unit = js.native
  /**
    * Log a message at the `info` level.
    */
  def info(message: js.Any*): Unit = js.native
  /**
    * Log a message at the `info` level.
    */
  def log(message: js.Any*): Unit = js.native
  /**
    * Start a timer to track duration of an operation.
    */
  def time(): Unit = js.native
  def time(label: java.lang.String): Unit = js.native
  /**
    * Stop a timer that was previously started.
    */
  def timeEnd(): Unit = js.native
  def timeEnd(label: java.lang.String): Unit = js.native
  def timeLog(label: js.UndefOr[scala.Nothing], data: js.Any*): Unit = js.native
  /**
    * Log duration taken so far for an operation.
    */
  def timeLog(label: java.lang.String, data: js.Any*): Unit = js.native
  /**
    * Log a message at the `warn` level.
    */
  def warn(message: js.Any*): Unit = js.native
}

