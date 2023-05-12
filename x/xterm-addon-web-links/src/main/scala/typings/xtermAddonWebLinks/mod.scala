package typings.xtermAddonWebLinks

import typings.std.MouseEvent
import typings.xterm.mod.ITerminalAddon
import typings.xterm.mod.IViewportRange
import typings.xterm.mod.Terminal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xterm-addon-web-links", "WebLinksAddon")
  @js.native
  /**
    * Creates a new web links addon.
    * @param handler The callback when the link is called.
    * @param options Options for the link provider.
    */
  open class WebLinksAddon ()
    extends StObject
       with ITerminalAddon {
    def this(handler: js.Function2[/* event */ MouseEvent, /* uri */ String, Unit]) = this()
    def this(
      handler: js.Function2[/* event */ MouseEvent, /* uri */ String, Unit],
      options: ILinkProviderOptions
    ) = this()
    def this(handler: Unit, options: ILinkProviderOptions) = this()
    
    /**
      * This is called when the addon is activated.
      */
    /* CompleteClass */
    override def activate(terminal: Terminal): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  
  trait ILinkProviderOptions extends StObject {
    
    /**
      * A callback that fires when the mouse hovers over a link.
      */
    var hover: js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* text */ String, /* location */ IViewportRange, Unit]
      ] = js.undefined
    
    /**
      * A callback that fires when the mouse leaves a link. Note that this can
      * happen even when tooltipCallback hasn't fired for the link yet.
      */
    var leave: js.UndefOr[js.Function2[/* event */ MouseEvent, /* text */ String, Unit]] = js.undefined
    
    /**
      * A callback to use instead of the default one.
      */
    var urlRegex: js.UndefOr[js.RegExp] = js.undefined
  }
  object ILinkProviderOptions {
    
    inline def apply(): ILinkProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILinkProviderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILinkProviderOptions] (val x: Self) extends AnyVal {
      
      inline def setHover(value: (/* event */ MouseEvent, /* text */ String, /* location */ IViewportRange) => Unit): Self = StObject.set(x, "hover", js.Any.fromFunction3(value))
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      inline def setLeave(value: (/* event */ MouseEvent, /* text */ String) => Unit): Self = StObject.set(x, "leave", js.Any.fromFunction2(value))
      
      inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
      
      inline def setUrlRegex(value: js.RegExp): Self = StObject.set(x, "urlRegex", value.asInstanceOf[js.Any])
      
      inline def setUrlRegexUndefined: Self = StObject.set(x, "urlRegex", js.undefined)
    }
  }
}
