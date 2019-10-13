package typings.typedoc

import typings.typedoc.distLibModelsReflectionsMod.Reflection
import typings.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem
import typings.typedoc.distLibOutputRendererMod.Renderer
import typings.typedoc.distLibUtilsComponentMod.AbstractComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/TocPlugin", JSImport.Namespace)
@js.native
object distLibOutputPluginsTocPluginMod extends js.Object {
  @js.native
  class TocPlugin () extends AbstractComponent[Renderer] {
    var onRendererBeginPage: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object TocPlugin extends js.Object {
    def buildToc(model: Reflection, trail: js.Array[Reflection], parent: NavigationItem): Unit = js.native
    def buildToc(
      model: Reflection,
      trail: js.Array[Reflection],
      parent: NavigationItem,
      restriction: js.Array[String]
    ): Unit = js.native
  }
  
}

