package typings.tensorflowTfjsLayers.initializerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanIn
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanOut
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanAvg
*/
trait FanMode extends js.Object

object FanMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fanAvg: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanAvg = this.cast("fanAvg")
  @scala.inline
  def fanIn: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanIn = this.cast("fanIn")
  @scala.inline
  def fanOut: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanOut = this.cast("fanOut")
}

