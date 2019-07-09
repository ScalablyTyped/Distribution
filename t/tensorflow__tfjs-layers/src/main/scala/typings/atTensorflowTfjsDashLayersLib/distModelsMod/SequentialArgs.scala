package typings
package atTensorflowTfjsDashLayersLib.distModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequentialArgs extends js.Object {
  /** Stack of layers for the model. */
  var layers: js.UndefOr[js.Array[atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer]] = js.undefined
  /** The name of this model. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object SequentialArgs {
  @scala.inline
  def apply(
    layers: js.Array[atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer] = null,
    name: java.lang.String = null
  ): SequentialArgs = {
    val __obj = js.Dynamic.literal()
    if (layers != null) __obj.updateDynamic("layers")(layers)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SequentialArgs]
  }
}

