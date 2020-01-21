package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessageStack extends js.Object {
  var message: String
  var stack: String
}

object AnonMessageStack {
  @scala.inline
  def apply(message: String, stack: String): AnonMessageStack = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMessageStack]
  }
}

