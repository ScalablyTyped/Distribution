package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "Breakpoint")
@js.native
class Breakpoint protected () extends js.Object {
  protected def this(enabled: Boolean) = this()
  protected def this(enabled: Boolean, condition: String) = this()
  protected def this(enabled: Boolean, condition: String, hitCondition: String) = this()
  protected def this(enabled: Boolean, condition: String, hitCondition: String, logMessage: String) = this()
  /**
  		 * An optional expression for conditional breakpoints.
  		 */
  val condition: js.UndefOr[String] = js.native
  /**
  		 * Is breakpoint enabled.
  		 */
  val enabled: Boolean = js.native
  /**
  		 * An optional expression that controls how many hits of the breakpoint are ignored.
  		 */
  val hitCondition: js.UndefOr[String] = js.native
  /**
  		 * The unique ID of the breakpoint.
  		 */
  val id: String = js.native
  /**
  		 * An optional message that gets logged when this breakpoint is hit. Embedded expressions within {} are interpolated by the debug adapter.
  		 */
  val logMessage: js.UndefOr[String] = js.native
}

