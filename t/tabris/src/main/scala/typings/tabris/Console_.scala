package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Console
/**
  * The console object provides access to the [debugging console](../debug.md).
  */
@JSGlobal("Console")
@js.native
class Console_ protected () extends js.Object {
  /**
    * Outputs an error message to the console if the first argument is false.
    * @param expression Any boolean expression. If the assertion is false, the error message is written to the console.
    * @param values A list of JavaScript values to output.
    */
  def assert(expression: Boolean, values: js.Any*): Unit = js.native
  /**
    * Logs the number of times that this particular call to count() has been called.
    * @param label If supplied, count() outputs the number of times it has been called with that label.
    */
  def count(): Unit = js.native
  def count(label: String): Unit = js.native
  /**
    * Resets the counter.
    * @param label If label supplied, this function resets the count associated with that particular label.
    */
  def countReset(): Unit = js.native
  def countReset(label: String): Unit = js.native
  /**
    * Outputs a debug message to the console.
    * @param values A list of JavaScript values to output.
    */
  def debug(values: js.Any*): Unit = js.native
  /**
    * XML tree representation of a given object, if available. Supported types include all widgets and
    * `localStorage`. 
    * *The output is NOT JSX, it is a human-readable summary that displays XML-conforming string
    * representations of some select property values.
    * @param object A JavaScript object
    */
  def dirxml(`object`: js.Any): Unit = js.native
  /**
    * Outputs an error message to the console.
    * @param values A list of JavaScript values to output.
    */
  def error(values: js.Any*): Unit = js.native
  /**
    * Creates a new inline group in the console output. This indents following console messages by an
    * additional spaces, until console.groupEnd() is called.
    * @param values A list of JavaScript values to output.
    */
  def group(values: js.Any*): Unit = js.native
  /**
    * Exits the current inline group in the console.
    */
  def groupEnd(): Unit = js.native
  /**
    * Outputs an info message to the console.
    * @param values A list of JavaScript values to output.
    */
  def info(values: js.Any*): Unit = js.native
  /**
    * Outputs a message to the console.
    * @param values A list of JavaScript values to output
    */
  def log(values: js.Any*): Unit = js.native
  /**
    * Prints a stack trace in a platform-independent format. Framework internals are omitted.
    * Source maps are supported when side-loading code via the tabris CLI.
    */
  def trace(): Unit = js.native
  /**
    * Outputs a warning message to the console.
    * @param values A list of JavaScript values to output.
    */
  def warn(values: js.Any*): Unit = js.native
}

