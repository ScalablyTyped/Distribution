package typings.typescriptServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rest extends js.Object {
  var rest: String
  var value: Double
}

object Rest {
  @scala.inline
  def apply(rest: String, value: Double): Rest = {
    val __obj = js.Dynamic.literal(rest = rest.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rest]
  }
}

