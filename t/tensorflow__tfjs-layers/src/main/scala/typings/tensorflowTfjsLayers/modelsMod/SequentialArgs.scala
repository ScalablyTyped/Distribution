package typings.tensorflowTfjsLayers.modelsMod

import typings.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequentialArgs extends js.Object {
  /** Stack of layers for the model. */
  var layers: js.UndefOr[js.Array[Layer]] = js.native
  /** The name of this model. */
  var name: js.UndefOr[String] = js.native
}

object SequentialArgs {
  @scala.inline
  def apply(): SequentialArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequentialArgs]
  }
  @scala.inline
  implicit class SequentialArgsOps[Self <: SequentialArgs] (val x: Self) extends AnyVal {
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
    def setLayersVarargs(value: Layer*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: js.Array[Layer]): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

