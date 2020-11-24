package typings.terminalMenu.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminalMenuOptions extends js.Object {
  
  /**
    * Background color for the menu.
    * Default = 'blue'
    */
  var bg: js.UndefOr[String] = js.native
  
  /**
    * Foreground color for the menu.
    * Default = 'white'
    */
  var fg: js.UndefOr[String] = js.native
  
  /**
    * Padding for the bounding rectangle.
    * If a number is passed, all elements of the Thickness structure will be set to
    * that value.
    * Default = {
    *      left: 2,
    *      right: 2,
    *      top: 1,
    *      bottom: 1
    * }
    */
  var padding: js.UndefOr[Double | Thickness] = js.native
  
  /**
    * Index of the menu item to be selected.
    * Default = 0
    */
  var selected: js.UndefOr[Double] = js.native
  
  /**
    * Menu width in columns.
    * Default = 50.
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * Horizontal offset for top-left corner.
    * Default = 1
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * Vertical offset for top-left corner.
    * Default = 1
    */
  var y: js.UndefOr[Double] = js.native
}
object TerminalMenuOptions {
  
  @scala.inline
  def apply(): TerminalMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminalMenuOptions]
  }
  
  @scala.inline
  implicit class TerminalMenuOptionsOps[Self <: TerminalMenuOptions] (val x: Self) extends AnyVal {
    
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
    def setBg(value: String): Self = this.set("bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBg: Self = this.set("bg", js.undefined)
    
    @scala.inline
    def setFg(value: String): Self = this.set("fg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFg: Self = this.set("fg", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | Thickness): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setSelected(value: Double): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
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
