package typings.titanium.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// This needs to be global to avoid TS2403 in case lib.dom.d.ts is present in the same build
/**
  * Console logging facilities.
  */
@js.native
trait Console_ extends js.Object {
  
  def assert(value: js.UndefOr[scala.Nothing], message: js.Any*): Unit = js.native
  /**
    * A simple assertion test that verifies whether value is truthy. If it is not, Assertion failed is logged. If provided, the error message is formatted using `util.format()` by passing along all message arguments. The output is used as the error message.
    */
  def assert(value: js.Any, message: js.Any*): Unit = js.native
  
  /**
    * Maintains an internal counter specific to `label` and outputs to stdout the number of times `console.count()` has been called with the given `label`.
    */
  def count(): Unit = js.native
  def count(label: String): Unit = js.native
  
  /**
    * Resets the internal counter specific to `label`.
    */
  def countReset(): Unit = js.native
  def countReset(label: String): Unit = js.native
  
  /**
    * Log a message at the `debug` level.
    */
  def debug(message: js.Any*): Unit = js.native
  
  /**
    * Log a message at the `error` level.
    */
  def error(message: js.Any*): Unit = js.native
  
  /**
    * Increases indentation of subsequent lines by spaces for `groupIndentation` length.
    */
  def group(label: js.Any*): Unit = js.native
  
  /**
    * Alias for `group()`
    */
  def groupCollapsed(label: js.Any*): Unit = js.native
  
  /**
    * Decreases indentation of subsequent lines by spaces for `groupIndentation` length.
    */
  def groupEnd(): Unit = js.native
  
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
  def time(label: String): Unit = js.native
  
  /**
    * Stop a timer that was previously started.
    */
  def timeEnd(): Unit = js.native
  def timeEnd(label: String): Unit = js.native
  
  def timeLog(label: js.UndefOr[scala.Nothing], data: js.Any*): Unit = js.native
  /**
    * Log duration taken so far for an operation.
    */
  def timeLog(label: String, data: js.Any*): Unit = js.native
  
  /**
    * Log a message at the `trace` level.
    */
  def trace(message: js.Any*): Unit = js.native
  
  /**
    * Log a message at the `warn` level.
    */
  def warn(message: js.Any*): Unit = js.native
}
