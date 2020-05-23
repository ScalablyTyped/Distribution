package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsLimit extends js.Object {
  var options: Limit
}

object OptionsLimit {
  @scala.inline
  def apply(options: Limit): OptionsLimit = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsLimit]
  }
}

