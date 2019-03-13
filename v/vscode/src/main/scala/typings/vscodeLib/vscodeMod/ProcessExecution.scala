package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "ProcessExecution")
@js.native
class ProcessExecution protected () extends js.Object {
  /**
  		 * Creates a process execution.
  		 *
  		 * @param process The process to start.
  		 * @param options Optional options for the started process.
  		 */
  def this(process: java.lang.String) = this()
  /**
  		 * Creates a process execution.
  		 *
  		 * @param process The process to start.
  		 * @param args Arguments to be passed to the process.
  		 * @param options Optional options for the started process.
  		 */
  def this(process: java.lang.String, args: js.Array[java.lang.String]) = this()
  def this(process: java.lang.String, options: ProcessExecutionOptions) = this()
  def this(process: java.lang.String, args: js.Array[java.lang.String], options: ProcessExecutionOptions) = this()
  /**
  		 * The arguments passed to the process. Defaults to an empty array.
  		 */
  var args: js.Array[java.lang.String] = js.native
  /**
  		 * The process options used when the process is executed.
  		 * Defaults to undefined.
  		 */
  var options: js.UndefOr[ProcessExecutionOptions] = js.native
  /**
  		 * The process to be executed.
  		 */
  var process: java.lang.String = js.native
}

