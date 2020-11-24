package typings.terminalKit.terminalMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingleColumnMenuOptions extends js.Object {
  
  var cancelable: js.UndefOr[Boolean] = js.native
  
  var continueOnSubmit: js.UndefOr[Boolean] = js.native
  
  var exitOnUnexpectedKey: js.UndefOr[Boolean] = js.native
  
  var extraLines: js.UndefOr[Double] = js.native
  
  var itemMaxWidth: js.UndefOr[Double] = js.native
  
  var keyBindings: js.UndefOr[StringDictionary[String]] = js.native
  
  var leftPadding: js.UndefOr[String] = js.native
  
  var oneLineItem: js.UndefOr[Boolean] = js.native
  
  var selectedIndex: js.UndefOr[Double] = js.native
  
  var selectedLeftPadding: js.UndefOr[String] = js.native
  
  var selectedStyle: js.UndefOr[CTerminal] = js.native
  
  var style: js.UndefOr[CTerminal] = js.native
  
  var submittedLeftPadding: js.UndefOr[String] = js.native
  
  var submittedStyle: js.UndefOr[CTerminal] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object SingleColumnMenuOptions {
  
  @scala.inline
  def apply(): SingleColumnMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleColumnMenuOptions]
  }
  
  @scala.inline
  implicit class SingleColumnMenuOptionsOps[Self <: SingleColumnMenuOptions] (val x: Self) extends AnyVal {
    
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
    def setCancelable(value: Boolean): Self = this.set("cancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelable: Self = this.set("cancelable", js.undefined)
    
    @scala.inline
    def setContinueOnSubmit(value: Boolean): Self = this.set("continueOnSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinueOnSubmit: Self = this.set("continueOnSubmit", js.undefined)
    
    @scala.inline
    def setExitOnUnexpectedKey(value: Boolean): Self = this.set("exitOnUnexpectedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitOnUnexpectedKey: Self = this.set("exitOnUnexpectedKey", js.undefined)
    
    @scala.inline
    def setExtraLines(value: Double): Self = this.set("extraLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraLines: Self = this.set("extraLines", js.undefined)
    
    @scala.inline
    def setItemMaxWidth(value: Double): Self = this.set("itemMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemMaxWidth: Self = this.set("itemMaxWidth", js.undefined)
    
    @scala.inline
    def setKeyBindings(value: StringDictionary[String]): Self = this.set("keyBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyBindings: Self = this.set("keyBindings", js.undefined)
    
    @scala.inline
    def setLeftPadding(value: String): Self = this.set("leftPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftPadding: Self = this.set("leftPadding", js.undefined)
    
    @scala.inline
    def setOneLineItem(value: Boolean): Self = this.set("oneLineItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneLineItem: Self = this.set("oneLineItem", js.undefined)
    
    @scala.inline
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedIndex: Self = this.set("selectedIndex", js.undefined)
    
    @scala.inline
    def setSelectedLeftPadding(value: String): Self = this.set("selectedLeftPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedLeftPadding: Self = this.set("selectedLeftPadding", js.undefined)
    
    @scala.inline
    def setSelectedStyle(value: CTerminal): Self = this.set("selectedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedStyle: Self = this.set("selectedStyle", js.undefined)
    
    @scala.inline
    def setStyle(value: CTerminal): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSubmittedLeftPadding(value: String): Self = this.set("submittedLeftPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmittedLeftPadding: Self = this.set("submittedLeftPadding", js.undefined)
    
    @scala.inline
    def setSubmittedStyle(value: CTerminal): Self = this.set("submittedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmittedStyle: Self = this.set("submittedStyle", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
