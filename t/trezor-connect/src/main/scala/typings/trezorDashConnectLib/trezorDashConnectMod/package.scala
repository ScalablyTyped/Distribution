package typings
package trezorDashConnectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object trezorDashConnectMod {
  type RequestLoginParams = CommonParams with (trezorDashConnectLib.Anon_Callback | LoginChallenge)
}
