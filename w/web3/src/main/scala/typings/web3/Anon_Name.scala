package typings.web3

import typings.web3.ethAbiMod.ABIDataTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  var `type`: ABIDataTypes
}

object Anon_Name {
  @scala.inline
  def apply(name: String, `type`: ABIDataTypes): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Name]
  }
}

