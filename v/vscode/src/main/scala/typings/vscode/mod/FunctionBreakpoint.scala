package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "FunctionBreakpoint")
@js.native
class FunctionBreakpoint protected () extends Breakpoint {
  /**
    * Create a new function breakpoint.
    */
  def this(functionName: String) = this()
  def this(functionName: String, enabled: Boolean) = this()
  def this(functionName: String, enabled: Boolean, condition: String) = this()
  def this(functionName: String, enabled: Unit, condition: String) = this()
  def this(functionName: String, enabled: Boolean, condition: String, hitCondition: String) = this()
  def this(functionName: String, enabled: Boolean, condition: Unit, hitCondition: String) = this()
  def this(functionName: String, enabled: Unit, condition: String, hitCondition: String) = this()
  def this(functionName: String, enabled: Unit, condition: Unit, hitCondition: String) = this()
  def this(
    functionName: String,
    enabled: Boolean,
    condition: String,
    hitCondition: String,
    logMessage: String
  ) = this()
  def this(functionName: String, enabled: Boolean, condition: String, hitCondition: Unit, logMessage: String) = this()
  def this(functionName: String, enabled: Boolean, condition: Unit, hitCondition: String, logMessage: String) = this()
  def this(functionName: String, enabled: Boolean, condition: Unit, hitCondition: Unit, logMessage: String) = this()
  def this(functionName: String, enabled: Unit, condition: String, hitCondition: String, logMessage: String) = this()
  def this(functionName: String, enabled: Unit, condition: String, hitCondition: Unit, logMessage: String) = this()
  def this(functionName: String, enabled: Unit, condition: Unit, hitCondition: String, logMessage: String) = this()
  def this(functionName: String, enabled: Unit, condition: Unit, hitCondition: Unit, logMessage: String) = this()
  
  /**
    * The name of the function to which this breakpoint is attached.
    */
  val functionName: String = js.native
}
