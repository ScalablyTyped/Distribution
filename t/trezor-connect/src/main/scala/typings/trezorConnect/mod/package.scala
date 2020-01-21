package typings.trezorConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RequestLoginParams = (typings.trezorConnect.mod.CommonParams with typings.trezorConnect.AnonCallback) | typings.trezorConnect.mod.LoginChallenge
}
