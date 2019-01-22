package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignMessageParams extends CommonParams {
  var coin: js.UndefOr[java.lang.String] = js.undefined
  var message: java.lang.String
  var path: java.lang.String | js.Array[scala.Double]
}

