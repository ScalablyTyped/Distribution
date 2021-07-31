package typings.typedoc

import typings.typedoc.eventsMod.MarkdownEvent
import typings.typedoc.outputComponentsMod.ContextAwareRendererComponent
import typings.typedoc.rendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markedPluginMod {
  
  @JSImport("typedoc/dist/lib/output/plugins/MarkedPlugin", "MarkedPlugin")
  @js.native
  class MarkedPlugin protected () extends ContextAwareRendererComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
    
    def getHighlighted(text: String): String = js.native
    def getHighlighted(text: String, lang: String): String = js.native
    
    var includePattern: js.Any = js.native
    
    var includeSource: String = js.native
    
    var includes: js.Any = js.native
    
    var mediaDirectory: js.Any = js.native
    
    var mediaPattern: js.Any = js.native
    
    var mediaSource: String = js.native
    
    def onParseMarkdown(event: MarkdownEvent): Unit = js.native
    
    def parseMarkdown(text: String, context: js.Any): String = js.native
  }
}
