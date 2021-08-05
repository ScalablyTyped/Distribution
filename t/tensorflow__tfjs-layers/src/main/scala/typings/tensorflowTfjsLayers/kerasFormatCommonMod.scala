package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.temporal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kerasFormatCommonMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/common", "VALID_BIDIRECTIONAL_MERGE_MODES")
  @js.native
  val VALID_BIDIRECTIONAL_MERGE_MODES: js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/common", "VALID_DATA_FORMAT_VALUES")
  @js.native
  val VALID_DATA_FORMAT_VALUES: js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/common", "VALID_PADDING_MODE_VALUES")
  @js.native
  val VALID_PADDING_MODE_VALUES: js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/common", "VALID_POOL_MODE_VALUES")
  @js.native
  val VALID_POOL_MODE_VALUES: js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/common", "VALID_SAMPLE_WEIGHT_MODES")
  @js.native
  val VALID_SAMPLE_WEIGHT_MODES: js.Array[String] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sum
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mul
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.concat
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ave
  */
  trait BidirectionalMergeMode extends StObject
  object BidirectionalMergeMode {
    
    inline def ave: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ave = "ave".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ave]
    
    inline def concat: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.concat = "concat".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.concat]
    
    inline def mul: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mul = "mul".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mul]
    
    inline def sum: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sum = "sum".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sum]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channelsFirst
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channelsLast
  */
  trait DataFormat extends StObject
  object DataFormat {
    
    inline def channelsFirst: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channelsFirst = "channelsFirst".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channelsFirst]
    
    inline def channelsLast: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channelsLast = "channelsLast".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channelsLast]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channels_first
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channels_last
  */
  trait DataFormatSerialization extends StObject
  object DataFormatSerialization {
    
    inline def channels_first: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channels_first = "channels_first".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channels_first]
    
    inline def channels_last: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channels_last = "channels_last".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channels_last]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.float32
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int32
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bool
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.complex64
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.string
  */
  trait DataType extends StObject
  object DataType {
    
    inline def bool: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bool = "bool".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bool]
    
    inline def complex64: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.complex64 = "complex64".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.complex64]
    
    inline def float32: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.float32 = "float32".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.float32]
    
    inline def int32: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int32 = "int32".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int32]
    
    inline def string: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.string = "string".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.string]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.valid
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.same
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.causal
  */
  trait PaddingMode extends StObject
  object PaddingMode {
    
    inline def causal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.causal = "causal".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.causal]
    
    inline def same: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.same = "same".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.same]
    
    inline def valid: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.valid = "valid".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.valid]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.max
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.avg
  */
  trait PoolMode extends StObject
  object PoolMode {
    
    inline def avg: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.avg = "avg".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.avg]
    
    inline def max: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.max = "max".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.max]
  }
  
  type SampleWeightMode = temporal
  
  type Shape = js.Array[Null | Double]
}
