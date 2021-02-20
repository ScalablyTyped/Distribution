package typings.webicon

import typings.webicon.configMod.Config
import typings.webicon.configurationHandlerMod.ConfigurationHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    @js.native
    trait JQuery[TElement] extends StObject {
      
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
}
