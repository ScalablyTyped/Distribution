package typings
package typedocLib.distLibOutputPluginsMarkedLinksPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/MarkedLinksPlugin", "MarkedLinksPlugin")
@js.native
class MarkedLinksPlugin ()
  extends typedocLib.distLibOutputComponentsMod.ContextAwareRendererComponent {
  var brackets: js.Any = js.native
  var buildLink: js.Any = js.native
  var inlineTag: js.Any = js.native
  var listInvalidSymbolLinks: scala.Boolean = js.native
  var replaceBrackets: js.Any = js.native
  var replaceInlineTags: js.Any = js.native
  var warnings: js.Any = js.native
  def onEndRenderer(event: typedocLib.distLibOutputEventsMod.RendererEvent): scala.Unit = js.native
  def onParseMarkdown(event: typedocLib.distLibOutputEventsMod.MarkdownEvent): scala.Unit = js.native
}

@JSImport("typedoc/dist/lib/output/plugins/MarkedLinksPlugin", "MarkedLinksPlugin")
@js.native
object MarkedLinksPlugin extends js.Object {
  def splitLinkText(text: java.lang.String): typedocLib.Anon_Caption = js.native
}

