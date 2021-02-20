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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@typeform/embed", "makePopup")
  @js.native
  def makePopup(url: String): PopupInstance = js.native
  @JSImport("@typeform/embed", "makePopup")
  @js.native
  def makePopup(url: String, options: PopupOptions): PopupInstance = js.native
  
  @JSImport("@typeform/embed", "makeWidget")
  @js.native
  def makeWidget(element: HTMLElement, url: String): Unit = js.native
  @JSImport("@typeform/embed", "makeWidget")
  @js.native
  def makeWidget(element: HTMLElement, url: String, options: WidgetOptions): Unit = js.native
  
  @js.native
  trait OnSubmitEvent extends StObject {
    
    /** ID of the response */
    var response_id: String = js.native
  }
  object OnSubmitEvent {
    
    @scala.inline
    def apply(response_id: String): OnSubmitEvent = {
      val __obj = js.Dynamic.literal(response_id = response_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnSubmitEvent]
    }
    
    @scala.inline
    implicit class OnSubmitEventMutableBuilder[Self <: OnSubmitEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponse_id(value: String): Self = StObject.set(x, "response_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PopupInstance extends StObject {
    
    def close(): Unit = js.native
    
    def open(): Unit = js.native
  }
  object PopupInstance {
    
    @scala.inline
    def apply(close: () => Unit, open: () => Unit): PopupInstance = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open))
      __obj.asInstanceOf[PopupInstance]
    }
    
    @scala.inline
    implicit class PopupInstanceMutableBuilder[Self <: PopupInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait PopupOptions extends StObject {
    
    var autoClose: js.UndefOr[Double] = js.native
    
    /**
      * @deprecated Use `open: 'load'` instead
      */
    var autoOpen: js.UndefOr[Boolean] = js.native
    
    var container: js.UndefOr[HTMLElement] = js.native
    
    var disableTracking: js.UndefOr[Boolean] = js.native
    
    /**
      * @deprecated Use `width` instead
      */
    var drawerWidth: js.UndefOr[Double] = js.native
    
    /**
      * Specify the height of the popup (only applies if using mode "popover")
      */
    var height: js.UndefOr[Double] = js.native
    
    var hideFooter: js.UndefOr[Boolean] = js.native
    
    var hideHeaders: js.UndefOr[Boolean] = js.native
    
    var hideScrollbars: js.UndefOr[Boolean] = js.native
    
    var mode: js.UndefOr[popup | drawer_left | drawer_right | popover] = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onReady: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onSubmit: js.UndefOr[js.Function1[/* event */ OnSubmitEvent, Unit]] = js.native
    
    /**
      * Launch based on behavioral triggers
      */
    var open: js.UndefOr[exit | load | scroll | time] = js.native
    
    /**
      * Configuration for behavioral triggers. Based on open:
      *   - `exit`: exit threshold in pixels
      *   - `scroll`: % of page scrolled
      *   - `time`: time in milliseconds
      */
    var openValue: js.UndefOr[Double] = js.native
    
    /**
      * Specify the width of the drawer or popup (only applies if using mode
      * "drawer_left" or "drawer_right" or "popover")
      */
    var width: js.UndefOr[Double] = js.native
  }
  object PopupOptions {
    
    @scala.inline
    def apply(): PopupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupOptions]
    }
    
    @scala.inline
    implicit class PopupOptionsMutableBuilder[Self <: PopupOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoClose(value: Double): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      @scala.inline
      def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
      
      @scala.inline
      def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setDisableTracking(value: Boolean): Self = StObject.set(x, "disableTracking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableTrackingUndefined: Self = StObject.set(x, "disableTracking", js.undefined)
      
      @scala.inline
      def setDrawerWidth(value: Double): Self = StObject.set(x, "drawerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerWidthUndefined: Self = StObject.set(x, "drawerWidth", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHideFooter(value: Boolean): Self = StObject.set(x, "hideFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideFooterUndefined: Self = StObject.set(x, "hideFooter", js.undefined)
      
      @scala.inline
      def setHideHeaders(value: Boolean): Self = StObject.set(x, "hideHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideHeadersUndefined: Self = StObject.set(x, "hideHeaders", js.undefined)
      
      @scala.inline
      def setHideScrollbars(value: Boolean): Self = StObject.set(x, "hideScrollbars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideScrollbarsUndefined: Self = StObject.set(x, "hideScrollbars", js.undefined)
      
      @scala.inline
      def setMode(value: popup | drawer_left | drawer_right | popover): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: /* event */ OnSubmitEvent => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOpen(value: exit | load | scroll | time): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOpenValue(value: Double): Self = StObject.set(x, "openValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenValueUndefined: Self = StObject.set(x, "openValue", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait WidgetOptions extends StObject {
    
    var buttonText: js.UndefOr[String] = js.native
    
    var disableTracking: js.UndefOr[Boolean] = js.native
    
    var hideFooter: js.UndefOr[Boolean] = js.native
    
    var hideHeaders: js.UndefOr[Boolean] = js.native
    
    var hideScrollbars: js.UndefOr[Boolean] = js.native
    
    var onReady: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onSubmit: js.UndefOr[js.Function1[/* event */ OnSubmitEvent, Unit]] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
  }
  object WidgetOptions {
    
    @scala.inline
    def apply(): WidgetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WidgetOptions]
    }
    
    @scala.inline
    implicit class WidgetOptionsMutableBuilder[Self <: WidgetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      @scala.inline
      def setDisableTracking(value: Boolean): Self = StObject.set(x, "disableTracking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableTrackingUndefined: Self = StObject.set(x, "disableTracking", js.undefined)
      
      @scala.inline
      def setHideFooter(value: Boolean): Self = StObject.set(x, "hideFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideFooterUndefined: Self = StObject.set(x, "hideFooter", js.undefined)
      
      @scala.inline
      def setHideHeaders(value: Boolean): Self = StObject.set(x, "hideHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideHeadersUndefined: Self = StObject.set(x, "hideHeaders", js.undefined)
      
      @scala.inline
      def setHideScrollbars(value: Boolean): Self = StObject.set(x, "hideScrollbars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideScrollbarsUndefined: Self = StObject.set(x, "hideScrollbars", js.undefined)
      
      @scala.inline
      def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: /* event */ OnSubmitEvent => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
}
