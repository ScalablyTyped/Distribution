package typings.typedoc

import typings.typedoc.distLibOutputComponentsMod.ContextAwareRendererComponent
import typings.typedoc.distLibOutputEventsMod.MarkdownEvent
import typings.typedoc.distLibOutputEventsMod.RendererEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/MarkedLinksPlugin", JSImport.Namespace)
@js.native
object distLibOutputPluginsMarkedLinksPluginMod extends js.Object {
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
    def splitLinkText(text: String): Anon_Caption = js.native
  }
  
}

