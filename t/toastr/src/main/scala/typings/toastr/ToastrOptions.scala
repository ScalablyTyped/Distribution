package typings.toastr

import typings.jquery.JQueryMouseEventObject
import typings.toastr.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastrOptions extends StObject {
  
  /**
    * Should a close button be shown?
    * @default undefined
    */
  var closeButton: js.UndefOr[Boolean] = js.native
  
  /**
    * CSS class the close button will be given.
    * @default toast-close-button
    */
  var closeClass: js.UndefOr[String] = js.native
  
  /**
    * Time in milliseconds the toast should take to hide, when the close button is clicked.
    * Falls back to hide configuration.
    * @default false
    */
  var closeDuration: js.UndefOr[Double] = js.native
  
  /**
    * The animation easing while hiding the toast, when the close button is clicked.
    * Falls back to hide configuration.
    * swing and linear are built into jQuery.
    * @default false
    */
  var closeEasing: js.UndefOr[String] = js.native
  
  /**
    * Html for the close button.
    */
  var closeHtml: js.UndefOr[String] = js.native
  
  /**
    * Use the jQuery show/hide method of your choice, when the close button is clicked.
    * Falls back to hide configuration.
    * The methods fadeIn/fadeOut, slideDown/slideUp, and show/hide are built into jQuery.
    * @default false
    */
  var closeMethod: js.UndefOr[String] = js.native
  
  /**
    * Set to false so that the toast hides event if hovered.
    * @default true
    */
  var closeOnHover: js.UndefOr[Boolean] = js.native
  
  /**
    * Id toast container will be given.
    * @default toast-container
    */
  var containerId: js.UndefOr[String] = js.native
  
  /**
    * Should debug details be outputted to the console?
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
    * Should the title and message text be escaped?
    * @default false
    */
  var escapeHtml: js.UndefOr[Boolean] = js.native
  
  /**
    * Time in milliseconds the toast should be displayed after leaving mouse over.
    * Set timeOut and extendedTimeOut to 0 to make it sticky.
    * @default 1000
    */
  var extendedTimeOut: js.UndefOr[Double] = js.native
  
  /**
    * Time in milliseconds the toast should take to hide.
    * @default 1000
    */
  var hideDuration: js.UndefOr[Double] = js.native
  
  /**
    * Optionally override the animation easing to show or hide the toasts.
    * swing and linear are built into jQuery.
    * @default swing
    */
  var hideEasing: js.UndefOr[String] = js.native
  
  /**
    * Use the jQuery hide method of your choice.
    * The methods fadeIn/fadeOut, slideDown/slideUp, and show/hide are built into jQuery.
    * @default fadeOut
    */
  var hideMethod: js.UndefOr[String] = js.native
  
  /**
    * Icon to use for toast.
    * @default toast-info
    */
  var iconClass: js.UndefOr[String] = js.native
  
  /**
    * If specified, you must provide all classes.
    */
  var iconClasses: js.UndefOr[Error] = js.native
  
  /**
    * CSS class the message element will be given.
    * @default toast-message
    */
  var messageClass: js.UndefOr[String] = js.native
  
  /**
    * Set newest toast to appear on top.
    * @default true
    */
  var newestOnTop: js.UndefOr[Boolean] = js.native
  
  /**
    * onCloseClick function callback, fired when the close button is clicked.
    * Closing cannot be prevented by ev.stopPropagation() etc.
    * @default undefined
    */
  var onCloseClick: js.UndefOr[js.Function1[/* ev */ JQueryMouseEventObject, Unit]] = js.native
  
  /**
    * onHidden function callback.
    * @default undefined
    */
  var onHidden: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * onShown function callback.
    * @default undefined
    */
  var onShown: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Function to execute on toast click. Closing cannot be prevented by ev.stopPropagation() etc.
    * @default undefined
    */
  var onclick: js.UndefOr[js.Function1[/* ev */ JQueryMouseEventObject, Unit]] = js.native
  
  /**
    * Where toast should be displayed.
    * The default stylesheet covers:
    * toast-top-left, toast-top-center, toast-top-right, toast-top-full-width,
    * toast-bottom-left, toast-bottom-center, toast-bottom-right, toast-bottom-full-width
    * @default toast-top-right
    */
  var positionClass: js.UndefOr[String] = js.native
  
  /**
    * Rather than having identical toasts stack, set the preventDuplicates property to true.
    * Duplicates are matched to the previous toast based on their message content.
    * @default false
    */
  var preventDuplicates: js.UndefOr[Boolean] = js.native
  
  /**
    * Visually indicates how long before a toast expires.
    * @default false
    */
  var progressBar: js.UndefOr[Boolean] = js.native
  
  /**
    * CSS class the progressbar element will be given.
    * @default toast-progress
    */
  var progressClass: js.UndefOr[String] = js.native
  
  /**
    * Flip the toastr to be displayed properly for right-to-left languages.
    * @default false
    */
  var rtl: js.UndefOr[Boolean] = js.native
  
  /**
    * Time in milliseconds the toast should take to show.
    * @default 300
    */
  var showDuration: js.UndefOr[Double] = js.native
  
  /**
    * Optionally override the animation easing to show or hide the toasts.
    * swing and linear are built into jQuery.
    * @default swing
    */
  var showEasing: js.UndefOr[String] = js.native
  
  /**
    * Use the jQuery show method of your choice.
    * The methods fadeIn/fadeOut, slideDown/slideUp, and show/hide are built into jQuery.
    * @default fadeIn
    */
  var showMethod: js.UndefOr[String] = js.native
  
  /**
    * Should clicking on toast dismiss it?
    * @default true
    */
  var tapToDismiss: js.UndefOr[Boolean] = js.native
  
  /**
    * The element to put the toastr container
    * @default body
    */
  var target: js.UndefOr[String] = js.native
  
  /**
    * Time in milliseconds that the toast should be displayed.
    * Set timeOut and extendedTimeOut to 0 to make it sticky.
    * @default 5000
    */
  var timeOut: js.UndefOr[Double] = js.native
  
  /**
    * CSS class the title element will be given.
    * @default toast-title
    */
  var titleClass: js.UndefOr[String] = js.native
  
  /**
    * CSS class the toast element will be given.
    * @default toast
    */
  var toastClass: js.UndefOr[String] = js.native
}
object ToastrOptions {
  
