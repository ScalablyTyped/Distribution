package typings.typedoc

import typings.typedoc.anon.Area
import typings.typedoc.anon.Code
import typings.typedoc.eventsMod.PageEvent
import typings.typedoc.outputComponentsMod.RendererComponent
import typings.typedoc.rendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prettyPrintPluginMod {
  
  @JSImport("typedoc/dist/lib/output/plugins/PrettyPrintPlugin", "PrettyPrintPlugin")
  @js.native
  class PrettyPrintPlugin protected () extends RendererComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
    
    def onRendererEndPage(event: PageEvent): Unit = js.native
  }
  /* static members */
  object PrettyPrintPlugin {
    
    @JSImport("typedoc/dist/lib/output/plugins/PrettyPrintPlugin", "PrettyPrintPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/output/plugins/PrettyPrintPlugin", "PrettyPrintPlugin.IGNORED_TAGS")
    @js.native
    def IGNORED_TAGS: Area = js.native
    inline def IGNORED_TAGS_=(x: Area): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IGNORED_TAGS")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/output/plugins/PrettyPrintPlugin", "PrettyPrintPlugin.PRE_TAGS")
    @js.native
    def PRE_TAGS: Code = js.native
    inline def PRE_TAGS_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRE_TAGS")(x.asInstanceOf[js.Any])
  }
}
