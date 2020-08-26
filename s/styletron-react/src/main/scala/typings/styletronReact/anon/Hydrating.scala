package typings.styletronReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hydrating extends js.Object {
  var hydrating: Boolean = js.native
}

object Hydrating {
  @scala.inline
  def apply(hydrating: Boolean): Hydrating = {
    val __obj = js.Dynamic.literal(hydrating = hydrating.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hydrating]
  }
  @scala.inline
  implicit class HydratingOps[Self <: Hydrating] (val x: Self) extends AnyVal {
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
    def setHydrating(value: Boolean): Self = this.set("hydrating", value.asInstanceOf[js.Any])
  }
  
}

