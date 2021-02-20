package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuOptions extends ComponentOptions {
  
  var menuButton: MenuButton = js.native
}
object MenuOptions {
  
  @scala.inline
  def apply(menuButton: MenuButton): MenuOptions = {
    val __obj = js.Dynamic.literal(menuButton = menuButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuOptions]
  }
  
  @scala.inline
  implicit class MenuOptionsMutableBuilder[Self <: MenuOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMenuButton(value: MenuButton): Self = StObject.set(x, "menuButton", value.asInstanceOf[js.Any])
  }
}
