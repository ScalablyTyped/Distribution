package typings.tensorflowTfjsLayers.kerasFormatCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sum
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mul
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.concat
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ave
*/
trait BidirectionalMergeMode extends js.Object

object BidirectionalMergeMode {
  @scala.inline
  def ave: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ave = this.cast("ave")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def concat: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.concat = this.cast("concat")
  @scala.inline
  def mul: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mul = this.cast("mul")
  @scala.inline
  def sum: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sum = this.cast("sum")
}

