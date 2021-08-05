package typings.w3cGamepad

import typings.w3cGamepad.Gamepad.GamepadList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  /**
    * The currently connected and interacted-with gamepads. Gamepads must only appear in the list if they are currently connected to the user agent, and have been interacted with by the user. Otherwise, they must not appear in the list to avoid a malicious page from fingerprinting the user based on connected devices.
    * @readonly
    */
  def getGamepads(): js.Array[typings.w3cGamepad.Gamepad.Gamepad]
  
  def webkitGetGamepads(): GamepadList
}
object Navigator {
  
  inline def apply(
    getGamepads: () => js.Array[typings.w3cGamepad.Gamepad.Gamepad],
    webkitGetGamepads: () => GamepadList
  ): Navigator = {
    val __obj = js.Dynamic.literal(getGamepads = js.Any.fromFunction0(getGamepads), webkitGetGamepads = js.Any.fromFunction0(webkitGetGamepads))
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setGetGamepads(value: () => js.Array[typings.w3cGamepad.Gamepad.Gamepad]): Self = StObject.set(x, "getGamepads", js.Any.fromFunction0(value))
    
    inline def setWebkitGetGamepads(value: () => GamepadList): Self = StObject.set(x, "webkitGetGamepads", js.Any.fromFunction0(value))
  }
}
