package typings.tensorflowTfjsLayers.convolutionalRecurrentMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.recurrentMod.RNN_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base class for convolutional-recurrent layers.
  */
@js.native
trait ConvRNN2D extends RNN_ {
  
  @JSName("cell")
  val cell_ConvRNN2D: ConvRNN2DCell = js.native
  
  def computeOutputShape(inputShape: Shape): Shape | js.Array[Shape] = js.native
  
  /* protected */ def computeSingleOutputShape(inputShape: Shape): Shape = js.native
}
