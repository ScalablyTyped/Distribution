package typings.typeformEmbed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetOptions extends js.Object {
  
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
  implicit class WidgetOptionsOps[Self <: WidgetOptions] (val x: Self) extends AnyVal {
    
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
    def setButtonText(value: String): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonText: Self = this.set("buttonText", js.undefined)
    
    @scala.inline
    def setDisableTracking(value: Boolean): Self = this.set("disableTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableTracking: Self = this.set("disableTracking", js.undefined)
    
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
    def setOnReady(value: () => Unit): Self = this.set("onReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: /* event */ OnSubmitEvent => Unit): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
  }
}
