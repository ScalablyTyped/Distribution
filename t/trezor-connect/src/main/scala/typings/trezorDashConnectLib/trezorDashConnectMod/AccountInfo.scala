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

