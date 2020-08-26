package typings.vegaTypings.anon

import typings.vegaTypings.encodeMod.ScaledValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Band
  extends ScaledValueRef[js.Any] {
  var band: Boolean | Double = js.native
  var scale: typings.vegaTypings.encodeMod.Field = js.native
}

object Band {
  @scala.inline
  def apply(band: Boolean | Double, scale: typings.vegaTypings.encodeMod.Field): Band = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Band]
  }
  @scala.inline
  implicit class BandOps[Self <: Band] (val x: Self) extends AnyVal {
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
    def setBand(value: Boolean | Double): Self = this.set("band", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: typings.vegaTypings.encodeMod.Field): Self = this.set("scale", value.asInstanceOf[js.Any])
  }
  
}

