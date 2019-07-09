package typings
package atTensorflowTfjsDashLayersLib.distLayersPoolingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def pool2d(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    poolSize: js.Tuple2[scala.Double, scala.Double]
  ): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def pool2d(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    poolSize: js.Tuple2[scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double]
  ): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def pool2d(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    poolSize: js.Tuple2[scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    padding: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.PaddingMode
  ): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def pool2d(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    poolSize: js.Tuple2[scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    padding: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.PaddingMode,
    dataFormat: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.DataFormat
  ): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def pool2d(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    poolSize: js.Tuple2[scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    padding: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.PaddingMode,
    dataFormat: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.DataFormat,
    poolMode: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.PoolMode
  ): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
}

