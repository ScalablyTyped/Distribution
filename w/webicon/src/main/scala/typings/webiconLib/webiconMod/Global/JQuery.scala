package typings
package webiconLib.webiconMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery[TElement] extends js.Object {
  /**
    * Initializes the web-icons.
    *
    * @param config
    * Either the configuration for initializing web-icons or a callback for configuring the web-icons.
    */
  def webicons(config: webiconLib.systemConfigMod.Config): this.type = js.native
  def webicons(config: webiconLib.systemConfigurationHandlerMod.ConfigurationHandler): this.type = js.native
}

