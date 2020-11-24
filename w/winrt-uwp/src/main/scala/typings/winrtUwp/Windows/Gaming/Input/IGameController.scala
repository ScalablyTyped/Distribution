package typings.winrtUwp.Windows.Gaming.Input

import typings.winrtUwp.Windows.System.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The core interface required to be implemented by all controller devices, regardless of their actual type (i.e. gamepads, steering wheels, flight sticks, etc). This interface exists mainly to support extensibility for game controllers, which allows OEMs to publish WinRT classes that provide rich access to their device's features, while integrating into the underlying game controller device enumeration framework. */
@js.native
trait IGameController extends js.Object {
  
  /** The audio headset attached to the controller. */
  var headset: Headset = js.native
  
  /** Gets a value that indicates the wireless state of the gamepad. */
  var isWireless: Boolean = js.native
  
  /** The user associated with the controller. */
  var user: User = js.native
}
object IGameController {
  
  @scala.inline
  def apply(headset: Headset, isWireless: Boolean, user: User): IGameController = {
    val __obj = js.Dynamic.literal(headset = headset.asInstanceOf[js.Any], isWireless = isWireless.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGameController]
  }
  
  @scala.inline
  implicit class IGameControllerOps[Self <: IGameController] (val x: Self) extends AnyVal {
    
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
    def setHeadset(value: Headset): Self = this.set("headset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWireless(value: Boolean): Self = this.set("isWireless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
