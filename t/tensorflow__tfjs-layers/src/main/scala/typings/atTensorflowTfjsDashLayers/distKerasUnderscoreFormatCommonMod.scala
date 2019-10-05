package typings.atTensorflowTfjsDashLayers

import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.temporal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/keras_format/common", JSImport.Namespace)
@js.native
object distKerasUnderscoreFormatCommonMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.sum
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.mul
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.concat
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.ave
  */
  trait BidirectionalMergeMode extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.channelsFirst
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.channelsLast
  */
  trait DataFormat extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.channels_first
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.channels_last
  */
  trait DataFormatSerialization extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.float32
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.int32
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.bool
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.complex64
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.string
  */
  trait DataType extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.valid
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.same
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.causal
  */
  trait PaddingMode extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.max
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.avg
  */
  trait PoolMode extends js.Object
  
  val VALID_BIDIRECTIONAL_MERGE_MODES: js.Array[String] = js.native
  val VALID_DATA_FORMAT_VALUES: js.Array[String] = js.native
  val VALID_PADDING_MODE_VALUES: js.Array[String] = js.native
  val VALID_POOL_MODE_VALUES: js.Array[String] = js.native
  val VALID_SAMPLE_WEIGHT_MODES: js.Array[String] = js.native
  type SampleWeightMode = temporal
  type Shape = js.Array[Null | Double]
}

