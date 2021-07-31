package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.loess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoessTransform
  extends StObject
     with _Transforms {
  
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.undefined
  
  var bandwidth: js.UndefOr[Double | SignalRef] = js.undefined
  
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
  
  var `type`: loess
  
  var x: FieldRef
  
  var y: FieldRef
}
object LoessTransform {
  
  @scala.inline
  def apply(x: FieldRef, y: FieldRef): LoessTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("loess")
    __obj.asInstanceOf[LoessTransform]
  }
  
  @scala.inline
  implicit class LoessTransformMutableBuilder[Self <: LoessTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: (Vector2[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setBandwidth(value: Double | SignalRef): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    @scala.inline
    def setGroupby(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    @scala.inline
    def setGroupbyVarargs(value: FieldRef*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    @scala.inline
    def setType(value: loess): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: FieldRef): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: FieldRef): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
