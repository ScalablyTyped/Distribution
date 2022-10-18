package typings.typedoc

import typings.typedoc.distLibOutputComponentsMod.RendererComponent
import typings.typedoc.distLibOutputRendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputPluginsAssetsPluginMod {
  
  @JSImport("typedoc/dist/lib/output/plugins/AssetsPlugin", "AssetsPlugin")
  @js.native
  open class AssetsPlugin protected () extends RendererComponent {
    /**
      * Create new Component instance.
      */
    def this(owner: Renderer) = this()
    
    /** @internal */
    var customCss: String = js.native
    
    /**
      * Triggered before the renderer starts rendering a project.
      *
      * @param event  An event object describing the current render operation.
      */
    /* private */ var onRenderEnd: Any = js.native
  }
}
