package typings.videoReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShortcutItem extends StObject {
  
  /**
    * Defines if the action fires when the CTRL
    * key is pressed.
    */
  var ctrl: Boolean
  
  /**
    * The function to control the player when
    * the shortcut is pressed.
    */
  def handle(state: PlayerState, actions: PlayerActions): Unit
  
  /**
    * The key code for the shortcut.
    */
  var keyCode: Double
}
object ShortcutItem {
  
  inline def apply(ctrl: Boolean, handle: (PlayerState, PlayerActions) => Unit, keyCode: Double): ShortcutItem = {
    val __obj = js.Dynamic.literal(ctrl = ctrl.asInstanceOf[js.Any], handle = js.Any.fromFunction2(handle), keyCode = keyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShortcutItem] (val x: Self) extends AnyVal {
    
    inline def setCtrl(value: Boolean): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
    
    inline def setHandle(value: (PlayerState, PlayerActions) => Unit): Self = StObject.set(x, "handle", js.Any.fromFunction2(value))
    
    inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
  }
}
