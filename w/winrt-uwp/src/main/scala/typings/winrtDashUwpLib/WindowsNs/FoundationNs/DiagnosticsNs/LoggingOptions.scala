package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents advanced event settings. */
@JSGlobal("Windows.Foundation.Diagnostics.LoggingOptions")
@js.native
class LoggingOptions () extends js.Object {
  /**
                   * Initializes a new LoggingOptions instance with the specified keyword value.
                   * @param keywords The keyword value.
                   */
  def this(keywords: scala.Double) = this()
  /** Gets or sets the unique identifier associated with an activity. */
  var activityId: java.lang.String = js.native
  /** Gets or sets the keyword value that represents the different categories that an event belongs to. */
  var keywords: scala.Double = js.native
  /** Gets or sets the operation code value for an event. */
  var opcode: LoggingOpcode = js.native
  /** Gets or sets a value that uniquely identifies the parent activity to which this activity is related. */
  var relatedActivityId: java.lang.String = js.native
  /** Gets or sets the user-defined metadata value attached to an event. */
  var tags: scala.Double = js.native
  /** Gets or sets the user-defined value that identifies a larger unit of work within an application or component. */
  var task: scala.Double = js.native
}

