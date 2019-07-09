package typings
package atTensorflowTfjsDashCoreLib.distIoTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringWeightsManifestEntry extends WeightsManifestEntry {
  /**
    * Number of bytes used by the whole tensor, including the delimiters (N-1
    * delimiters for N strings).
    */
  var byteLength: scala.Double
  /**
    * Used for delimiting neighboring strings. If the tensor has no strings or
    * only 1 string, there will be no delimiter. If the tensor has N strings
    * (N>0), there will be N-1 delimiters.
    */
  var delimiter: java.lang.String
  @JSName("dtype")
  var dtype_StringWeightsManifestEntry: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string
}

object StringWeightsManifestEntry {
  @scala.inline
  def apply(
    byteLength: scala.Double,
    delimiter: java.lang.String,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string,
    name: java.lang.String,
    shape: js.Array[scala.Double],
    group: WeightGroup = null,
    quantization: atTensorflowTfjsDashCoreLib.Anon_Dtype = null
  ): StringWeightsManifestEntry = {
    val __obj = js.Dynamic.literal(byteLength = byteLength, delimiter = delimiter, dtype = dtype, name = name, shape = shape)
    if (group != null) __obj.updateDynamic("group")(group)
    if (quantization != null) __obj.updateDynamic("quantization")(quantization)
    __obj.asInstanceOf[StringWeightsManifestEntry]
  }
}

