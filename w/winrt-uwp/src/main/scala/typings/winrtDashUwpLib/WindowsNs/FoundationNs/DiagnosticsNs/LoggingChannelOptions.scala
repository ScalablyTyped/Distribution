package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents advanced settings that you can use to configure a LoggingChannel object. */
@JSGlobal("Windows.Foundation.Diagnostics.LoggingChannelOptions")
@js.native
class LoggingChannelOptions () extends js.Object {
  /**
                   * Creates a LoggingChannelOptions object with all properties set to default values except for the specified group.
                   * @param group The group identifier.
                   */
  def this(group: java.lang.String) = this()
  /** Gets or sets the channel group identifier. */
  var group: java.lang.String = js.native
}

