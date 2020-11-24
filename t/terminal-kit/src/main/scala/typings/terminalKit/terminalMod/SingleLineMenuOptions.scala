package typings.terminalKit.terminalMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingleLineMenuOptions extends js.Object {
  
  var cancelable: js.UndefOr[Boolean] = js.native
  
  var exitOnUnexpectedKey: js.UndefOr[Boolean] = js.native
  
  var keyBindings: js.UndefOr[StringDictionary[String]] = js.native
  
  var nextPageHint: js.UndefOr[String] = js.native
  
  var previousPageHint: js.UndefOr[String] = js.native
  
  var selectedStyle: js.UndefOr[CTerminal] = js.native
  
  var separator: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CTerminal] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object SingleLineMenuOptions {
  
  @scala.inline
  def apply(): SingleLineMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleLineMenuOptions]
  }
  
  @scala.inline
  implicit class SingleLineMenuOptionsOps[Self <: SingleLineMenuOptions] (val x: Self) extends AnyVal {
    
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
    def setExitOnUnexpectedKey(value: Boolean): Self = this.set("exitOnUnexpectedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitOnUnexpectedKey: Self = this.set("exitOnUnexpectedKey", js.undefined)
    
    @scala.inline
    def setKeyBindings(value: StringDictionary[String]): Self = this.set("keyBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyBindings: Self = this.set("keyBindings", js.undefined)
    
    @scala.inline
    def setNextPageHint(value: String): Self = this.set("nextPageHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageHint: Self = this.set("nextPageHint", js.undefined)
    
    @scala.inline
    def setPreviousPageHint(value: String): Self = this.set("previousPageHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousPageHint: Self = this.set("previousPageHint", js.undefined)
    
    @scala.inline
    def setSelectedStyle(value: CTerminal): Self = this.set("selectedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedStyle: Self = this.set("selectedStyle", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setStyle(value: CTerminal): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
