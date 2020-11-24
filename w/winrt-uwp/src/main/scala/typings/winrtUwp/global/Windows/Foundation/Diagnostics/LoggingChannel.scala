package typings.winrtUwp.global.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a source of log messages. */
@JSGlobal("Windows.Foundation.Diagnostics.LoggingChannel")
@js.native
class LoggingChannel protected ()
  extends typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingChannel {
  /**
    * This constructor creates a LoggingChannel in Windows 8.1 compatibility mode.
    * @param name The name of the logging channel.
    */
  def this(name: String) = this()
  /**
    * Initializes a new instance of the LoggingChannel class with the specified options.
    * @param name The name of the logging channel.
    * @param options The channel options. Pass null to specify the default options.
    */
  def this(name: String, options: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingChannelOptions) = this()
  /**
    * Initializes a new instance of the LoggingChannel class with the specified options and channel ID.
    * @param name The name of the logging channel.
    * @param options The channel options. Pass null to specify the default options.
    * @param id The channel identifier to use instead of the automatically generated identifier.
    */
  def this(
    name: String,
    options: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingChannelOptions,
    id: String
  ) = this()
}
