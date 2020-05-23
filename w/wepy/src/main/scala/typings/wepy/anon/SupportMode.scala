package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportMode extends js.Object {
  var supportMode: js.Array[String]
}

object SupportMode {
  @scala.inline
  def apply(supportMode: js.Array[String]): SupportMode = {
    val __obj = js.Dynamic.literal(supportMode = supportMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportMode]
  }
}

