package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  var cancel: Double
  var publish: Double
}

object AnonCancel {
  @scala.inline
  def apply(cancel: Double, publish: Double): AnonCancel = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], publish = publish.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancel]
  }
}

