package typings.uaDashParserDashJs.IUAParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CPU extends js.Object {
  var ARCHITECTURE: String
}

object CPU {
  @scala.inline
  def apply(ARCHITECTURE: String): CPU = {
    val __obj = js.Dynamic.literal(ARCHITECTURE = ARCHITECTURE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CPU]
  }
}

