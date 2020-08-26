package typings.web3Utils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbiItem extends js.Object {
  var anonymous: js.UndefOr[Boolean] = js.native
  var constant: js.UndefOr[Boolean] = js.native
  var gas: js.UndefOr[Double] = js.native
  var inputs: js.UndefOr[js.Array[AbiInput]] = js.native
  var name: js.UndefOr[String] = js.native
  var outputs: js.UndefOr[js.Array[AbiOutput]] = js.native
  var payable: js.UndefOr[Boolean] = js.native
  var stateMutability: js.UndefOr[StateMutabilityType] = js.native
  var `type`: AbiType = js.native
}

object AbiItem {
  @scala.inline
  def apply(`type`: AbiType): AbiItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbiItem]
  }
  @scala.inline
  implicit class AbiItemOps[Self <: AbiItem] (val x: Self) extends AnyVal {
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
    def setType(value: AbiType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnonymous(value: Boolean): Self = this.set("anonymous", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnonymous: Self = this.set("anonymous", js.undefined)
    @scala.inline
    def setConstant(value: Boolean): Self = this.set("constant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstant: Self = this.set("constant", js.undefined)
    @scala.inline
    def setGas(value: Double): Self = this.set("gas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGas: Self = this.set("gas", js.undefined)
    @scala.inline
    def setInputsVarargs(value: AbiInput*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[AbiInput]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOutputsVarargs(value: AbiOutput*): Self = this.set("outputs", js.Array(value :_*))
    @scala.inline
    def setOutputs(value: js.Array[AbiOutput]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputs: Self = this.set("outputs", js.undefined)
    @scala.inline
    def setPayable(value: Boolean): Self = this.set("payable", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayable: Self = this.set("payable", js.undefined)
    @scala.inline
    def setStateMutability(value: StateMutabilityType): Self = this.set("stateMutability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateMutability: Self = this.set("stateMutability", js.undefined)
  }
  
}

