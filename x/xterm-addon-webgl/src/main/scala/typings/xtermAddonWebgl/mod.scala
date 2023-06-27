package typings.xtermAddonWebgl

import typings.std.HTMLCanvasElement
import typings.xterm.mod.IDisposable
import typings.xterm.mod.ITerminalAddon
import typings.xterm.mod.Terminal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xterm-addon-webgl", "WebglAddon")
  @js.native
  open class WebglAddon ()
    extends StObject
       with ITerminalAddon {
    def this(preserveDrawingBuffer: Boolean) = this()
    
    /**
      * This is called when the addon is activated.
      */
    /* CompleteClass */
    override def activate(terminal: Terminal): Unit = js.native
    
    /**
      * Clears the terminal's texture atlas and triggers a redraw.
      */
    def clearTextureAtlas(): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * An event that is fired when the a new page is added to the texture atlas.
      */
    def onAddTextureAtlasCanvas(listener: js.Function2[/* arg1 */ HTMLCanvasElement, /* arg2 */ Unit, Any]): IDisposable = js.native
    
    /**
      * An event that is fired when the texture atlas of the renderer changes.
      */
    def onChangeTextureAtlas(listener: js.Function2[/* arg1 */ HTMLCanvasElement, /* arg2 */ Unit, Any]): IDisposable = js.native
    
    /**
      * An event that is fired when the renderer loses its canvas context.
      */
    def onContextLoss(listener: js.Function2[/* arg1 */ Unit, /* arg2 */ Unit, Any]): IDisposable = js.native
    
    var textureAtlas: js.UndefOr[HTMLCanvasElement] = js.native
  }
}
