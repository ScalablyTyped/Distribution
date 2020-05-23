package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: scala.Double
  var warning: scala.Double
}

object Error {
  @scala.inline
  def apply(error: scala.Double, warning: scala.Double): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

