package typings.typedoc.distLibOutputPluginsPrettyPrintPluginMod

import typings.typedoc.Anon_Area
import typings.typedoc.Anon_Code
import typings.typedoc.distLibOutputComponentsMod.RendererComponent
import typings.typedoc.distLibOutputEventsMod.PageEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/PrettyPrintPlugin", "PrettyPrintPlugin")
@js.native
class PrettyPrintPlugin () extends RendererComponent {
  def onRendererEndPage(event: PageEvent): Unit = js.native
}

/* static members */
@JSImport("typedoc/dist/lib/output/plugins/PrettyPrintPlugin", "PrettyPrintPlugin")
@js.native
object PrettyPrintPlugin extends js.Object {
  var IGNORED_TAGS: Anon_Area = js.native
  var PRE_TAGS: Anon_Code = js.native
}

