package typings.uaDashParserDashJs.IUAParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ENGINE extends js.Object {
  var NAME: String
  var VERSION: String
}

object ENGINE {
  @scala.inline
  def apply(NAME: String, VERSION: String): ENGINE = {
    val __obj = js.Dynamic.literal(NAME = NAME, VERSION = VERSION)
  
    __obj.asInstanceOf[ENGINE]
  }
}

