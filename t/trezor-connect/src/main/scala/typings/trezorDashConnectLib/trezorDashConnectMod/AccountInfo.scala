package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountInfo extends js.Object {
  // These fields are returned, presumably, to save further calls when the use case requires
  // a usable address:
  var address: java.lang.String
  var addressIndex: scala.Double
  var addressPath: js.Array[scala.Double]
  var addressSerializedPath: java.lang.String
   // serialized HD public key. Despite the name, this may be `ypub` for segWit.
  var balance: scala.Double
  var confirmed: scala.Double
  var id: scala.Double
  var path: js.Array[scala.Double]
  var serializedPath: java.lang.String
  var xpub: java.lang.String
}

object AccountInfo {
  @scala.inline
  def apply(
    address: java.lang.String,
    addressIndex: scala.Double,
    addressPath: js.Array[scala.Double],
    addressSerializedPath: java.lang.String,
    balance: scala.Double,
    confirmed: scala.Double,
    id: scala.Double,
    path: js.Array[scala.Double],
    serializedPath: java.lang.String,
    xpub: java.lang.String
  ): AccountInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("addressIndex")(addressIndex)
    __obj.updateDynamic("addressPath")(addressPath)
    __obj.updateDynamic("addressSerializedPath")(addressSerializedPath)
    __obj.updateDynamic("balance")(balance)
    __obj.updateDynamic("confirmed")(confirmed)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("serializedPath")(serializedPath)
    __obj.updateDynamic("xpub")(xpub)
    __obj.asInstanceOf[AccountInfo]
  }
}

