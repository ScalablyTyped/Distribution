package typings.toastr

import typings.jquery.JQueryMouseEventObject
import typings.toastr.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastrOptions extends StObject {
  
  /**
    * Should a close button be shown?
    * @default undefined
    */
  var closeButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * CSS class the close button will be given.
    * @default toast-close-button
    */
  var closeClass: js.UndefOr[String] = js.undefined
  
  /**
    * Time in milliseconds the toast should take to hide, when the close button is clicked.
    * Falls back to hide configuration.
    * @default false
    */
  var closeDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * The animation easing while hiding the toast, when the close button is clicked.
    * Falls back to hide configuration.
    * swing and linear are built into jQuery.
    * @default false
    */
  var closeEasing: js.UndefOr[String] = js.undefined
  
  /**
    * Html for the close button.
    */
  var closeHtml: js.UndefOr[String] = js.undefined
  
  /**
    * Use the jQuery show/hide method of your choice, when the close button is clicked.
    * Falls back to hide configuration.
    * The methods fadeIn/fadeOut, slideDown/slideUp, and show/hide are built into jQuery.
    * @default false
    */
  var closeMethod: js.UndefOr[String] = js.undefined
  
  /**
    * Set to false so that the toast hides event if hovered.
    * @default true
    */
  var closeOnHover: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Id toast container will be given.
    * @default toast-container
    */
  var containerId: js.UndefOr[String] = js.undefined
  
  /**
    * Should debug details be outputted to the console?
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Should the title and message text be escaped?
    * @default false
    */
  var escapeHtml: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Time in milliseconds the toast should be displayed after leaving mouse over.
    * Set timeOut and extendedTimeOut to 0 to make it sticky.
    * @default 1000
    */
  var extendedTimeOut: js.UndefOr[Double] = js.undefined
  
  /**
    * Time in milliseconds the toast should take to hide.
    * @default 1000
    */
  var hideDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Optionally override the animation easing to show or hide the toasts.
    * swing and linear are built into jQuery.
    * @default swing
    */
  var hideEasing: js.UndefOr[String] = js.undefined
  
  /**
    * Use the jQuery hide method of your choice.
    * The methods fadeIn/fadeOut, slideDown/slideUp, and show/hide are built into jQuery.
    * @default fadeOut
    */
  var hideMethod: js.UndefOr[String] = js.undefined
  
  /**
    * Icon to use for toast.
    * @default toast-info
    */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
    * If specified, you must provide all classes.
    */
  var iconClasses: js.UndefOr[Error] = js.undefined
  
  /**
    * CSS class the message element will be given.
    * @default toast-message
    */
  var messageClass: js.UndefOr[String] = js.undefined
  
  /**
    * Set newest toast to appear on top.
    * @default true
    */
  var newestOnTop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * onCloseClick function callback, fired when the close button is clicked.
    * Closing cannot be prevented by ev.stopPropagation() etc.
    * @default undefined
    */
  var onCloseClick: js.UndefOr[js.Function1[/* ev */ JQueryMouseEventObject, Unit]] = js.undefined
  
  /**
    * onHidden function callback.
    * @default undefined
    */
  var onHidden: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * onShown function callback.
    * @default undefined
    */
  var onShown: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Function to execute on toast click. Closing cannot be prevented by ev.stopPropagation() etc.
    * @default undefined
    */
  var onclick: js.UndefOr[js.Function1[/* ev */ JQueryMouseEventObject, Unit]] = js.undefined
  
  /**
    * Where toast should be displayed.
    * The default stylesheet covers:
    * toast-top-left, toast-top-center, toast-top-right, toast-top-full-width,
    * toast-bottom-left, toast-bottom-center, toast-bottom-right, toast-bottom-full-width
    * @default toast-top-right
    */
  var positionClass: js.UndefOr[String] = js.undefined
  
  /**
    * Rather than having identical toasts stack, set the preventDuplicates property to true.
    * Duplicates are matched to the previous toast based on their message content.
    * @default false
    */
  var preventDuplicates: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Visually indicates how long before a toast expires.
    * @default false
    */
  var progressBar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * CSS class the progressbar element will be given.
    * @default toast-progress
    */
  var progressClass: js.UndefOr[String] = js.undefined
  
  /**
    * Flip the toastr to be displayed properly for right-to-left languages.
    * @default false
    */
  var rtl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Time in milliseconds the toast should take to show.
    * @default 300
    */
  var showDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Optionally override the animation easing to show or hide the toasts.
    * swing and linear are built into jQuery.
    * @default swing
    */
  var showEasing: js.UndefOr[String] = js.undefined
  
  /**
    * Use the jQuery show method of your choice.
    * The methods fadeIn/fadeOut, slideDown/slideUp, and show/hide are built into jQuery.
    * @default fadeIn
    */
  var showMethod: js.UndefOr[String] = js.undefined
  
  /**
    * Should clicking on toast dismiss it?
    * @default true
    */
  var tapToDismiss: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The element to put the toastr container
    * @default body
    */
  var target: js.UndefOr[String] = js.undefined
  
  /**
    * Time in milliseconds that the toast should be displayed.
    * Set timeOut and extendedTimeOut to 0 to make it sticky.
    * @default 5000
    */
  var timeOut: js.UndefOr[Double] = js.undefined
  
  /**
    * CSS class the title element will be given.
    * @default toast-title
    */
  var titleClass: js.UndefOr[String] = js.undefined
  
  /**
    * CSS class the toast element will be given.
    * @default toast
    */
  var toastClass: js.UndefOr[String] = js.undefined
}
object ToastrOptions {
  
