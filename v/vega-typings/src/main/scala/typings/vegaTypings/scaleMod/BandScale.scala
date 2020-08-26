package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.band
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BandScale
  extends BaseBandScale
     with Scale {
  var paddingInner: js.UndefOr[Double | SignalRef] = js.native
  @JSName("type")
  var type_BandScale: band = js.native
}

object BandScale {
  @scala.inline
  def apply(name: String, `type`: band): BandScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BandScale]
  }
  @scala.inline
  implicit class BandScaleOps[Self <: BandScale] (val x: Self) extends AnyVal {
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
    def setType(value: band): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingInner(value: Double | SignalRef): Self = this.set("paddingInner", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingInner: Self = this.set("paddingInner", js.undefined)
  }
  
}

