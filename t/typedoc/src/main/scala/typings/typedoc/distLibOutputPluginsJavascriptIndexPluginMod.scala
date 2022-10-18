package typings.typedoc

import typings.typedoc.distLibOutputComponentsMod.RendererComponent
import typings.typedoc.distLibOutputRendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputPluginsJavascriptIndexPluginMod {
  
  @JSImport("typedoc/dist/lib/output/plugins/JavascriptIndexPlugin", "JavascriptIndexPlugin")
  @js.native
  open class JavascriptIndexPlugin protected () extends RendererComponent {
    /**
      * Create new Component instance.
      */
    def this(owner: Renderer) = this()
    
    /* private */ var getCommentSearchText: Any = js.native
    
    /**
      * Triggered after a document has been rendered, just before it is written to disc.
      *
      * @param event  An event object describing the current render operation.
      */
    /* private */ var onRendererBegin: Any = js.native
    
    var searchComments: Boolean = js.native
  }
}
