package typings.vegaTypings.anon

import typings.vegaTypings.encodeMod.ScaledValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scale
  extends ScaledValueRef[js.Any] {
  var scale: typings.vegaTypings.encodeMod.Field = js.native
  var value: Boolean | Double | String | Null = js.native
}

object Scale {
  @scala.inline
  def apply(scale: typings.vegaTypings.encodeMod.Field): Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  implicit class ScaleOps[Self <: Scale] (val x: Self) extends AnyVal {
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
    def setScale(value: typings.vegaTypings.encodeMod.Field): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Boolean | Double | String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

