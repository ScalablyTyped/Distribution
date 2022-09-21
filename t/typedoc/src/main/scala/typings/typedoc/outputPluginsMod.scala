package typings.typedoc

import typings.typedoc.rendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputPluginsMod {
  
  @JSImport("typedoc/dist/lib/output/plugins", "AssetsPlugin")
  @js.native
  open class AssetsPlugin protected ()
    extends typings.typedoc.assetsPluginMod.AssetsPlugin {
    /**
      * Create new Component instance.
      */
    def this(owner: Renderer) = this()
  }
  
  @JSImport("typedoc/dist/lib/output/plugins", "JavascriptIndexPlugin")
  @js.native
  open class JavascriptIndexPlugin protected ()
    extends typings.typedoc.javascriptIndexPluginMod.JavascriptIndexPlugin {
    /**
      * Create new Component instance.
      */
    def this(owner: Renderer) = this()
  }
  
  @JSImport("typedoc/dist/lib/output/plugins", "MarkedPlugin")
  @js.native
  open class MarkedPlugin protected ()
    extends typings.typedoc.markedPluginMod.MarkedPlugin {
    /**
      * Create new Component instance.
      */
    def this(owner: Renderer) = this()
  }
}
