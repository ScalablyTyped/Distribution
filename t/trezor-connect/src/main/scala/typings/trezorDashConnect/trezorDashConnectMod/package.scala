package typings.trezorDashConnect

import typings.trezorDashConnect.Anon_Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object trezorDashConnectMod {
  type RequestLoginParams = (CommonParams with Anon_Callback) | LoginChallenge
}
