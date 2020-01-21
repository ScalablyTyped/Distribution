package typings.synaptic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  var code: String
  var link: String
}

object AnonCode {
  @scala.inline
  def apply(code: String, link: String): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCode]
  }
}

