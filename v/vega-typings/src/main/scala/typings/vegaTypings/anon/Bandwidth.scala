package typings.vegaTypings.anon

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.transformMod.FieldRef
import typings.vegaTypings.vegaTypingsStrings.contour
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bandwidth extends StObject {
  
  var bandwidth: js.UndefOr[Double | SignalRef] = js.undefined
  
  var cellSize: js.UndefOr[Double | SignalRef] = js.undefined
  
  var signal: js.UndefOr[String] = js.undefined
  
  var size: (js.Array[Double | SignalRef]) | SignalRef
  
  var `type`: contour
  
  // TODO: change to Vector2<number | SignalRef> after https://github.com/Microsoft/TypeScript/issues/28017 has been fixed
  var values: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.undefined
  
  var x: js.UndefOr[FieldRef] = js.undefined
  
  var y: js.UndefOr[FieldRef] = js.undefined
}
object Bandwidth {
  
  @scala.inline
  def apply(size: (js.Array[Double | SignalRef]) | SignalRef): Bandwidth = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("contour")
    __obj.asInstanceOf[Bandwidth]
  }
  
  @scala.inline
  implicit class BandwidthMutableBuilder[Self <: Bandwidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandwidth(value: Double | SignalRef): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    @scala.inline
    def setCellSize(value: Double | SignalRef): Self = StObject.set(x, "cellSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellSizeUndefined: Self = StObject.set(x, "cellSize", js.undefined)
    
    @scala.inline
    def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setSize(value: (js.Array[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "size", js.Array(value :_*))
    
    @scala.inline
    def setType(value: contour): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: (js.Array[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "values", js.Array(value :_*))
    
    @scala.inline
    def setX(value: FieldRef): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: FieldRef): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
