package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "FunctionBreakpoint")
@js.native
class FunctionBreakpoint protected () extends Breakpoint {
  /**
  		 * Create a new function breakpoint.
  		 */
  def this(functionName: java.lang.String) = this()
  def this(functionName: java.lang.String, enabled: scala.Boolean) = this()
  def this(functionName: java.lang.String, enabled: scala.Boolean, condition: java.lang.String) = this()
  def this(functionName: java.lang.String, enabled: scala.Boolean, condition: java.lang.String, hitCondition: java.lang.String) = this()
  def this(functionName: java.lang.String, enabled: scala.Boolean, condition: java.lang.String, hitCondition: java.lang.String, logMessage: java.lang.String) = this()
  /**
  		 * The name of the function to which this breakpoint is attached.
  		 */
  val functionName: java.lang.String = js.native
}

