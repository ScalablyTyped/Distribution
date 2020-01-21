package typings.tensorflowTfjsLayers.kerasFormatCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.valid
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.same
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.causal
*/
trait PaddingMode extends js.Object

object PaddingMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def causal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.causal = this.cast("causal")
  @scala.inline
  def same: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.same = this.cast("same")
  @scala.inline
  def valid: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.valid = this.cast("valid")
}

