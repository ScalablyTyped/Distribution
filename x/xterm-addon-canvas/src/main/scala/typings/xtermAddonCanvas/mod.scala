package typings.xtermAddonCanvas

import typings.std.HTMLCanvasElement
import typings.xterm.mod.IDisposable
import typings.xterm.mod.ITerminalAddon
import typings.xterm.mod.Terminal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xterm-addon-canvas", "CanvasAddon")
  @js.native
  open class CanvasAddon ()
    extends StObject
       with ITerminalAddon {
    
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
    
    var textureAtlas: js.UndefOr[HTMLCanvasElement] = js.native
  }
}
