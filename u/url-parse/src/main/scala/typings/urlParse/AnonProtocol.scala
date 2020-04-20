package typings.urlParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProtocol extends js.Object {
  var protocol: String
  var rest: String
  var slashes: Boolean
}

object AnonProtocol {
  @scala.inline
  def apply(protocol: String, rest: String, slashes: Boolean): AnonProtocol = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProtocol]
  }
}

