package typings.tensorflowTfjsCore.anon

import typings.std.ArrayBuffer
import typings.tensorflowTfjsCore.typesMod.WeightsManifestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var data: ArrayBuffer = js.native
  var specs: js.Array[WeightsManifestEntry] = js.native
}

object Data {
  @scala.inline
  def apply(data: ArrayBuffer, specs: js.Array[WeightsManifestEntry]): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
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
    def setData(value: ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecsVarargs(value: WeightsManifestEntry*): Self = this.set("specs", js.Array(value :_*))
    @scala.inline
    def setSpecs(value: js.Array[WeightsManifestEntry]): Self = this.set("specs", value.asInstanceOf[js.Any])
  }
  
}

