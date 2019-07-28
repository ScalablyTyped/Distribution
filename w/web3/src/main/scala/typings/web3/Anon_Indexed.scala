package typings.web3

import typings.web3.ethAbiMod.ABIDataTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Indexed extends js.Object {
  var indexed: js.UndefOr[Boolean] = js.undefined
  var name: String
  var `type`: ABIDataTypes
}

object Anon_Indexed {
  @scala.inline
  def apply(name: String, `type`: ABIDataTypes, indexed: js.UndefOr[Boolean] = js.undefined): Anon_Indexed = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(indexed)) __obj.updateDynamic("indexed")(indexed)
    __obj.asInstanceOf[Anon_Indexed]
  }
}

