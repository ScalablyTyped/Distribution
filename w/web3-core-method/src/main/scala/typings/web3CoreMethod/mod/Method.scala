package typings.web3CoreMethod.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Method extends js.Object {
  var abiCoder: js.UndefOr[js.Any] = js.undefined
  var call: String
  var defaultAccount: js.UndefOr[String | Null] = js.undefined
  var defaultBlock: js.UndefOr[String] = js.undefined
  var extraFormatters: js.UndefOr[js.Any] = js.undefined
  var handleRevert: js.UndefOr[Boolean] = js.undefined
  var inputFormatter: js.UndefOr[js.Array[js.Function0[Unit] | Null]] = js.undefined
  var name: String
  var outputFormatter: js.UndefOr[js.Function0[Unit]] = js.undefined
  var params: js.UndefOr[Double] = js.undefined
  var transformPayload: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Method {
  @scala.inline
  def apply(
    call: String,
    name: String,
    abiCoder: js.Any = null,
    defaultAccount: js.UndefOr[Null | String] = js.undefined,
    defaultBlock: String = null,
    extraFormatters: js.Any = null,
    handleRevert: js.UndefOr[Boolean] = js.undefined,
    inputFormatter: js.Array[js.Function0[Unit] | Null] = null,
    outputFormatter: () => Unit = null,
    params: js.UndefOr[Double] = js.undefined,
    transformPayload: () => Unit = null
  ): Method = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (abiCoder != null) __obj.updateDynamic("abiCoder")(abiCoder.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultAccount)) __obj.updateDynamic("defaultAccount")(defaultAccount.asInstanceOf[js.Any])
    if (defaultBlock != null) __obj.updateDynamic("defaultBlock")(defaultBlock.asInstanceOf[js.Any])
    if (extraFormatters != null) __obj.updateDynamic("extraFormatters")(extraFormatters.asInstanceOf[js.Any])
    if (!js.isUndefined(handleRevert)) __obj.updateDynamic("handleRevert")(handleRevert.get.asInstanceOf[js.Any])
    if (inputFormatter != null) __obj.updateDynamic("inputFormatter")(inputFormatter.asInstanceOf[js.Any])
    if (outputFormatter != null) __obj.updateDynamic("outputFormatter")(js.Any.fromFunction0(outputFormatter))
    if (!js.isUndefined(params)) __obj.updateDynamic("params")(params.get.asInstanceOf[js.Any])
    if (transformPayload != null) __obj.updateDynamic("transformPayload")(js.Any.fromFunction0(transformPayload))
    __obj.asInstanceOf[Method]
  }
}

