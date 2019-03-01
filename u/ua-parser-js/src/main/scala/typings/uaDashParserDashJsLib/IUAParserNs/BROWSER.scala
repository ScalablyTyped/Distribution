package typings
package uaDashParserDashJsLib.IUAParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BROWSER extends js.Object {
  /**
    * @deprecated
    */
  var MAJOR: java.lang.String
  var NAME: java.lang.String
  var VERSION: java.lang.String
}

object BROWSER {
  @scala.inline
  def apply(MAJOR: java.lang.String, NAME: java.lang.String, VERSION: java.lang.String): BROWSER = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MAJOR")(MAJOR)
    __obj.updateDynamic("NAME")(NAME)
    __obj.updateDynamic("VERSION")(VERSION)
    __obj.asInstanceOf[BROWSER]
  }
}

