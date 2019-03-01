package typings
package web3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Indexed extends js.Object {
  var indexed: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var `type`: web3Lib.ethAbiMod.ABIDataTypes
}

object Anon_Indexed {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: web3Lib.ethAbiMod.ABIDataTypes,
    indexed: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Indexed = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name)
    if (!js.isUndefined(indexed)) __obj.updateDynamic("indexed")(indexed)
    __obj.asInstanceOf[Anon_Indexed]
  }
}

