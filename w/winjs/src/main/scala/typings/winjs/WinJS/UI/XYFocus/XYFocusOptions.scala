package typings.winjs.WinJS.UI.XYFocus

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XYFocusOptions extends js.Object {
  
  /**
    * The focus scope, only children of this element are considered in the calculation.
    **/
  var focusRoot: js.UndefOr[HTMLElement] = js.native
  
  /**
    * A rectangle indicating where focus came from before the current state.
    **/
  var historyRect: js.UndefOr[IRect] = js.native
  
  /**
    * The element from which to calculate the next focusable element; if specified, referenceRect is ignored.
    **/
  var referenceElement: js.UndefOr[HTMLElement] = js.native
  
  /**
    * The rectangle from which to calculate next focusable element; ignored if referenceElement is also specified.
    **/
  var referenceRect: js.UndefOr[IRect] = js.native
}
object XYFocusOptions {
  
  @scala.inline
  def apply(): XYFocusOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XYFocusOptions]
  }
  
  @scala.inline
  implicit class XYFocusOptionsOps[Self <: XYFocusOptions] (val x: Self) extends AnyVal {
    
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
    def setFocusRoot(value: HTMLElement): Self = this.set("focusRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusRoot: Self = this.set("focusRoot", js.undefined)
    
    @scala.inline
    def setHistoryRect(value: IRect): Self = this.set("historyRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistoryRect: Self = this.set("historyRect", js.undefined)
    
    @scala.inline
    def setReferenceElement(value: HTMLElement): Self = this.set("referenceElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceElement: Self = this.set("referenceElement", js.undefined)
    
    @scala.inline
    def setReferenceRect(value: IRect): Self = this.set("referenceRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceRect: Self = this.set("referenceRect", js.undefined)
  }
}
