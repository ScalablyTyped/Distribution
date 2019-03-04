package typings
package uaDashParserDashJsLib.IUAParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ENGINE extends js.Object {
  var NAME: java.lang.String
  var VERSION: java.lang.String
}

object ENGINE {
  @scala.inline
  def apply(NAME: java.lang.String, VERSION: java.lang.String): ENGINE = {
    val __obj = js.Dynamic.literal(NAME = NAME, VERSION = VERSION)
  
    __obj.asInstanceOf[ENGINE]
  }
}

