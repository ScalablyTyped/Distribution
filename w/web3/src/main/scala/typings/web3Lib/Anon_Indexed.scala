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
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(indexed)) __obj.updateDynamic("indexed")(indexed)
    __obj.asInstanceOf[Anon_Indexed]
  }
}

