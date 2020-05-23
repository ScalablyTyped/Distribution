package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsString extends js.Object {
  var options: String
}

object OptionsString {
  @scala.inline
  def apply(options: String): OptionsString = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsString]
  }
}

