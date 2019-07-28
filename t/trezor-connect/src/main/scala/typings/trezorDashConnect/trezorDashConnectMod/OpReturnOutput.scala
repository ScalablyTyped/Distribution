package typings.trezorDashConnect.trezorDashConnectMod

import typings.trezorDashConnect.trezorDashConnectStrings.opreturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpReturnOutput extends Output {
  var dataHex: String
  var `type`: opreturn
}

object OpReturnOutput {
  @scala.inline
  def apply(dataHex: String, `type`: opreturn): OpReturnOutput = {
    val __obj = js.Dynamic.literal(dataHex = dataHex)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OpReturnOutput]
  }
}

