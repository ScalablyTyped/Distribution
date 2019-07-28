package typings.winrtDashUwp.WindowsNs.GamingNs.InputNs

import typings.winrtDashUwp.WindowsNs.SystemNs.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The core interface required to be implemented by all controller devices, regardless of their actual type (i.e. gamepads, steering wheels, flight sticks, etc). This interface exists mainly to support extensibility for game controllers, which allows OEMs to publish WinRT classes that provide rich access to their device's features, while integrating into the underlying game controller device enumeration framework. */
trait IGameController extends js.Object {
  /** The audio headset attached to the controller. */
  var headset: Headset
  /** Gets a value that indicates the wireless state of the gamepad. */
  var isWireless: Boolean
  /** The user associated with the controller. */
  var user: User
}

object IGameController {
  @scala.inline
  def apply(headset: Headset, isWireless: Boolean, user: User): IGameController = {
    val __obj = js.Dynamic.literal(headset = headset, isWireless = isWireless, user = user)
  
    __obj.asInstanceOf[IGameController]
  }
}

