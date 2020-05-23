package typings.xummApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var code: Double
  var reference: String
}

object Code {
  @scala.inline
  def apply(code: Double, reference: String): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

