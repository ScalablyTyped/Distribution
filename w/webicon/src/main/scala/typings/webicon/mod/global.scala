package typings.webicon.mod

import typings.webicon.configMod.Config
import typings.webicon.configurationHandlerMod.ConfigurationHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
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
}
