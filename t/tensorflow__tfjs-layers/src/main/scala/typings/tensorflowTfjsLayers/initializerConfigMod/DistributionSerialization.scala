package typings.tensorflowTfjsLayers.initializerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncated_normal
*/
trait DistributionSerialization extends js.Object

object DistributionSerialization {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def normal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal = this.cast("normal")
  @scala.inline
  def truncated_normal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncated_normal = this.cast("truncated_normal")
  @scala.inline
  def uniform: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform = this.cast("uniform")
}

