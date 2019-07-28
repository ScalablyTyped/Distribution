package typings.uaDashParserDashJs.IUAParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OS extends js.Object {
  var NAME: String
  var VERSION: String
}

object OS {
  @scala.inline
  def apply(NAME: String, VERSION: String): OS = {
    val __obj = js.Dynamic.literal(NAME = NAME, VERSION = VERSION)
  
    __obj.asInstanceOf[OS]
  }
}

