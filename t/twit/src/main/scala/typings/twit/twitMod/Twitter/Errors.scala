package typings.twit.twitMod.Twitter

import typings.twit.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var errors: js.Array[Anon_Code]
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[Anon_Code]): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Errors]
  }
}

