package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglTexUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextureData extends js.Object {
  var complexTensors: js.UndefOr[atTensorflowTfjsDashCoreLib.Anon_Imag] = js.undefined
  var dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  var isPacked: js.UndefOr[scala.Boolean] = js.undefined
  var shape: js.Array[scala.Double]
  var slice: js.UndefOr[atTensorflowTfjsDashCoreLib.Anon_FlatOffset] = js.undefined
  /** [rows, columns] shape of the texture. */
  var texShape: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var texture: js.UndefOr[stdLib.WebGLTexture] = js.undefined
  var usage: js.UndefOr[TextureUsage] = js.undefined
  var values: js.UndefOr[atTensorflowTfjsDashCoreLib.distTypesMod.BackendValues] = js.undefined
}

object TextureData {
  @scala.inline
  def apply(
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
    shape: js.Array[scala.Double],
    complexTensors: atTensorflowTfjsDashCoreLib.Anon_Imag = null,
    isPacked: js.UndefOr[scala.Boolean] = js.undefined,
    slice: atTensorflowTfjsDashCoreLib.Anon_FlatOffset = null,
    texShape: js.Tuple2[scala.Double, scala.Double] = null,
    texture: stdLib.WebGLTexture = null,
    usage: TextureUsage = null,
    values: atTensorflowTfjsDashCoreLib.distTypesMod.BackendValues = null
  ): TextureData = {
    val __obj = js.Dynamic.literal(dtype = dtype, shape = shape)
    if (complexTensors != null) __obj.updateDynamic("complexTensors")(complexTensors)
    if (!js.isUndefined(isPacked)) __obj.updateDynamic("isPacked")(isPacked)
    if (slice != null) __obj.updateDynamic("slice")(slice)
    if (texShape != null) __obj.updateDynamic("texShape")(texShape)
    if (texture != null) __obj.updateDynamic("texture")(texture)
    if (usage != null) __obj.updateDynamic("usage")(usage)
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureData]
  }
}

