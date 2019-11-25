package typings.uaDashParserDashJs.IUAParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BROWSER extends js.Object {
  /**
    * @deprecated
    */
  var MAJOR: String
  var NAME: String
  var VERSION: String
}

object BROWSER {
  @scala.inline
  def apply(MAJOR: String, NAME: String, VERSION: String): BROWSER = {
    val __obj = js.Dynamic.literal(MAJOR = MAJOR.asInstanceOf[js.Any], NAME = NAME.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BROWSER]
  }
}

