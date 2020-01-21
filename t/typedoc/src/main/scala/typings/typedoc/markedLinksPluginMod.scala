package typings.typedoc

import typings.typedoc.eventsMod.MarkdownEvent
import typings.typedoc.eventsMod.RendererEvent
import typings.typedoc.outputComponentsMod.ContextAwareRendererComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/MarkedLinksPlugin", JSImport.Namespace)
@js.native
object markedLinksPluginMod extends js.Object {
  @js.native
  class MarkedLinksPlugin () extends ContextAwareRendererComponent {
    var brackets: js.Any = js.native
    var buildLink: js.Any = js.native
    var inlineTag: js.Any = js.native
    var listInvalidSymbolLinks: Boolean = js.native
    var replaceBrackets: js.Any = js.native
    var replaceInlineTags: js.Any = js.native
    var warnings: js.Any = js.native
    def onEndRenderer(event: RendererEvent): Unit = js.native
    def onParseMarkdown(event: MarkdownEvent): Unit = js.native
  }
  
  /* static members */
  @js.native
  object MarkedLinksPlugin extends js.Object {
    def splitLinkText(text: String): AnonCaption = js.native
  }
  
}

