package typings
package trezorDashConnectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  def callback(): trezorDashConnectLib.trezorDashConnectMod.LoginChallenge
}

object Anon_Callback {
  @scala.inline
  def apply(callback: () => trezorDashConnectLib.trezorDashConnectMod.LoginChallenge): Anon_Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback))
  
    __obj.asInstanceOf[Anon_Callback]
  }
}

