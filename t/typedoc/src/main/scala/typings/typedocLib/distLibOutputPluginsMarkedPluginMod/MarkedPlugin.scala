package typings
package typedocLib.distLibOutputPluginsMarkedPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/MarkedPlugin", "MarkedPlugin")
@js.native
class MarkedPlugin ()
  extends typedocLib.distLibOutputComponentsMod.ContextAwareRendererComponent {
  var includePattern: js.Any = js.native
  var includeSource: java.lang.String = js.native
  var includes: js.UndefOr[js.Any] = js.native
  var mediaDirectory: js.UndefOr[js.Any] = js.native
  var mediaPattern: js.Any = js.native
  var mediaSource: java.lang.String = js.native
  def getHighlighted(text: java.lang.String): java.lang.String = js.native
  def getHighlighted(text: java.lang.String, lang: java.lang.String): java.lang.String = js.native
  def onParseMarkdown(event: typedocLib.distLibOutputEventsMod.MarkdownEvent): scala.Unit = js.native
  def parseMarkdown(text: java.lang.String, context: js.Any): java.lang.String = js.native
}

