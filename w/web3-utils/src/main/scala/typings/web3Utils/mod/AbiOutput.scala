package typings.web3Utils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbiOutput extends js.Object {
  var components: js.UndefOr[js.Array[AbiOutput]] = js.undefined
  var internalType: js.UndefOr[String] = js.undefined
  var name: String
  var `type`: String
}

object AbiOutput {
  @scala.inline
  def apply(name: String, `type`: String, components: js.Array[AbiOutput] = null, internalType: String = null): AbiOutput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (internalType != null) __obj.updateDynamic("internalType")(internalType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbiOutput]
  }
}

