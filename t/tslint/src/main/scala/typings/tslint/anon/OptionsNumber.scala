package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsNumber extends js.Object {
  var options: Double
}

object OptionsNumber {
  @scala.inline
  def apply(options: Double): OptionsNumber = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsNumber]
  }
}

