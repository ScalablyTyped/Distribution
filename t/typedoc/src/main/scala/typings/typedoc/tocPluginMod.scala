package typings.typedoc

import typings.typedoc.navigationItemMod.NavigationItem
import typings.typedoc.outputComponentsMod.RendererComponent
import typings.typedoc.reflectionsMod.Reflection
import typings.typedoc.rendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tocPluginMod {
  
  @JSImport("typedoc/dist/lib/output/plugins/TocPlugin", "TocPlugin")
  @js.native
  class TocPlugin protected () extends RendererComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
    
    var onRendererBeginPage: js.Any = js.native
  }
  /* static members */
  object TocPlugin {
    
    @JSImport("typedoc/dist/lib/output/plugins/TocPlugin", "TocPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def buildToc(model: Reflection, trail: js.Array[Reflection], parent: NavigationItem): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("buildToc")(model.asInstanceOf[js.Any], trail.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def buildToc(
      model: Reflection,
      trail: js.Array[Reflection],
      parent: NavigationItem,
      restriction: js.Array[String]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("buildToc")(model.asInstanceOf[js.Any], trail.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], restriction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
