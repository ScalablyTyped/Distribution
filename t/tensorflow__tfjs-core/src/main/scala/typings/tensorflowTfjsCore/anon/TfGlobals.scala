package typings.tensorflowTfjsCore.anon

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfGlobals extends js.Object {
  var _tfGlobals: Map[String, _] = js.native
}

object TfGlobals {
  @scala.inline
  def apply(_tfGlobals: Map[String, _]): TfGlobals = {
    val __obj = js.Dynamic.literal(_tfGlobals = _tfGlobals.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfGlobals]
  }
  @scala.inline
  implicit class TfGlobalsOps[Self <: TfGlobals] (val x: Self) extends AnyVal {
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
    def set_tfGlobals(value: Map[String, _]): Self = this.set("_tfGlobals", value.asInstanceOf[js.Any])
  }
  
}

