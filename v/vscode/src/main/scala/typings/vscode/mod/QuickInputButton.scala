package typings.vscode.mod

import typings.vscode.anon.Dark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickInputButton extends StObject {
  
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
  implicit class QuickInputButtonMutableBuilder[Self <: QuickInputButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconPath(value: Uri | Dark | ThemeIcon): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
