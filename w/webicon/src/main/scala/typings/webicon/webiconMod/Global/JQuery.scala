package typings.webicon.webiconMod.Global

import typings.webicon.systemConfigMod.Config
import typings.webicon.systemConfigurationHandlerMod.ConfigurationHandler
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
  def webicons(config: Config): this.type = js.native
  def webicons(config: ConfigurationHandler): this.type = js.native
}

