package typings.vexJs.mod

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVexOptions extends js.Object {
  
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var afterOpen: js.UndefOr[js.Function1[/* vexContent */ JQuery[HTMLElement], Unit]] = js.native
  
  var appendLocation: js.UndefOr[HTMLElement | JQuery[HTMLElement] | String] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var closeCSS: js.UndefOr[ICSSAttributes] = js.native
  
  var closeClassName: js.UndefOr[String] = js.native
  
  var content: js.UndefOr[String] = js.native
  
  var contentCSS: js.UndefOr[ICSSAttributes] = js.native
  
  var contentClassName: js.UndefOr[String] = js.native
  
  var css: js.UndefOr[ICSSAttributes] = js.native
  
  var escapeButtonCloses: js.UndefOr[Boolean] = js.native
  
  var overlayCSS: js.UndefOr[ICSSAttributes] = js.native
  
  var overlayClassName: js.UndefOr[String] = js.native
  
  var overlayClosesOnClick: js.UndefOr[Boolean] = js.native
  
  var showCloseButton: js.UndefOr[Boolean] = js.native
}
object IVexOptions {
  
  @scala.inline
  def apply(): IVexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVexOptions]
  }
  
  @scala.inline
  implicit class IVexOptionsOps[Self <: IVexOptions] (val x: Self) extends AnyVal {
    
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
    def setAfterClose(value: () => Unit): Self = this.set("afterClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAfterClose: Self = this.set("afterClose", js.undefined)
    
    @scala.inline
    def setAfterOpen(value: /* vexContent */ JQuery[HTMLElement] => Unit): Self = this.set("afterOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterOpen: Self = this.set("afterOpen", js.undefined)
    
    @scala.inline
    def setAppendLocation(value: HTMLElement | JQuery[HTMLElement] | String): Self = this.set("appendLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendLocation: Self = this.set("appendLocation", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCloseCSS(value: ICSSAttributes): Self = this.set("closeCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseCSS: Self = this.set("closeCSS", js.undefined)
    
    @scala.inline
    def setCloseClassName(value: String): Self = this.set("closeClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseClassName: Self = this.set("closeClassName", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentCSS(value: ICSSAttributes): Self = this.set("contentCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentCSS: Self = this.set("contentCSS", js.undefined)
    
    @scala.inline
    def setContentClassName(value: String): Self = this.set("contentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentClassName: Self = this.set("contentClassName", js.undefined)
    
    @scala.inline
    def setCss(value: ICSSAttributes): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setEscapeButtonCloses(value: Boolean): Self = this.set("escapeButtonCloses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeButtonCloses: Self = this.set("escapeButtonCloses", js.undefined)
    
    @scala.inline
    def setOverlayCSS(value: ICSSAttributes): Self = this.set("overlayCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayCSS: Self = this.set("overlayCSS", js.undefined)
    
    @scala.inline
    def setOverlayClassName(value: String): Self = this.set("overlayClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayClassName: Self = this.set("overlayClassName", js.undefined)
    
    @scala.inline
    def setOverlayClosesOnClick(value: Boolean): Self = this.set("overlayClosesOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayClosesOnClick: Self = this.set("overlayClosesOnClick", js.undefined)
    
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
  }
}
