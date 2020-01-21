package typings.tensorflowTfjsLayers.initializerConfigMod

import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncatedNormal_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncatedNormal_
*/
trait Distribution extends js.Object

object Distribution {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def normal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal = this.cast("normal")
  @scala.inline
  def truncatedNormal: truncatedNormal_ = this.cast("truncatedNormal")
  @scala.inline
  def uniform: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform = this.cast("uniform")
}

