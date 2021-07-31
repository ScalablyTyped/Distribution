package typings.typedoc

import typings.typedoc.applicationMod.Application
import typings.typedoc.componentMod.AbstractComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsPluginsMod {
  
  @JSImport("typedoc/dist/lib/utils/plugins", "PluginHost")
  @js.native
  class PluginHost protected () extends AbstractComponent[Application] {
    def this(owner: js.Symbol) = this()
    def this(owner: Application) = this()
    
    var discoverNpmPlugins: js.Any = js.native
    
    def load(): Boolean = js.native
    
    var plugins: js.Array[String] = js.native
    
    var resolvePluginPaths: js.Any = js.native
  }
}
