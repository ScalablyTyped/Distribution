package typings.web3DashEthDashIban.web3DashEthDashIbanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndirectOptions extends js.Object {
  var identifier: String
  var institution: String
}

object IndirectOptions {
  @scala.inline
  def apply(identifier: String, institution: String): IndirectOptions = {
    val __obj = js.Dynamic.literal(identifier = identifier, institution = institution)
  
    __obj.asInstanceOf[IndirectOptions]
  }
}

