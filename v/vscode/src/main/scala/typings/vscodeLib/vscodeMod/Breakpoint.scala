package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "Breakpoint")
@js.native
class Breakpoint protected () extends js.Object {
  protected def this(enabled: scala.Boolean) = this()
  protected def this(enabled: scala.Boolean, condition: java.lang.String) = this()
  protected def this(enabled: scala.Boolean, condition: java.lang.String, hitCondition: java.lang.String) = this()
  protected def this(enabled: scala.Boolean, condition: java.lang.String, hitCondition: java.lang.String, logMessage: java.lang.String) = this()
  /**
  		 * An optional expression for conditional breakpoints.
  		 */
  val condition: js.UndefOr[java.lang.String] = js.native
  /**
  		 * Is breakpoint enabled.
  		 */
  val enabled: scala.Boolean = js.native
  /**
  		 * An optional expression that controls how many hits of the breakpoint are ignored.
  		 */
  val hitCondition: js.UndefOr[java.lang.String] = js.native
  /**
  		 * An optional message that gets logged when this breakpoint is hit. Embedded expressions within {} are interpolated by the debug adapter.
  		 */
  val logMessage: js.UndefOr[java.lang.String] = js.native
}

