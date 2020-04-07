package typings.tensorflowTfjsLayers.constraintConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/constraint_config.ConstraintSerialization['class_name'] */
/* Rewritten from type alias, can be one of: 
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxNorm
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.NonNeg
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UnitNorm
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MinMaxNorm
*/
trait ConstraintClassName extends js.Object

object ConstraintClassName {
  @scala.inline
  def MaxNorm: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxNorm = this.cast("MaxNorm")
  @scala.inline
  def MinMaxNorm: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MinMaxNorm = this.cast("MinMaxNorm")
  @scala.inline
  def NonNeg: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.NonNeg = this.cast("NonNeg")
  @scala.inline
  def UnitNorm: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UnitNorm = this.cast("UnitNorm")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

