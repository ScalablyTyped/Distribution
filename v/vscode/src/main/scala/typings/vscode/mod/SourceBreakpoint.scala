package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "SourceBreakpoint")
@js.native
class SourceBreakpoint protected () extends Breakpoint {
  /**
    * Create a new breakpoint for a source location.
    */
  def this(location: Location) = this()
  def this(location: Location, enabled: Boolean) = this()
  def this(location: Location, enabled: Boolean, condition: String) = this()
  def this(location: Location, enabled: Unit, condition: String) = this()
  def this(location: Location, enabled: Boolean, condition: String, hitCondition: String) = this()
  def this(location: Location, enabled: Boolean, condition: Unit, hitCondition: String) = this()
  def this(location: Location, enabled: Unit, condition: String, hitCondition: String) = this()
  def this(location: Location, enabled: Unit, condition: Unit, hitCondition: String) = this()
  def this(location: Location, enabled: Boolean, condition: String, hitCondition: String, logMessage: String) = this()
  def this(location: Location, enabled: Boolean, condition: String, hitCondition: Unit, logMessage: String) = this()
  def this(location: Location, enabled: Boolean, condition: Unit, hitCondition: String, logMessage: String) = this()
  def this(location: Location, enabled: Boolean, condition: Unit, hitCondition: Unit, logMessage: String) = this()
  def this(location: Location, enabled: Unit, condition: String, hitCondition: String, logMessage: String) = this()
  def this(location: Location, enabled: Unit, condition: String, hitCondition: Unit, logMessage: String) = this()
  def this(location: Location, enabled: Unit, condition: Unit, hitCondition: String, logMessage: String) = this()
  def this(location: Location, enabled: Unit, condition: Unit, hitCondition: Unit, logMessage: String) = this()
  
  /**
    * The source and line position of this breakpoint.
    */
  val location: Location = js.native
}
