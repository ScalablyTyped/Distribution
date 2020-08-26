package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.sample
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SampleTransform extends _Transforms {
  var size: Double | SignalRef = js.native
  var `type`: sample = js.native
}

object SampleTransform {
  @scala.inline
  def apply(size: Double | SignalRef, `type`: sample): SampleTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampleTransform]
  }
  @scala.inline
  implicit class SampleTransformOps[Self <: SampleTransform] (val x: Self) extends AnyVal {
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
    def setSize(value: Double | SignalRef): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: sample): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

