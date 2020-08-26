package typings.vegaTypings.anon

import typings.vegaTypings.encodeMod.ScaledValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Range
  extends ScaledValueRef[js.Any] {
  var range: Double | Boolean = js.native
  var scale: typings.vegaTypings.encodeMod.Field = js.native
}

object Range {
  @scala.inline
  def apply(range: Double | Boolean, scale: typings.vegaTypings.encodeMod.Field): Range = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  @scala.inline
  implicit class RangeOps[Self <: Range] (val x: Self) extends AnyVal {
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
    def setRange(value: Double | Boolean): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: typings.vegaTypings.encodeMod.Field): Self = this.set("scale", value.asInstanceOf[js.Any])
  }
  
}

