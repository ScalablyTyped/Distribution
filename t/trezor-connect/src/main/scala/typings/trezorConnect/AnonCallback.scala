package typings.trezorConnect

import typings.trezorConnect.mod.LoginChallenge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  def callback(): LoginChallenge
}

object AnonCallback {
  @scala.inline
  def apply(callback: () => LoginChallenge): AnonCallback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback))
  
    __obj.asInstanceOf[AnonCallback]
  }
}

