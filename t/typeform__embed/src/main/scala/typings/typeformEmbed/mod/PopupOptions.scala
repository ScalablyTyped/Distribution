package typings.typeformEmbed.mod

import typings.std.HTMLElement
import typings.typeformEmbed.typeformEmbedStrings.drawer_left
import typings.typeformEmbed.typeformEmbedStrings.drawer_right
import typings.typeformEmbed.typeformEmbedStrings.exit
import typings.typeformEmbed.typeformEmbedStrings.load
import typings.typeformEmbed.typeformEmbedStrings.popover
import typings.typeformEmbed.typeformEmbedStrings.popup
import typings.typeformEmbed.typeformEmbedStrings.scroll
import typings.typeformEmbed.typeformEmbedStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupOptions extends js.Object {
  
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
  implicit class PopupOptionsOps[Self <: PopupOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoClose(value: Double): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoClose: Self = this.set("autoClose", js.undefined)
    
    @scala.inline
    def setAutoOpen(value: Boolean): Self = this.set("autoOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoOpen: Self = this.set("autoOpen", js.undefined)
    
    @scala.inline
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setDisableTracking(value: Boolean): Self = this.set("disableTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableTracking: Self = this.set("disableTracking", js.undefined)
    
    @scala.inline
    def setDrawerWidth(value: Double): Self = this.set("drawerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawerWidth: Self = this.set("drawerWidth", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHideFooter(value: Boolean): Self = this.set("hideFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideFooter: Self = this.set("hideFooter", js.undefined)
    
    @scala.inline
    def setHideHeaders(value: Boolean): Self = this.set("hideHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideHeaders: Self = this.set("hideHeaders", js.undefined)
    
    @scala.inline
    def setHideScrollbars(value: Boolean): Self = this.set("hideScrollbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideScrollbars: Self = this.set("hideScrollbars", js.undefined)
    
    @scala.inline
    def setMode(value: popup | drawer_left | drawer_right | popover): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnReady(value: () => Unit): Self = this.set("onReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: /* event */ OnSubmitEvent => Unit): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    
    @scala.inline
    def setOpen(value: exit | load | scroll | time): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setOpenValue(value: Double): Self = this.set("openValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenValue: Self = this.set("openValue", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
