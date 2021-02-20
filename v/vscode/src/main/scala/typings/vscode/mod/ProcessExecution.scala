package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "ProcessExecution")
@js.native
class ProcessExecution protected () extends StObject {
  /**
    * Creates a process execution.
    *
    * @param process The process to start.
    * @param options Optional options for the started process.
    */
  def this(process: String) = this()
  /**
    * Creates a process execution.
    *
    * @param process The process to start.
    * @param args Arguments to be passed to the process.
    * @param options Optional options for the started process.
    */
  def this(process: String, args: js.Array[String]) = this()
  def this(process: String, options: ProcessExecutionOptions) = this()
  def this(process: String, args: js.Array[String], options: ProcessExecutionOptions) = this()
  
  /**
    * The arguments passed to the process. Defaults to an empty array.
    */
  var args: js.Array[String] = js.native
  
  /**
    * The process options used when the process is executed.
    * Defaults to undefined.
    */
  var options: js.UndefOr[ProcessExecutionOptions] = js.native
  
  /**
    * The process to be executed.
    */
  var process: String = js.native
}
