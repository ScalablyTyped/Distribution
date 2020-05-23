package typings.trezorConnect.mod

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
    lock_time: js.UndefOr[Double] = js.undefined,
    timestamp: js.UndefOr[Double] = js.undefined,
    version: js.UndefOr[Double] = js.undefined,
    version_group_id: js.UndefOr[Double] = js.undefined
  ): RefTransaction = {
    val __obj = js.Dynamic.literal(bin_outputs = bin_outputs.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    if (extra_data != null) __obj.updateDynamic("extra_data")(extra_data.asInstanceOf[js.Any])
    if (!js.isUndefined(lock_time)) __obj.updateDynamic("lock_time")(lock_time.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    if (!js.isUndefined(version_group_id)) __obj.updateDynamic("version_group_id")(version_group_id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefTransaction]
  }
}

