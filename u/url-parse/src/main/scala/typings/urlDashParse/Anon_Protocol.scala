package typings.urlDashParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Protocol extends js.Object {
  var protocol: String
  var rest: String
  var slashes: Boolean
}

object Anon_Protocol {
  @scala.inline
  def apply(protocol: String, rest: String, slashes: Boolean): Anon_Protocol = {
    val __obj = js.Dynamic.literal(protocol = protocol, rest = rest, slashes = slashes)
  
    __obj.asInstanceOf[Anon_Protocol]
  }
}

