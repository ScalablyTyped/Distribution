package typings.winrtUwp.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents advanced settings that you can use to configure a LoggingChannel object. */
trait LoggingChannelOptions extends js.Object {
  /** Gets or sets the channel group identifier. */
  var group: String
}

object LoggingChannelOptions {
  @scala.inline
  def apply(group: String): LoggingChannelOptions = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingChannelOptions]
  }
}

