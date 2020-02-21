package typings.xummApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  var code: Double
  var reference: String
}

object AnonCode {
  @scala.inline
  def apply(code: Double, reference: String): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCode]
  }
}

