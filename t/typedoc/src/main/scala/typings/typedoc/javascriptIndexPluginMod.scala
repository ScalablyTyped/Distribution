package typings.typedoc

import typings.typedoc.outputComponentsMod.RendererComponent
import typings.typedoc.rendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object javascriptIndexPluginMod {
  
  @JSImport("typedoc/dist/lib/output/plugins/JavascriptIndexPlugin", "JavascriptIndexPlugin")
  @js.native
  class JavascriptIndexPlugin protected () extends RendererComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
    
    var onRendererBegin: js.Any = js.native
  }
}
