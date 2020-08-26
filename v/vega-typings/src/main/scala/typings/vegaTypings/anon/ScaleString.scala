package typings.vegaTypings.anon

import typings.vegaTypings.onEventsMod._EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleString extends _EventListener {
  var scale: String = js.native
}

object ScaleString {
  @scala.inline
  def apply(scale: String): ScaleString = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleString]
  }
  @scala.inline
  implicit class ScaleStringOps[Self <: ScaleString] (val x: Self) extends AnyVal {
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
    def setScale(value: String): Self = this.set("scale", value.asInstanceOf[js.Any])
  }
  
}

