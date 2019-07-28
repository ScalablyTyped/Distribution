package typings.trezorDashConnect

import typings.trezorDashConnect.trezorDashConnectMod.LoginChallenge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  def callback(): LoginChallenge
}

object Anon_Callback {
  @scala.inline
  def apply(callback: () => LoginChallenge): Anon_Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback))
  
    __obj.asInstanceOf[Anon_Callback]
  }
}

