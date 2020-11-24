package typings.vegaTypings.anon

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.transformMod.FieldRef
import typings.vegaTypings.vegaTypingsStrings.contour
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bandwidth extends js.Object {
  
  var bandwidth: js.UndefOr[Double | SignalRef] = js.native
  
  var cellSize: js.UndefOr[Double | SignalRef] = js.native
  
  var signal: js.UndefOr[String] = js.native
  
  var size: (js.Array[Double | SignalRef]) | SignalRef = js.native
  
  var `type`: contour = js.native
  
   // TODO: change to Vector2<number | SignalRef> after https://github.com/Microsoft/TypeScript/issues/28017 has been fixed
  var values: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.native
  
  var x: js.UndefOr[FieldRef] = js.native
  
  var y: js.UndefOr[FieldRef] = js.native
}
object Bandwidth {
  
  @scala.inline
  def apply(size: (js.Array[Double | SignalRef]) | SignalRef, `type`: contour): Bandwidth = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bandwidth]
  }
  
  @scala.inline
  implicit class BandwidthOps[Self <: Bandwidth] (val x: Self) extends AnyVal {
    
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
    def setSizeVarargs(value: (Double | SignalRef)*): Self = this.set("size", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: (js.Array[Double | SignalRef]) | SignalRef): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: contour): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidth(value: Double | SignalRef): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandwidth: Self = this.set("bandwidth", js.undefined)
    
    @scala.inline
    def setCellSize(value: Double | SignalRef): Self = this.set("cellSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellSize: Self = this.set("cellSize", js.undefined)
    
    @scala.inline
    def setSignal(value: String): Self = this.set("signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: (Double | SignalRef)*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: (js.Array[Double | SignalRef]) | SignalRef): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    
    @scala.inline
    def setX(value: FieldRef): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: FieldRef): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
