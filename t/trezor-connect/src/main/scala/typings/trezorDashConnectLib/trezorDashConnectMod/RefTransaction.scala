package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefTransaction extends js.Object {
  var bin_outputs: js.Array[BinOutput]
  var extra_data: js.UndefOr[java.lang.String] = js.undefined
  var hash: java.lang.String
  var inputs: js.Array[Input]
  var lock_time: js.UndefOr[scala.Double] = js.undefined
  var timestamp: js.UndefOr[scala.Double] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
  var version_group_id: js.UndefOr[scala.Double] = js.undefined
}

object RefTransaction {
  @scala.inline
  def apply(
    bin_outputs: js.Array[BinOutput],
    hash: java.lang.String,
    inputs: js.Array[Input],
    extra_data: java.lang.String = null,
    lock_time: scala.Int | scala.Double = null,
    timestamp: scala.Int | scala.Double = null,
    version: scala.Int | scala.Double = null,
    version_group_id: scala.Int | scala.Double = null
  ): RefTransaction = {
    val __obj = js.Dynamic.literal(bin_outputs = bin_outputs, hash = hash, inputs = inputs)
    if (extra_data != null) __obj.updateDynamic("extra_data")(extra_data)
    if (lock_time != null) __obj.updateDynamic("lock_time")(lock_time.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (version_group_id != null) __obj.updateDynamic("version_group_id")(version_group_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefTransaction]
  }
}

