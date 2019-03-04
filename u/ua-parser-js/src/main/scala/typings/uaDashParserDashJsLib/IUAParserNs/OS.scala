package typings
package uaDashParserDashJsLib.IUAParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OS extends js.Object {
  var NAME: java.lang.String
  var VERSION: java.lang.String
}

object OS {
  @scala.inline
  def apply(NAME: java.lang.String, VERSION: java.lang.String): OS = {
    val __obj = js.Dynamic.literal(NAME = NAME, VERSION = VERSION)
  
    __obj.asInstanceOf[OS]
  }
}

