package typings.typedoc

import typings.typedoc.distLibOutputEventsMod.PageEvent
import typings.typedoc.distLibOutputRendererMod.Renderer
import typings.typedoc.distLibUtilsComponentMod.AbstractComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/PrettyPrintPlugin", JSImport.Namespace)
@js.native
object distLibOutputPluginsPrettyPrintPluginMod extends js.Object {
  @js.native
  class PrettyPrintPlugin () extends AbstractComponent[Renderer] {
    def onRendererEndPage(event: PageEvent): Unit = js.native
  }
  
  /* static members */
  @js.native
  object PrettyPrintPlugin extends js.Object {
    var IGNORED_TAGS: Anon_Area = js.native
    var PRE_TAGS: Anon_Code = js.native
  }
  
}

