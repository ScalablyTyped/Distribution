package typings.tensorflowTfjsLayers.noiseMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlphaDropoutArgs extends LayerArgs {
  
  /**
    * A 1-D `Tensor` of type `int32`, representing the
    * shape for randomly generated keep/drop flags.
    */
  var noiseShape: js.UndefOr[Shape] = js.native
  
  /** drop probability.  */
  var rate: Double = js.native
}
object AlphaDropoutArgs {
  
  @scala.inline
  def apply(rate: Double): AlphaDropoutArgs = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlphaDropoutArgs]
  }
  
  @scala.inline
  implicit class AlphaDropoutArgsOps[Self <: AlphaDropoutArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoiseShapeVarargs(value: (Null | Double)*): Self = this.set("noiseShape", js.Array(value :_*))
    
    @scala.inline
    def setNoiseShape(value: Shape): Self = this.set("noiseShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoiseShape: Self = this.set("noiseShape", js.undefined)
  }
}
