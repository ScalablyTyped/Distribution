package typings.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Allowed extends js.Object {
  var allowed: Boolean = js.native
}

object Allowed {
  @scala.inline
  def apply(allowed: Boolean): Allowed = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowed]
  }
  @scala.inline
  implicit class AllowedOps[Self <: Allowed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowed(value: Boolean): Self = this.set("allowed", value.asInstanceOf[js.Any])
  }
  
}

