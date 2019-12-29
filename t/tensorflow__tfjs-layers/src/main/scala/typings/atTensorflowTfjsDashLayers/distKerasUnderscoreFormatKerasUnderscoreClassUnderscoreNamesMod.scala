package typings.atTensorflowTfjsDashLayers

import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatConstraintUnderscoreConfigMod.ConstraintSerialization
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatInitializerUnderscoreConfigMod.InitializerSerialization
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatLayersLayerUnderscoreSerializationMod.LayerSerialization
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatOptimizerUnderscoreConfigMod.OptimizerSerialization
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatRegularizerUnderscoreConfigMod.RegularizerSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/keras_format/keras_class_names", JSImport.Namespace)
@js.native
object distKerasUnderscoreFormatKerasUnderscoreClassUnderscoreNamesMod extends js.Object {
  val kerasClassNames: js.Array[KerasClassName] = js.native
  type KerasClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/keras_class_names.KerasSerialization['class_name'] */ js.Any
  type KerasSerialization = LayerSerialization | ConstraintSerialization | InitializerSerialization | RegularizerSerialization | OptimizerSerialization
}

