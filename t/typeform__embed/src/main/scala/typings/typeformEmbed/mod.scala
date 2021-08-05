package typings.typeformEmbed

import typings.std.HTMLElement
import typings.typeformEmbed.typeformEmbedStrings.drawer_left
import typings.typeformEmbed.typeformEmbedStrings.drawer_right
import typings.typeformEmbed.typeformEmbedStrings.exit
import typings.typeformEmbed.typeformEmbedStrings.load
import typings.typeformEmbed.typeformEmbedStrings.popover
import typings.typeformEmbed.typeformEmbedStrings.popup
import typings.typeformEmbed.typeformEmbedStrings.scroll
import typings.typeformEmbed.typeformEmbedStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@typeform/embed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makePopup(url: String): PopupInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("makePopup")(url.asInstanceOf[js.Any]).asInstanceOf[PopupInstance]
  inline def makePopup(url: String, options: PopupOptions): PopupInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("makePopup")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PopupInstance]
  
  inline def makeWidget(element: HTMLElement, url: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("makeWidget")(element.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def makeWidget(element: HTMLElement, url: String, options: WidgetOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("makeWidget")(element.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait OnSubmitEvent extends StObject {
    
    /** ID of the response */
    var response_id: String
  }
  object OnSubmitEvent {
    
    inline def apply(response_id: String): OnSubmitEvent = {
      val __obj = js.Dynamic.literal(response_id = response_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnSubmitEvent]
    }
    
    extension [Self <: OnSubmitEvent](x: Self) {
      
      inline def setResponse_id(value: String): Self = StObject.set(x, "response_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopupInstance extends StObject {
    
    def close(): Unit
    
    def open(): Unit
  }
  object PopupInstance {
    
    inline def apply(close: () => Unit, open: () => Unit): PopupInstance = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open))
      __obj.asInstanceOf[PopupInstance]
    }
    
    extension [Self <: PopupInstance](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    }
  }
  
  trait PopupOptions extends StObject {
    
    var autoClose: js.UndefOr[Double] = js.undefined
    
    /**
      * @deprecated Use `open: 'load'` instead
      */
    var autoOpen: js.UndefOr[Boolean] = js.undefined
    
    var container: js.UndefOr[HTMLElement] = js.undefined
    
    var disableTracking: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated Use `width` instead
      */
    var drawerWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Specify the height of the popup (only applies if using mode "popover")
      */
    var height: js.UndefOr[Double] = js.undefined
    
    var hideFooter: js.UndefOr[Boolean] = js.undefined
    
    var hideHeaders: js.UndefOr[Boolean] = js.undefined
    
    var hideScrollbars: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[popup | drawer_left | drawer_right | popover] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSubmit: js.UndefOr[js.Function1[/* event */ OnSubmitEvent, Unit]] = js.undefined
    
    /**
      * Launch based on behavioral triggers
      */
    var open: js.UndefOr[exit | load | scroll | time] = js.undefined
    
    /**
      * Configuration for behavioral triggers. Based on open:
      *   - `exit`: exit threshold in pixels
      *   - `scroll`: % of page scrolled
      *   - `time`: time in milliseconds
      */
    var openValue: js.UndefOr[Double] = js.undefined
    
    /**
      * Specify the width of the drawer or popup (only applies if using mode
      * "drawer_left" or "drawer_right" or "popover")
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object PopupOptions {
    
    inline def apply(): PopupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupOptions]
    }
    
    extension [Self <: PopupOptions](x: Self) {
      
      inline def setAutoClose(value: Double): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
      
      inline def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDisableTracking(value: Boolean): Self = StObject.set(x, "disableTracking", value.asInstanceOf[js.Any])
      
      inline def setDisableTrackingUndefined: Self = StObject.set(x, "disableTracking", js.undefined)
      
      inline def setDrawerWidth(value: Double): Self = StObject.set(x, "drawerWidth", value.asInstanceOf[js.Any])
      
      inline def setDrawerWidthUndefined: Self = StObject.set(x, "drawerWidth", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHideFooter(value: Boolean): Self = StObject.set(x, "hideFooter", value.asInstanceOf[js.Any])
      
      inline def setHideFooterUndefined: Self = StObject.set(x, "hideFooter", js.undefined)
      
      inline def setHideHeaders(value: Boolean): Self = StObject.set(x, "hideHeaders", value.asInstanceOf[js.Any])
      
      inline def setHideHeadersUndefined: Self = StObject.set(x, "hideHeaders", js.undefined)
      
      inline def setHideScrollbars(value: Boolean): Self = StObject.set(x, "hideScrollbars", value.asInstanceOf[js.Any])
      
      inline def setHideScrollbarsUndefined: Self = StObject.set(x, "hideScrollbars", js.undefined)
      
      inline def setMode(value: popup | drawer_left | drawer_right | popover): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setOnSubmit(value: /* event */ OnSubmitEvent => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOpen(value: exit | load | scroll | time): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOpenValue(value: Double): Self = StObject.set(x, "openValue", value.asInstanceOf[js.Any])
      
      inline def setOpenValueUndefined: Self = StObject.set(x, "openValue", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait WidgetOptions extends StObject {
    
    var buttonText: js.UndefOr[String] = js.undefined
    
    var disableTracking: js.UndefOr[Boolean] = js.undefined
    
    var hideFooter: js.UndefOr[Boolean] = js.undefined
    
    var hideHeaders: js.UndefOr[Boolean] = js.undefined
    
    var hideScrollbars: js.UndefOr[Boolean] = js.undefined
    
    var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSubmit: js.UndefOr[js.Function1[/* event */ OnSubmitEvent, Unit]] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
  }
  object WidgetOptions {
    
    inline def apply(): WidgetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WidgetOptions]
    }
    
    extension [Self <: WidgetOptions](x: Self) {
      
      inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      inline def setDisableTracking(value: Boolean): Self = StObject.set(x, "disableTracking", value.asInstanceOf[js.Any])
      
      inline def setDisableTrackingUndefined: Self = StObject.set(x, "disableTracking", js.undefined)
      
      inline def setHideFooter(value: Boolean): Self = StObject.set(x, "hideFooter", value.asInstanceOf[js.Any])
      
      inline def setHideFooterUndefined: Self = StObject.set(x, "hideFooter", js.undefined)
      
      inline def setHideHeaders(value: Boolean): Self = StObject.set(x, "hideHeaders", value.asInstanceOf[js.Any])
      
      inline def setHideHeadersUndefined: Self = StObject.set(x, "hideHeaders", js.undefined)
      
      inline def setHideScrollbars(value: Boolean): Self = StObject.set(x, "hideScrollbars", value.asInstanceOf[js.Any])
      
      inline def setHideScrollbarsUndefined: Self = StObject.set(x, "hideScrollbars", js.undefined)
      
      inline def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setOnSubmit(value: /* event */ OnSubmitEvent => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
}
