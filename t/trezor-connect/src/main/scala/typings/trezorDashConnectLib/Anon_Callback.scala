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
  def apply(callback: js.Function0[trezorDashConnectLib.trezorDashConnectMod.LoginChallenge]): Anon_Callback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callback")(callback)
    __obj.asInstanceOf[Anon_Callback]
  }
}

