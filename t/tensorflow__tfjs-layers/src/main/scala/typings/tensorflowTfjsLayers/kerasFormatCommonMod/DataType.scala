package typings.tensorflowTfjsLayers.kerasFormatCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.float32
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int32
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bool
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.complex64
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.string
*/
trait DataType extends js.Object

object DataType {
  @scala.inline
  def bool: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bool = this.cast("bool")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complex64: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.complex64 = this.cast("complex64")
  @scala.inline
  def float32: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.float32 = this.cast("float32")
  @scala.inline
  def int32: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int32 = this.cast("int32")
  @scala.inline
  def string: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.string = this.cast("string")
}

