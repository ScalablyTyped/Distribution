package typings.vscode.mod

import typings.vscode.anon.Dark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickInputButton extends js.Object {
  
  /**
    * Icon for the button.
    */
  val iconPath: Uri | Dark | ThemeIcon = js.native
  
  /**
    * An optional tooltip.
    */
  val tooltip: js.UndefOr[String] = js.native
}
object QuickInputButton {
  
  @scala.inline
  def apply(iconPath: Uri | Dark | ThemeIcon): QuickInputButton = {
    val __obj = js.Dynamic.literal(iconPath = iconPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickInputButton]
  }
  
  @scala.inline
  implicit class QuickInputButtonOps[Self <: QuickInputButton] (val x: Self) extends AnyVal {
    
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
    def setIconPath(value: Uri | Dark | ThemeIcon): Self = this.set("iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
}
