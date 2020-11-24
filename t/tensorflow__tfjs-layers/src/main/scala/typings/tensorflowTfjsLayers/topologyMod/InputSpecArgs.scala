package typings.tensorflowTfjsLayers.topologyMod

import org.scalablytyped.runtime.NumberDictionary
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputSpecArgs extends js.Object {
  
  /** Dictionary mapping integer axes to a specific dimension value. */
  var axes: js.UndefOr[NumberDictionary[Double]] = js.native
  
  /** Expected datatype of the input. */
  var dtype: js.UndefOr[DataType] = js.native
  
  /** Maximum rank of the input. */
  var maxNDim: js.UndefOr[Double] = js.native
  
  /** Minimum rank of the input. */
  var minNDim: js.UndefOr[Double] = js.native
  
  /** Expected rank of the input. */
  var ndim: js.UndefOr[Double] = js.native
  
  /** Expected shape of the input (may include null for unchecked axes). */
  var shape: js.UndefOr[Shape] = js.native
}
object InputSpecArgs {
  
  @scala.inline
  def apply(): InputSpecArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSpecArgs]
  }
  
  @scala.inline
  implicit class InputSpecArgsOps[Self <: InputSpecArgs] (val x: Self) extends AnyVal {
    
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
    def setAxes(value: NumberDictionary[Double]): Self = this.set("axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    
    @scala.inline
    def setDtype(value: DataType): Self = this.set("dtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDtype: Self = this.set("dtype", js.undefined)
    
    @scala.inline
    def setMaxNDim(value: Double): Self = this.set("maxNDim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxNDim: Self = this.set("maxNDim", js.undefined)
    
    @scala.inline
    def setMinNDim(value: Double): Self = this.set("minNDim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinNDim: Self = this.set("minNDim", js.undefined)
    
    @scala.inline
    def setNdim(value: Double): Self = this.set("ndim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNdim: Self = this.set("ndim", js.undefined)
    
    @scala.inline
    def setShapeVarargs(value: (Null | Double)*): Self = this.set("shape", js.Array(value :_*))
    
    @scala.inline
    def setShape(value: Shape): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
  }
}
