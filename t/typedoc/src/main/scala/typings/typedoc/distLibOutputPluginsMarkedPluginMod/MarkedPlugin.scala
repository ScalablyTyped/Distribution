package typings.typedoc.distLibOutputPluginsMarkedPluginMod

import typings.typedoc.distLibOutputComponentsMod.ContextAwareRendererComponent
import typings.typedoc.distLibOutputEventsMod.MarkdownEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/MarkedPlugin", "MarkedPlugin")
@js.native
class MarkedPlugin () extends ContextAwareRendererComponent {
  var includePattern: js.Any = js.native
  var includeSource: String = js.native
  var includes: js.UndefOr[js.Any] = js.native
  var mediaDirectory: js.UndefOr[js.Any] = js.native
  var mediaPattern: js.Any = js.native
  var mediaSource: String = js.native
  def getHighlighted(text: String): String = js.native
  def getHighlighted(text: String, lang: String): String = js.native
  def onParseMarkdown(event: MarkdownEvent): Unit = js.native
  def parseMarkdown(text: String, context: js.Any): String = js.native
}

