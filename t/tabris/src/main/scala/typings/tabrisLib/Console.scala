package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Console
/**
  * The console object provides access to the debugging console
  */
@JSGlobal("Console")
@js.native
class Console protected () extends js.Object {
  /**
    * Outputs a debug message to the console.
    * @param message A JavaScript string containing zero or more substitution strings.
    * @param substitutions JavaScript objects with which to replace substitution strings within message
    */
  def debug(): scala.Unit = js.native
  def debug(message: java.lang.String, substitutions: js.Any*): scala.Unit = js.native
  /**
    * Outputs a debug message to the console.
    * @param objects A list of JavaScript objects to output. The string representations of each of these objects are appended together in the order listed and output.
    */
  def debug(objects: js.Any*): scala.Unit = js.native
  /**
    * Outputs an error message to the console.
    * @param message A JavaScript string containing zero or more substitution strings.
    * @param substitutions JavaScript objects with which to replace substitution strings within message
    */
  def error(): scala.Unit = js.native
  def error(message: java.lang.String, substitutions: js.Any*): scala.Unit = js.native
  /**
    * Outputs an error message to the console.
    * @param objects A list of JavaScript objects to output. The string representations of each of these objects are appended together in the order listed and output.
    */
  def error(objects: js.Any*): scala.Unit = js.native
  /**
    * Outputs an info message to the console.
    * @param message A JavaScript string containing zero or more substitution strings.
    * @param substitutions JavaScript objects with which to replace substitution strings within message
    */
  def info(): scala.Unit = js.native
  def info(message: java.lang.String, substitutions: js.Any*): scala.Unit = js.native
  /**
    * Outputs an info message to the console.
    * @param objects A list of JavaScript objects to output. The string representations of each of these objects are appended together in the order listed and output.
    */
  def info(objects: js.Any*): scala.Unit = js.native
  /**
    * Outputs a message to the console.
    * @param message A JavaScript string containing zero or more substitution strings.
    * @param substitutions JavaScript objects with which to replace substitution strings within message
    */
  def log(): scala.Unit = js.native
  def log(message: java.lang.String, substitutions: js.Any*): scala.Unit = js.native
  /**
    * Outputs a message to the console.
    * @param objects A list of JavaScript objects to output. The string representations of each of these objects are appended together in the order listed and output.
    */
  def log(objects: js.Any*): scala.Unit = js.native
  /**
    * Outputs a warning message to the console.
    * @param message A JavaScript string containing zero or more substitution strings.
    * @param substitutions JavaScript objects with which to replace substitution strings within message
    */
  def warn(): scala.Unit = js.native
  def warn(message: java.lang.String, substitutions: js.Any*): scala.Unit = js.native
  /**
    * Outputs a warning message to the console.
    * @param objects A list of JavaScript objects to output. The string representations of each of these objects are appended together in the order listed and output.
    */
  def warn(objects: js.Any*): scala.Unit = js.native
}

