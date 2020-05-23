package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancel extends js.Object {
  var cancel: scala.Double
  var publish: scala.Double
}

object Cancel {
  @scala.inline
  def apply(cancel: scala.Double, publish: scala.Double): Cancel = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], publish = publish.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
}

