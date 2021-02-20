package typings.typedoc

import typings.typedoc.outputComponentsMod.RendererComponent
import typings.typedoc.rendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutPluginMod {
  
  @JSImport("typedoc/dist/lib/output/plugins/LayoutPlugin", "LayoutPlugin")
  @js.native
  class LayoutPlugin protected () extends RendererComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
    
    var onRendererEndPage: js.Any = js.native
  }
}
