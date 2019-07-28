package typings.trezorDashConnect.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefTransaction extends js.Object {
  var bin_outputs: js.Array[BinOutput]
  var extra_data: js.UndefOr[String] = js.undefined
  var hash: String
  var inputs: js.Array[Input]
  var lock_time: js.UndefOr[Double] = js.undefined
  var timestamp: js.UndefOr[Double] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
  var version_group_id: js.UndefOr[Double] = js.undefined
}

object RefTransaction {
  @scala.inline
  def apply(
    bin_outputs: js.Array[BinOutput],
    hash: String,
    inputs: js.Array[Input],
    extra_data: String = null,
    lock_time: Int | Double = null,
    timestamp: Int | Double = null,
    version: Int | Double = null,
    version_group_id: Int | Double = null
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

