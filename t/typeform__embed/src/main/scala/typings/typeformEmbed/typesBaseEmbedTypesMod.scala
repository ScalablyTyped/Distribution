package typings.typeformEmbed

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBaseEmbedTypesMod {
  
  trait EmbedPopup
    extends StObject
       with EmbedWidget {
    
    def close(): Unit
    
    def open(): Unit
    
    def toggle(): Unit
  }
  object EmbedPopup {
    
    inline def apply(
      close: () => Unit,
      focus: () => Unit,
      open: () => Unit,
      refresh: () => Unit,
      toggle: () => Unit,
      unmount: () => Unit
    ): EmbedPopup = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), focus = js.Any.fromFunction0(focus), open = js.Any.fromFunction0(open), refresh = js.Any.fromFunction0(refresh), toggle = js.Any.fromFunction0(toggle), unmount = js.Any.fromFunction0(unmount))
      __obj.asInstanceOf[EmbedPopup]
    }
    
    extension [Self <: EmbedPopup](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
      
      inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeformEmbed.typeformEmbedStrings.widget
    - typings.typeformEmbed.typeformEmbedStrings.popup
    - typings.typeformEmbed.typeformEmbedStrings.slider
    - typings.typeformEmbed.typeformEmbedStrings.popover
    - typings.typeformEmbed.typeformEmbedStrings.`side-tab`
  */
  trait EmbedType extends StObject
  object EmbedType {
    
    inline def popover: typings.typeformEmbed.typeformEmbedStrings.popover = "popover".asInstanceOf[typings.typeformEmbed.typeformEmbedStrings.popover]
    
    inline def popup: typings.typeformEmbed.typeformEmbedStrings.popup = "popup".asInstanceOf[typings.typeformEmbed.typeformEmbedStrings.popup]
    
    inline def `side-tab`: typings.typeformEmbed.typeformEmbedStrings.`side-tab` = "side-tab".asInstanceOf[typings.typeformEmbed.typeformEmbedStrings.`side-tab`]
    
    inline def slider: typings.typeformEmbed.typeformEmbedStrings.slider = "slider".asInstanceOf[typings.typeformEmbed.typeformEmbedStrings.slider]
    
    inline def widget: typings.typeformEmbed.typeformEmbedStrings.widget = "widget".asInstanceOf[typings.typeformEmbed.typeformEmbedStrings.widget]
  }
  
  trait EmbedWidget extends StObject {
    
    def focus(): Unit
    
    def refresh(): Unit
    
    def unmount(): Unit
  }
  object EmbedWidget {
    
    inline def apply(focus: () => Unit, refresh: () => Unit, unmount: () => Unit): EmbedWidget = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus), refresh = js.Any.fromFunction0(refresh), unmount = js.Any.fromFunction0(unmount))
      __obj.asInstanceOf[EmbedWidget]
    }
    
    extension [Self <: EmbedWidget](x: Self) {
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
      
      inline def setUnmount(value: () => Unit): Self = StObject.set(x, "unmount", js.Any.fromFunction0(value))
    }
  }
}
