package typings.typedoc

import typings.typedoc.anon.Caption
import typings.typedoc.eventsMod.MarkdownEvent
import typings.typedoc.eventsMod.RendererEvent
import typings.typedoc.outputComponentsMod.ContextAwareRendererComponent
import typings.typedoc.rendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markedLinksPluginMod {
  
  @JSImport("typedoc/dist/lib/output/plugins/MarkedLinksPlugin", "MarkedLinksPlugin")
  @js.native
  class MarkedLinksPlugin protected () extends ContextAwareRendererComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
    
    var brackets: js.Any = js.native
    
    var buildLink: js.Any = js.native
    
    var inlineTag: js.Any = js.native
    
    var listInvalidSymbolLinks: Boolean = js.native
    
    def onEndRenderer(event: RendererEvent): Unit = js.native
    
    def onParseMarkdown(event: MarkdownEvent): Unit = js.native
    
    var replaceBrackets: js.Any = js.native
    
    var replaceInlineTags: js.Any = js.native
    
    var warnings: js.Any = js.native
  }
  /* static members */
  object MarkedLinksPlugin {
    
    @JSImport("typedoc/dist/lib/output/plugins/MarkedLinksPlugin", "MarkedLinksPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def splitLinkText(text: String): Caption = ^.asInstanceOf[js.Dynamic].applyDynamic("splitLinkText")(text.asInstanceOf[js.Any]).asInstanceOf[Caption]
  }
}
