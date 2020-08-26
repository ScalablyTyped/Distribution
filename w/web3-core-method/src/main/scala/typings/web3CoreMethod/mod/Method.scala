package typings.web3CoreMethod.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Method extends js.Object {
  var abiCoder: js.UndefOr[js.Any] = js.native
  var call: String = js.native
  var defaultAccount: js.UndefOr[String | Null] = js.native
  var defaultBlock: js.UndefOr[String] = js.native
  var extraFormatters: js.UndefOr[js.Any] = js.native
  var handleRevert: js.UndefOr[Boolean] = js.native
  var inputFormatter: js.UndefOr[js.Array[js.Function0[Unit] | Null]] = js.native
  var name: String = js.native
  var outputFormatter: js.UndefOr[js.Function0[Unit]] = js.native
  var params: js.UndefOr[Double] = js.native
  var transformPayload: js.UndefOr[js.Function0[Unit]] = js.native
}

object Method {
  @scala.inline
  def apply(call: String, name: String): Method = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
  @scala.inline
  implicit class MethodOps[Self <: Method] (val x: Self) extends AnyVal {
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
    def setCall(value: String): Self = this.set("call", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbiCoder(value: js.Any): Self = this.set("abiCoder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbiCoder: Self = this.set("abiCoder", js.undefined)
    @scala.inline
    def setDefaultAccount(value: String): Self = this.set("defaultAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultAccount: Self = this.set("defaultAccount", js.undefined)
    @scala.inline
    def setDefaultAccountNull: Self = this.set("defaultAccount", null)
    @scala.inline
    def setDefaultBlock(value: String): Self = this.set("defaultBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultBlock: Self = this.set("defaultBlock", js.undefined)
    @scala.inline
    def setExtraFormatters(value: js.Any): Self = this.set("extraFormatters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraFormatters: Self = this.set("extraFormatters", js.undefined)
    @scala.inline
    def setHandleRevert(value: Boolean): Self = this.set("handleRevert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleRevert: Self = this.set("handleRevert", js.undefined)
    @scala.inline
    def setInputFormatterVarargs(value: (js.Function0[Unit] | Null)*): Self = this.set("inputFormatter", js.Array(value :_*))
    @scala.inline
    def setInputFormatter(value: js.Array[js.Function0[Unit] | Null]): Self = this.set("inputFormatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputFormatter: Self = this.set("inputFormatter", js.undefined)
    @scala.inline
    def setOutputFormatter(value: () => Unit): Self = this.set("outputFormatter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOutputFormatter: Self = this.set("outputFormatter", js.undefined)
    @scala.inline
    def setParams(value: Double): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setTransformPayload(value: () => Unit): Self = this.set("transformPayload", js.Any.fromFunction0(value))
    @scala.inline
    def deleteTransformPayload: Self = this.set("transformPayload", js.undefined)
  }
  
}

