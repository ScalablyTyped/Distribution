package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccountInfoParams extends CommonParams {
      // if both these fields are missing, the user will select an account
  var coin: java.lang.String
  var path: js.UndefOr[js.Array[scala.Double]] = js.undefined
    // NOTE:
  var xpub: js.UndefOr[java.lang.String] = js.undefined
}

