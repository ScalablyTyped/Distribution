package typings
package uuidLib.v5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait v5Static extends js.Object {
  // https://github.com/kelektiv/node-uuid/blob/master/v5.js#L47
  var DNS: java.lang.String
  // https://github.com/kelektiv/node-uuid/blob/master/v5.js#L48
  var URL: java.lang.String
}

object v5Static {
  @scala.inline
  def apply(DNS: java.lang.String, URL: java.lang.String): v5Static = {
    val __obj = js.Dynamic.literal(DNS = DNS, URL = URL)
  
    __obj.asInstanceOf[v5Static]
  }
}

