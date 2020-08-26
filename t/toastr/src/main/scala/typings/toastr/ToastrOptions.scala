package typings.toastr

import typings.jquery.JQueryMouseEventObject
import typings.toastr.anon.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastrOptions extends js.Object {
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
  implicit class ToastrOptionsOps[Self <: ToastrOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCloseButton(value: Boolean): Self = this.set("closeButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseButton: Self = this.set("closeButton", js.undefined)
    @scala.inline
    def setCloseClass(value: String): Self = this.set("closeClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseClass: Self = this.set("closeClass", js.undefined)
    @scala.inline
    def setCloseDuration(value: Double): Self = this.set("closeDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseDuration: Self = this.set("closeDuration", js.undefined)
    @scala.inline
    def setCloseEasing(value: String): Self = this.set("closeEasing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseEasing: Self = this.set("closeEasing", js.undefined)
    @scala.inline
    def setCloseHtml(value: String): Self = this.set("closeHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseHtml: Self = this.set("closeHtml", js.undefined)
    @scala.inline
    def setCloseMethod(value: String): Self = this.set("closeMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseMethod: Self = this.set("closeMethod", js.undefined)
    @scala.inline
    def setCloseOnHover(value: Boolean): Self = this.set("closeOnHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnHover: Self = this.set("closeOnHover", js.undefined)
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setEscapeHtml(value: Boolean): Self = this.set("escapeHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEscapeHtml: Self = this.set("escapeHtml", js.undefined)
    @scala.inline
    def setExtendedTimeOut(value: Double): Self = this.set("extendedTimeOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendedTimeOut: Self = this.set("extendedTimeOut", js.undefined)
    @scala.inline
    def setHideDuration(value: Double): Self = this.set("hideDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideDuration: Self = this.set("hideDuration", js.undefined)
    @scala.inline
    def setHideEasing(value: String): Self = this.set("hideEasing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideEasing: Self = this.set("hideEasing", js.undefined)
    @scala.inline
    def setHideMethod(value: String): Self = this.set("hideMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideMethod: Self = this.set("hideMethod", js.undefined)
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    @scala.inline
    def setIconClasses(value: Error): Self = this.set("iconClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconClasses: Self = this.set("iconClasses", js.undefined)
    @scala.inline
    def setMessageClass(value: String): Self = this.set("messageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageClass: Self = this.set("messageClass", js.undefined)
    @scala.inline
    def setNewestOnTop(value: Boolean): Self = this.set("newestOnTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewestOnTop: Self = this.set("newestOnTop", js.undefined)
    @scala.inline
    def setOnCloseClick(value: /* ev */ JQueryMouseEventObject => Unit): Self = this.set("onCloseClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCloseClick: Self = this.set("onCloseClick", js.undefined)
    @scala.inline
    def setOnHidden(value: () => Unit): Self = this.set("onHidden", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnHidden: Self = this.set("onHidden", js.undefined)
    @scala.inline
    def setOnShown(value: () => Unit): Self = this.set("onShown", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnShown: Self = this.set("onShown", js.undefined)
    @scala.inline
    def setOnclick(value: /* ev */ JQueryMouseEventObject => Unit): Self = this.set("onclick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnclick: Self = this.set("onclick", js.undefined)
    @scala.inline
    def setPositionClass(value: String): Self = this.set("positionClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionClass: Self = this.set("positionClass", js.undefined)
    @scala.inline
    def setPreventDuplicates(value: Boolean): Self = this.set("preventDuplicates", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventDuplicates: Self = this.set("preventDuplicates", js.undefined)
    @scala.inline
    def setProgressBar(value: Boolean): Self = this.set("progressBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressBar: Self = this.set("progressBar", js.undefined)
    @scala.inline
    def setProgressClass(value: String): Self = this.set("progressClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressClass: Self = this.set("progressClass", js.undefined)
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    @scala.inline
    def setShowDuration(value: Double): Self = this.set("showDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDuration: Self = this.set("showDuration", js.undefined)
    @scala.inline
    def setShowEasing(value: String): Self = this.set("showEasing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowEasing: Self = this.set("showEasing", js.undefined)
    @scala.inline
    def setShowMethod(value: String): Self = this.set("showMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMethod: Self = this.set("showMethod", js.undefined)
    @scala.inline
    def setTapToDismiss(value: Boolean): Self = this.set("tapToDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapToDismiss: Self = this.set("tapToDismiss", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTimeOut(value: Double): Self = this.set("timeOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeOut: Self = this.set("timeOut", js.undefined)
    @scala.inline
    def setTitleClass(value: String): Self = this.set("titleClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleClass: Self = this.set("titleClass", js.undefined)
    @scala.inline
    def setToastClass(value: String): Self = this.set("toastClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToastClass: Self = this.set("toastClass", js.undefined)
  }
  
}

