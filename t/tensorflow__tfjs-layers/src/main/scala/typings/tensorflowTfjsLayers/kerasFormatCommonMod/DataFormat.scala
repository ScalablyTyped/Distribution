package typings.tensorflowTfjsLayers.kerasFormatCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channelsFirst
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channelsLast
*/
trait DataFormat extends js.Object

object DataFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def channelsFirst: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channelsFirst = this.cast("channelsFirst")
  @scala.inline
  def channelsLast: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channelsLast = this.cast("channelsLast")
}

