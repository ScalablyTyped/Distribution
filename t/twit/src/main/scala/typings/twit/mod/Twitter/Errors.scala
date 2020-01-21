package typings.twit.mod.Twitter

import typings.twit.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var errors: js.Array[AnonCode]
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[AnonCode]): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Errors]
  }
}

