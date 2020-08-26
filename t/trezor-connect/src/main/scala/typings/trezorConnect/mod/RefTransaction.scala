package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefTransaction extends js.Object {
  var bin_outputs: js.Array[BinOutput] = js.native
  var extra_data: js.UndefOr[String] = js.native
  var hash: String = js.native
  var inputs: js.Array[Input] = js.native
  var lock_time: js.UndefOr[Double] = js.native
  var timestamp: js.UndefOr[Double] = js.native
  var version: js.UndefOr[Double] = js.native
  var version_group_id: js.UndefOr[Double] = js.native
}

object RefTransaction {
  @scala.inline
  def apply(bin_outputs: js.Array[BinOutput], hash: String, inputs: js.Array[Input]): RefTransaction = {
    val __obj = js.Dynamic.literal(bin_outputs = bin_outputs.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefTransaction]
  }
  @scala.inline
  implicit class RefTransactionOps[Self <: RefTransaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBin_outputsVarargs(value: BinOutput*): Self = this.set("bin_outputs", js.Array(value :_*))
    @scala.inline
    def setBin_outputs(value: js.Array[BinOutput]): Self = this.set("bin_outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputsVarargs(value: Input*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[Input]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtra_data(value: String): Self = this.set("extra_data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra_data: Self = this.set("extra_data", js.undefined)
    @scala.inline
    def setLock_time(value: Double): Self = this.set("lock_time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLock_time: Self = this.set("lock_time", js.undefined)
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setVersion_group_id(value: Double): Self = this.set("version_group_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion_group_id: Self = this.set("version_group_id", js.undefined)
  }
  
}

