package typings.toastr

import typings.jquery.JQueryMouseEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastrOptions extends js.Object {
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
  var iconClasses: js.UndefOr[AnonError] = js.undefined
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
  @scala.inline
  def apply(
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeClass: String = null,
    closeDuration: Int | Double = null,
    closeEasing: String = null,
    closeHtml: String = null,
    closeMethod: String = null,
    closeOnHover: js.UndefOr[Boolean] = js.undefined,
    containerId: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    escapeHtml: js.UndefOr[Boolean] = js.undefined,
    extendedTimeOut: Int | Double = null,
    hideDuration: Int | Double = null,
    hideEasing: String = null,
    hideMethod: String = null,
    iconClass: String = null,
    iconClasses: AnonError = null,
    messageClass: String = null,
    newestOnTop: js.UndefOr[Boolean] = js.undefined,
    onCloseClick: /* ev */ JQueryMouseEventObject => Unit = null,
    onHidden: () => Unit = null,
    onShown: () => Unit = null,
    onclick: /* ev */ JQueryMouseEventObject => Unit = null,
    positionClass: String = null,
    preventDuplicates: js.UndefOr[Boolean] = js.undefined,
    progressBar: js.UndefOr[Boolean] = js.undefined,
    progressClass: String = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    showDuration: Int | Double = null,
    showEasing: String = null,
    showMethod: String = null,
    tapToDismiss: js.UndefOr[Boolean] = js.undefined,
    target: String = null,
    timeOut: Int | Double = null,
    titleClass: String = null,
    toastClass: String = null
  ): ToastrOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (closeClass != null) __obj.updateDynamic("closeClass")(closeClass.asInstanceOf[js.Any])
    if (closeDuration != null) __obj.updateDynamic("closeDuration")(closeDuration.asInstanceOf[js.Any])
    if (closeEasing != null) __obj.updateDynamic("closeEasing")(closeEasing.asInstanceOf[js.Any])
    if (closeHtml != null) __obj.updateDynamic("closeHtml")(closeHtml.asInstanceOf[js.Any])
    if (closeMethod != null) __obj.updateDynamic("closeMethod")(closeMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnHover)) __obj.updateDynamic("closeOnHover")(closeOnHover.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeHtml)) __obj.updateDynamic("escapeHtml")(escapeHtml.asInstanceOf[js.Any])
    if (extendedTimeOut != null) __obj.updateDynamic("extendedTimeOut")(extendedTimeOut.asInstanceOf[js.Any])
    if (hideDuration != null) __obj.updateDynamic("hideDuration")(hideDuration.asInstanceOf[js.Any])
    if (hideEasing != null) __obj.updateDynamic("hideEasing")(hideEasing.asInstanceOf[js.Any])
    if (hideMethod != null) __obj.updateDynamic("hideMethod")(hideMethod.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (iconClasses != null) __obj.updateDynamic("iconClasses")(iconClasses.asInstanceOf[js.Any])
    if (messageClass != null) __obj.updateDynamic("messageClass")(messageClass.asInstanceOf[js.Any])
    if (!js.isUndefined(newestOnTop)) __obj.updateDynamic("newestOnTop")(newestOnTop.asInstanceOf[js.Any])
    if (onCloseClick != null) __obj.updateDynamic("onCloseClick")(js.Any.fromFunction1(onCloseClick))
    if (onHidden != null) __obj.updateDynamic("onHidden")(js.Any.fromFunction0(onHidden))
    if (onShown != null) __obj.updateDynamic("onShown")(js.Any.fromFunction0(onShown))
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction1(onclick))
    if (positionClass != null) __obj.updateDynamic("positionClass")(positionClass.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDuplicates)) __obj.updateDynamic("preventDuplicates")(preventDuplicates.asInstanceOf[js.Any])
    if (!js.isUndefined(progressBar)) __obj.updateDynamic("progressBar")(progressBar.asInstanceOf[js.Any])
    if (progressClass != null) __obj.updateDynamic("progressClass")(progressClass.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (showDuration != null) __obj.updateDynamic("showDuration")(showDuration.asInstanceOf[js.Any])
    if (showEasing != null) __obj.updateDynamic("showEasing")(showEasing.asInstanceOf[js.Any])
    if (showMethod != null) __obj.updateDynamic("showMethod")(showMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(tapToDismiss)) __obj.updateDynamic("tapToDismiss")(tapToDismiss.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (timeOut != null) __obj.updateDynamic("timeOut")(timeOut.asInstanceOf[js.Any])
    if (titleClass != null) __obj.updateDynamic("titleClass")(titleClass.asInstanceOf[js.Any])
    if (toastClass != null) __obj.updateDynamic("toastClass")(toastClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastrOptions]
  }
}

