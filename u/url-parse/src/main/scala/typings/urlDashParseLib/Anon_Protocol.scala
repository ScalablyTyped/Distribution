package typings
package urlDashParseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Protocol extends js.Object {
  var protocol: java.lang.String
  var rest: java.lang.String
  var slashes: scala.Boolean
}

object Anon_Protocol {
  @scala.inline
  def apply(protocol: java.lang.String, rest: java.lang.String, slashes: scala.Boolean): Anon_Protocol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("protocol")(protocol)
    __obj.updateDynamic("rest")(rest)
    __obj.updateDynamic("slashes")(slashes)
    __obj.asInstanceOf[Anon_Protocol]
  }
}

