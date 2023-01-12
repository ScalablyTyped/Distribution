package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuOptions
  extends StObject
     with ComponentOptions {
  
  var menuButton: MenuButton
}
object MenuOptions {
  
  inline def apply(menuButton: MenuButton): MenuOptions = {
    val __obj = js.Dynamic.literal(menuButton = menuButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuOptions] (val x: Self) extends AnyVal {
    
    inline def setMenuButton(value: MenuButton): Self = StObject.set(x, "menuButton", value.asInstanceOf[js.Any])
  }
}
