package typings.twit.mod.Twitter

import typings.twit.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var errors: js.Array[Code]
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[Code]): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

