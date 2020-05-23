package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsArray extends js.Object {
  var options: js.Array[String]
}

object OptionsArray {
  @scala.inline
  def apply(options: js.Array[String]): OptionsArray = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsArray]
  }
}

