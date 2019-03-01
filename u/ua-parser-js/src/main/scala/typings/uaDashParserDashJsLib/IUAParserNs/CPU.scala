package typings
package uaDashParserDashJsLib.IUAParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CPU extends js.Object {
  var ARCHITECTURE: java.lang.String
}

object CPU {
  @scala.inline
  def apply(ARCHITECTURE: java.lang.String): CPU = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ARCHITECTURE")(ARCHITECTURE)
    __obj.asInstanceOf[CPU]
  }
}

