package typings.web3DashUtils.web3DashUtilsMod

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
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (components != null) __obj.updateDynamic("components")(components)
    if (internalType != null) __obj.updateDynamic("internalType")(internalType)
    __obj.asInstanceOf[AbiOutput]
  }
}

