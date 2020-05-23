package typings.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Allowed extends js.Object {
  var allowed: Boolean
}

object Allowed {
  @scala.inline
  def apply(allowed: Boolean): Allowed = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowed]
  }
}