  @scala.inline
  def apply(): ToastrOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastrOptions]
  }
  
  @scala.inline
  implicit class ToastrOptionsMutableBuilder[Self <: ToastrOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    @scala.inline
    def setCloseClass(value: String): Self = StObject.set(x, "closeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseClassUndefined: Self = StObject.set(x, "closeClass", js.undefined)
    
    @scala.inline
    def setCloseDuration(value: Double): Self = StObject.set(x, "closeDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseDurationUndefined: Self = StObject.set(x, "closeDuration", js.undefined)
    
    @scala.inline
    def setCloseEasing(value: String): Self = StObject.set(x, "closeEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseEasingUndefined: Self = StObject.set(x, "closeEasing", js.undefined)
    
    @scala.inline
    def setCloseHtml(value: String): Self = StObject.set(x, "closeHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseHtmlUndefined: Self = StObject.set(x, "closeHtml", js.undefined)
    
    @scala.inline
    def setCloseMethod(value: String): Self = StObject.set(x, "closeMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseMethodUndefined: Self = StObject.set(x, "closeMethod", js.undefined)
    
    @scala.inline
    def setCloseOnHover(value: Boolean): Self = StObject.set(x, "closeOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnHoverUndefined: Self = StObject.set(x, "closeOnHover", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setEscapeHtml(value: Boolean): Self = StObject.set(x, "escapeHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscapeHtmlUndefined: Self = StObject.set(x, "escapeHtml", js.undefined)
    
    @scala.inline
    def setExtendedTimeOut(value: Double): Self = StObject.set(x, "extendedTimeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedTimeOutUndefined: Self = StObject.set(x, "extendedTimeOut", js.undefined)
    
    @scala.inline
    def setHideDuration(value: Double): Self = StObject.set(x, "hideDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDurationUndefined: Self = StObject.set(x, "hideDuration", js.undefined)
    
    @scala.inline
    def setHideEasing(value: String): Self = StObject.set(x, "hideEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideEasingUndefined: Self = StObject.set(x, "hideEasing", js.undefined)
    
    @scala.inline
    def setHideMethod(value: String): Self = StObject.set(x, "hideMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideMethodUndefined: Self = StObject.set(x, "hideMethod", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setIconClasses(value: Error): Self = StObject.set(x, "iconClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassesUndefined: Self = StObject.set(x, "iconClasses", js.undefined)
    
    @scala.inline
    def setMessageClass(value: String): Self = StObject.set(x, "messageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageClassUndefined: Self = StObject.set(x, "messageClass", js.undefined)
    
    @scala.inline
    def setNewestOnTop(value: Boolean): Self = StObject.set(x, "newestOnTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewestOnTopUndefined: Self = StObject.set(x, "newestOnTop", js.undefined)
    
    @scala.inline
    def setOnCloseClick(value: /* ev */ JQueryMouseEventObject => Unit): Self = StObject.set(x, "onCloseClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCloseClickUndefined: Self = StObject.set(x, "onCloseClick", js.undefined)
    
    @scala.inline
    def setOnHidden(value: () => Unit): Self = StObject.set(x, "onHidden", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHiddenUndefined: Self = StObject.set(x, "onHidden", js.undefined)
    
    @scala.inline
    def setOnShown(value: () => Unit): Self = StObject.set(x, "onShown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShownUndefined: Self = StObject.set(x, "onShown", js.undefined)
    
    @scala.inline
    def setOnclick(value: /* ev */ JQueryMouseEventObject => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    @scala.inline
    def setPositionClass(value: String): Self = StObject.set(x, "positionClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionClassUndefined: Self = StObject.set(x, "positionClass", js.undefined)
    
    @scala.inline
    def setPreventDuplicates(value: Boolean): Self = StObject.set(x, "preventDuplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDuplicatesUndefined: Self = StObject.set(x, "preventDuplicates", js.undefined)
    
    @scala.inline
    def setProgressBar(value: Boolean): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressBarUndefined: Self = StObject.set(x, "progressBar", js.undefined)
    
    @scala.inline
    def setProgressClass(value: String): Self = StObject.set(x, "progressClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressClassUndefined: Self = StObject.set(x, "progressClass", js.undefined)
    
    @scala.inline
    def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    @scala.inline
    def setShowDuration(value: Double): Self = StObject.set(x, "showDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDurationUndefined: Self = StObject.set(x, "showDuration", js.undefined)
    
    @scala.inline
    def setShowEasing(value: String): Self = StObject.set(x, "showEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowEasingUndefined: Self = StObject.set(x, "showEasing", js.undefined)
    
    @scala.inline
    def setShowMethod(value: String): Self = StObject.set(x, "showMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMethodUndefined: Self = StObject.set(x, "showMethod", js.undefined)
    
    @scala.inline
    def setTapToDismiss(value: Boolean): Self = StObject.set(x, "tapToDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapToDismissUndefined: Self = StObject.set(x, "tapToDismiss", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTimeOut(value: Double): Self = StObject.set(x, "timeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOutUndefined: Self = StObject.set(x, "timeOut", js.undefined)
    
    @scala.inline
    def setTitleClass(value: String): Self = StObject.set(x, "titleClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleClassUndefined: Self = StObject.set(x, "titleClass", js.undefined)
    
    @scala.inline
    def setToastClass(value: String): Self = StObject.set(x, "toastClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToastClassUndefined: Self = StObject.set(x, "toastClass", js.undefined)
  }
}
