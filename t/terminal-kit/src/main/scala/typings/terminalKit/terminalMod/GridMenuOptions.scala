package typings.terminalKit.terminalMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridMenuOptions extends js.Object {
  
  var exitOnUnexpectedKey: js.UndefOr[Boolean] = js.native
  
  var itemMaxWidth: js.UndefOr[Double] = js.native
  
  var keyBindings: js.UndefOr[StringDictionary[String]] = js.native
  
  var leftPadding: js.UndefOr[String] = js.native
  
  var rightPadding: js.UndefOr[String] = js.native
  
  var selectedLeftPadding: js.UndefOr[String] = js.native
  
  var selectedRightPadding: js.UndefOr[String] = js.native
  
  var selectedStyle: js.UndefOr[CTerminal] = js.native
  
  var style: js.UndefOr[CTerminal] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object GridMenuOptions {
  
  @scala.inline
  def apply(): GridMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridMenuOptions]
  }
  
  @scala.inline
  implicit class GridMenuOptionsOps[Self <: GridMenuOptions] (val x: Self) extends AnyVal {
    
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
    def setExitOnUnexpectedKey(value: Boolean): Self = this.set("exitOnUnexpectedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitOnUnexpectedKey: Self = this.set("exitOnUnexpectedKey", js.undefined)
    
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
    def setRightPadding(value: String): Self = this.set("rightPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightPadding: Self = this.set("rightPadding", js.undefined)
    
    @scala.inline
    def setSelectedLeftPadding(value: String): Self = this.set("selectedLeftPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedLeftPadding: Self = this.set("selectedLeftPadding", js.undefined)
    
    @scala.inline
    def setSelectedRightPadding(value: String): Self = this.set("selectedRightPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedRightPadding: Self = this.set("selectedRightPadding", js.undefined)
    
    @scala.inline
    def setSelectedStyle(value: CTerminal): Self = this.set("selectedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedStyle: Self = this.set("selectedStyle", js.undefined)
    
    @scala.inline
    def setStyle(value: CTerminal): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
