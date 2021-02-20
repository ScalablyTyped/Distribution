package typings.typedoc

import typings.typedoc.anon.Area
import typings.typedoc.anon.Caption
import typings.typedoc.anon.Code
import typings.typedoc.navigationItemMod.NavigationItem
import typings.typedoc.reflectionsMod.Reflection
import typings.typedoc.rendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputPluginsMod {
  
  @JSImport("typedoc/dist/lib/output/plugins", "AssetsPlugin")
  @js.native
  class AssetsPlugin protected ()
    extends typings.typedoc.assetsPluginMod.AssetsPlugin {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
  }
  
  @JSImport("typedoc/dist/lib/output/plugins", "JavascriptIndexPlugin")
  @js.native
  class JavascriptIndexPlugin protected ()
    extends typings.typedoc.javascriptIndexPluginMod.JavascriptIndexPlugin {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
  }
  
  @JSImport("typedoc/dist/lib/output/plugins", "LayoutPlugin")
  @js.native
  class LayoutPlugin protected ()
    extends typings.typedoc.layoutPluginMod.LayoutPlugin {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
  }
  
  @JSImport("typedoc/dist/lib/output/plugins", "LegendPlugin")
  @js.native
  class LegendPlugin protected ()
    extends typings.typedoc.legendPluginMod.LegendPlugin {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
  }
  
  @JSImport("typedoc/dist/lib/output/plugins", "MarkedLinksPlugin")
  @js.native
  class MarkedLinksPlugin protected ()
    extends typings.typedoc.markedLinksPluginMod.MarkedLinksPlugin {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
  }
  /* static members */
  object MarkedLinksPlugin {
    
    @JSImport("typedoc/dist/lib/output/plugins", "MarkedLinksPlugin.splitLinkText")
    @js.native
    def splitLinkText(text: String): Caption = js.native
  }
  
  @JSImport("typedoc/dist/lib/output/plugins", "MarkedPlugin")
  @js.native
  class MarkedPlugin protected ()
    extends typings.typedoc.markedPluginMod.MarkedPlugin {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
  }
  
  @JSImport("typedoc/dist/lib/output/plugins", "NavigationPlugin")
  @js.native
  class NavigationPlugin protected ()
    extends typings.typedoc.navigationPluginMod.NavigationPlugin {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
  }
  
  @JSImport("typedoc/dist/lib/output/plugins", "PrettyPrintPlugin")
  @js.native
  class PrettyPrintPlugin protected ()
    extends typings.typedoc.prettyPrintPluginMod.PrettyPrintPlugin {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
  }
  /* static members */
  object PrettyPrintPlugin {
    
    @JSImport("typedoc/dist/lib/output/plugins", "PrettyPrintPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/output/plugins", "PrettyPrintPlugin.IGNORED_TAGS")
    @js.native
    def IGNORED_TAGS: Area = js.native
    @scala.inline
    def IGNORED_TAGS_=(x: Area): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IGNORED_TAGS")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/output/plugins", "PrettyPrintPlugin.PRE_TAGS")
    @js.native
    def PRE_TAGS: Code = js.native
    @scala.inline
    def PRE_TAGS_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRE_TAGS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typedoc/dist/lib/output/plugins", "TocPlugin")
  @js.native
  class TocPlugin protected ()
    extends typings.typedoc.tocPluginMod.TocPlugin {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
  }
  /* static members */
  object TocPlugin {
    
    @JSImport("typedoc/dist/lib/output/plugins", "TocPlugin.buildToc")
    @js.native
    def buildToc(model: Reflection, trail: js.Array[Reflection], parent: NavigationItem): Unit = js.native
    @JSImport("typedoc/dist/lib/output/plugins", "TocPlugin.buildToc")
    @js.native
    def buildToc(
      model: Reflection,
      trail: js.Array[Reflection],
      parent: NavigationItem,
      restriction: js.Array[String]
    ): Unit = js.native
  }
}
