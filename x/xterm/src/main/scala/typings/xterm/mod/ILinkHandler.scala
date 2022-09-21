package typings.xterm.mod

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A link handler for OSC 8 hyperlinks.
  */
trait ILinkHandler extends StObject {
  
  /**
    * Calls when the link is activated.
    * @param event The mouse event triggering the callback.
    * @param text The text of the link.
    * @param range The buffer range of the link.
    */
  def activate(event: MouseEvent, text: String, range: IBufferRange): Unit
  
  /**
    * Called when the mouse hovers the link. To use this to create a DOM-based hover tooltip,
    * create the hover element within `Terminal.element` and add the `xterm-hover` class to it,
    * that will cause mouse events to not fall through and activate other links.
    * @param event The mouse event triggering the callback.
    * @param text The text of the link.
    * @param range The buffer range of the link.
    */
  var hover: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* text */ String, /* range */ IBufferRange, Unit]
  ] = js.undefined
  
  /**
    * Called when the mouse leaves the link.
    * @param event The mouse event triggering the callback.
    * @param text The text of the link.
    * @param range The buffer range of the link.
    */
  var leave: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* text */ String, /* range */ IBufferRange, Unit]
  ] = js.undefined
}
object ILinkHandler {
  
  inline def apply(activate: (MouseEvent, String, IBufferRange) => Unit): ILinkHandler = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction3(activate))
    __obj.asInstanceOf[ILinkHandler]
  }
  
  extension [Self <: ILinkHandler](x: Self) {
    
    inline def setActivate(value: (MouseEvent, String, IBufferRange) => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction3(value))
    
    inline def setHover(value: (/* event */ MouseEvent, /* text */ String, /* range */ IBufferRange) => Unit): Self = StObject.set(x, "hover", js.Any.fromFunction3(value))
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setLeave(value: (/* event */ MouseEvent, /* text */ String, /* range */ IBufferRange) => Unit): Self = StObject.set(x, "leave", js.Any.fromFunction3(value))
    
    inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
  }
}
