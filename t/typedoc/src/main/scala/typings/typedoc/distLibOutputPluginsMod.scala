package typings.typedoc

import typings.typedoc.distLibModelsReflectionsMod.Reflection
import typings.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins", JSImport.Namespace)
@js.native
object distLibOutputPluginsMod extends js.Object {
  @js.native
  class AssetsPlugin ()
    extends typings.typedoc.distLibOutputPluginsAssetsPluginMod.AssetsPlugin
  
  @js.native
  class JavascriptIndexPlugin ()
    extends typings.typedoc.distLibOutputPluginsJavascriptIndexPluginMod.JavascriptIndexPlugin
  
  @js.native
  class LayoutPlugin ()
    extends typings.typedoc.distLibOutputPluginsLayoutPluginMod.LayoutPlugin
  
  @js.native
  class MarkedLinksPlugin ()
    extends typings.typedoc.distLibOutputPluginsMarkedLinksPluginMod.MarkedLinksPlugin
  
  @js.native
  class MarkedPlugin ()
    extends typings.typedoc.distLibOutputPluginsMarkedPluginMod.MarkedPlugin
  
  @js.native
  class NavigationPlugin ()
    extends typings.typedoc.distLibOutputPluginsNavigationPluginMod.NavigationPlugin
  
  @js.native
  class PrettyPrintPlugin ()
    extends typings.typedoc.distLibOutputPluginsPrettyPrintPluginMod.PrettyPrintPlugin
  
  @js.native
  class TocPlugin ()
    extends typings.typedoc.distLibOutputPluginsTocPluginMod.TocPlugin
  
  /* static members */
  @js.native
  object MarkedLinksPlugin extends js.Object {
    def splitLinkText(text: String): Anon_Caption = js.native
  }
  
  /* static members */
  @js.native
  object PrettyPrintPlugin extends js.Object {
    var IGNORED_TAGS: Anon_Area = js.native
    var PRE_TAGS: Anon_Code = js.native
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

