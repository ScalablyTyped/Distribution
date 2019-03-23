package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "SourceBreakpoint")
@js.native
class SourceBreakpoint protected () extends Breakpoint {
  /**
  		 * Create a new breakpoint for a source location.
  		 */
  def this(location: Location) = this()
  def this(location: Location, enabled: scala.Boolean) = this()
  def this(location: Location, enabled: scala.Boolean, condition: java.lang.String) = this()
  def this(location: Location, enabled: scala.Boolean, condition: java.lang.String, hitCondition: java.lang.String) = this()
  def this(location: Location, enabled: scala.Boolean, condition: java.lang.String, hitCondition: java.lang.String, logMessage: java.lang.String) = this()
  /**
  		 * The source and line position of this breakpoint.
  		 */
  val location: Location = js.native
}

