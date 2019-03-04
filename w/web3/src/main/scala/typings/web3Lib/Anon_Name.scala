package typings
package web3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var `type`: web3Lib.ethAbiMod.ABIDataTypes
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, `type`: web3Lib.ethAbiMod.ABIDataTypes): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Name]
  }
}