  inline def apply(): ToastrOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastrOptions]
  }
  
  extension [Self <: ToastrOptions](x: Self) {
    
    inline def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    inline def setCloseClass(value: String): Self = StObject.set(x, "closeClass", value.asInstanceOf[js.Any])
    
    inline def setCloseClassUndefined: Self = StObject.set(x, "closeClass", js.undefined)
    
    inline def setCloseDuration(value: Double): Self = StObject.set(x, "closeDuration", value.asInstanceOf[js.Any])
    
    inline def setCloseDurationUndefined: Self = StObject.set(x, "closeDuration", js.undefined)
    
    inline def setCloseEasing(value: String): Self = StObject.set(x, "closeEasing", value.asInstanceOf[js.Any])
    
    inline def setCloseEasingUndefined: Self = StObject.set(x, "closeEasing", js.undefined)
    
    inline def setCloseHtml(value: String): Self = StObject.set(x, "closeHtml", value.asInstanceOf[js.Any])
    
    inline def setCloseHtmlUndefined: Self = StObject.set(x, "closeHtml", js.undefined)
    
    inline def setCloseMethod(value: String): Self = StObject.set(x, "closeMethod", value.asInstanceOf[js.Any])
    
    inline def setCloseMethodUndefined: Self = StObject.set(x, "closeMethod", js.undefined)
    
    inline def setCloseOnHover(value: Boolean): Self = StObject.set(x, "closeOnHover", value.asInstanceOf[js.Any])
    
    inline def setCloseOnHoverUndefined: Self = StObject.set(x, "closeOnHover", js.undefined)
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setEscapeHtml(value: Boolean): Self = StObject.set(x, "escapeHtml", value.asInstanceOf[js.Any])
    
    inline def setEscapeHtmlUndefined: Self = StObject.set(x, "escapeHtml", js.undefined)
    
    inline def setExtendedTimeOut(value: Double): Self = StObject.set(x, "extendedTimeOut", value.asInstanceOf[js.Any])
    
    inline def setExtendedTimeOutUndefined: Self = StObject.set(x, "extendedTimeOut", js.undefined)
    
    inline def setHideDuration(value: Double): Self = StObject.set(x, "hideDuration", value.asInstanceOf[js.Any])
    
    inline def setHideDurationUndefined: Self = StObject.set(x, "hideDuration", js.undefined)
    
    inline def setHideEasing(value: String): Self = StObject.set(x, "hideEasing", value.asInstanceOf[js.Any])
    
    inline def setHideEasingUndefined: Self = StObject.set(x, "hideEasing", js.undefined)
    
    inline def setHideMethod(value: String): Self = StObject.set(x, "hideMethod", value.asInstanceOf[js.Any])
    
    inline def setHideMethodUndefined: Self = StObject.set(x, "hideMethod", js.undefined)
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setIconClasses(value: Error): Self = StObject.set(x, "iconClasses", value.asInstanceOf[js.Any])
    
    inline def setIconClassesUndefined: Self = StObject.set(x, "iconClasses", js.undefined)
    
    inline def setMessageClass(value: String): Self = StObject.set(x, "messageClass", value.asInstanceOf[js.Any])
    
    inline def setMessageClassUndefined: Self = StObject.set(x, "messageClass", js.undefined)
    
    inline def setNewestOnTop(value: Boolean): Self = StObject.set(x, "newestOnTop", value.asInstanceOf[js.Any])
    
    inline def setNewestOnTopUndefined: Self = StObject.set(x, "newestOnTop", js.undefined)
    
    inline def setOnCloseClick(value: /* ev */ JQueryMouseEventObject => Unit): Self = StObject.set(x, "onCloseClick", js.Any.fromFunction1(value))
    
    inline def setOnCloseClickUndefined: Self = StObject.set(x, "onCloseClick", js.undefined)
    
    inline def setOnHidden(value: () => Unit): Self = StObject.set(x, "onHidden", js.Any.fromFunction0(value))
    
    inline def setOnHiddenUndefined: Self = StObject.set(x, "onHidden", js.undefined)
    
    inline def setOnShown(value: () => Unit): Self = StObject.set(x, "onShown", js.Any.fromFunction0(value))
    
    inline def setOnShownUndefined: Self = StObject.set(x, "onShown", js.undefined)
    
    inline def setOnclick(value: /* ev */ JQueryMouseEventObject => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
    
    inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    inline def setPositionClass(value: String): Self = StObject.set(x, "positionClass", value.asInstanceOf[js.Any])
    
    inline def setPositionClassUndefined: Self = StObject.set(x, "positionClass", js.undefined)
    
    inline def setPreventDuplicates(value: Boolean): Self = StObject.set(x, "preventDuplicates", value.asInstanceOf[js.Any])
    
    inline def setPreventDuplicatesUndefined: Self = StObject.set(x, "preventDuplicates", js.undefined)
    
    inline def setProgressBar(value: Boolean): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
    
    inline def setProgressBarUndefined: Self = StObject.set(x, "progressBar", js.undefined)
    
    inline def setProgressClass(value: String): Self = StObject.set(x, "progressClass", value.asInstanceOf[js.Any])
    
    inline def setProgressClassUndefined: Self = StObject.set(x, "progressClass", js.undefined)
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    inline def setShowDuration(value: Double): Self = StObject.set(x, "showDuration", value.asInstanceOf[js.Any])
    
    inline def setShowDurationUndefined: Self = StObject.set(x, "showDuration", js.undefined)
    
    inline def setShowEasing(value: String): Self = StObject.set(x, "showEasing", value.asInstanceOf[js.Any])
    
    inline def setShowEasingUndefined: Self = StObject.set(x, "showEasing", js.undefined)
    
    inline def setShowMethod(value: String): Self = StObject.set(x, "showMethod", value.asInstanceOf[js.Any])
    
    inline def setShowMethodUndefined: Self = StObject.set(x, "showMethod", js.undefined)
    
    inline def setTapToDismiss(value: Boolean): Self = StObject.set(x, "tapToDismiss", value.asInstanceOf[js.Any])
    
    inline def setTapToDismissUndefined: Self = StObject.set(x, "tapToDismiss", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTimeOut(value: Double): Self = StObject.set(x, "timeOut", value.asInstanceOf[js.Any])
    
    inline def setTimeOutUndefined: Self = StObject.set(x, "timeOut", js.undefined)
    
    inline def setTitleClass(value: String): Self = StObject.set(x, "titleClass", value.asInstanceOf[js.Any])
    
    inline def setTitleClassUndefined: Self = StObject.set(x, "titleClass", js.undefined)
    
    inline def setToastClass(value: String): Self = StObject.set(x, "toastClass", value.asInstanceOf[js.Any])
    
    inline def setToastClassUndefined: Self = StObject.set(x, "toastClass", js.undefined)
  }
}
