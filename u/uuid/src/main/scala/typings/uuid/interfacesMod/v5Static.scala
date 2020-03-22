package typings.uuid.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait v5Static extends js.Object {
  // https://github.com/uuidjs/uuid/blob/master/src/v35.js#L22
  var DNS: String
  // https://github.com/uuidjs/uuid/blob/master/src/v35.js#L23
  var URL: String
}

object v5Static {
  @scala.inline
  def apply(DNS: String, URL: String): v5Static = {
    val __obj = js.Dynamic.literal(DNS = DNS.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[v5Static]
  }
}

