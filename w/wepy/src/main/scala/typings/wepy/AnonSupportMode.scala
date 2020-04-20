package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSupportMode extends js.Object {
  var supportMode: js.Array[String]
}

object AnonSupportMode {
  @scala.inline
  def apply(supportMode: js.Array[String]): AnonSupportMode = {
    val __obj = js.Dynamic.literal(supportMode = supportMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSupportMode]
  }
}

