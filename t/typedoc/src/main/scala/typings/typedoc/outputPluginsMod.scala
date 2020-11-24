package typings.typedoc

import typings.typedoc.anon.Area
import typings.typedoc.anon.Caption
import typings.typedoc.anon.Code
import typings.typedoc.navigationItemMod.NavigationItem
import typings.typedoc.reflectionsMod.Reflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/output/plugins", JSImport.Namespace)
@js.native
object outputPluginsMod extends js.Object {
  
  @js.native
  class AssetsPlugin ()
    extends typings.typedoc.assetsPluginMod.AssetsPlugin
  
  @js.native
  class JavascriptIndexPlugin ()
    extends typings.typedoc.javascriptIndexPluginMod.JavascriptIndexPlugin
  
  @js.native
  class LayoutPlugin ()
    extends typings.typedoc.layoutPluginMod.LayoutPlugin
  
  @js.native
  class LegendPlugin ()
    extends typings.typedoc.legendPluginMod.LegendPlugin
  
  @js.native
  class MarkedLinksPlugin ()
    extends typings.typedoc.markedLinksPluginMod.MarkedLinksPlugin
  /* static members */
  @js.native
  object MarkedLinksPlugin extends js.Object {
    
    def splitLinkText(text: String): Caption = js.native
  }
  
  @js.native
  class MarkedPlugin ()
    extends typings.typedoc.markedPluginMod.MarkedPlugin
  
  @js.native
  class NavigationPlugin ()
    extends typings.typedoc.navigationPluginMod.NavigationPlugin
  
  @js.native
  class PrettyPrintPlugin ()
    extends typings.typedoc.prettyPrintPluginMod.PrettyPrintPlugin
  /* static members */
  @js.native
  object PrettyPrintPlugin extends js.Object {
    
    var IGNORED_TAGS: Area = js.native
    
    var PRE_TAGS: Code = js.native
  }
  
  @js.native
  class TocPlugin ()
    extends typings.typedoc.tocPluginMod.TocPlugin
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
