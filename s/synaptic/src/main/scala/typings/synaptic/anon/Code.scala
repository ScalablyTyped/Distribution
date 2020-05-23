package typings.synaptic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var code: String
  var link: String
}

object Code {
  @scala.inline
  def apply(code: String, link: String): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

