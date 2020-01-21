package typings.tensorflowTfjsLayers.kerasFormatCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channels_first
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channels_last
*/
trait DataFormatSerialization extends js.Object

object DataFormatSerialization {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def channels_first: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channels_first = this.cast("channels_first")
  @scala.inline
  def channels_last: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channels_last = this.cast("channels_last")
}

