package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.independent
import typings.vegaTypings.vegaTypingsStrings.isocontour
import typings.vegaTypings.vegaTypingsStrings.shared
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsocontourTransform extends _Transforms {
  
  var as: js.UndefOr[String | Null | SignalRef] = js.native
  
  var field: js.UndefOr[String | TransformField] = js.native
  
  var levels: js.UndefOr[Double | SignalRef] = js.native
  
  var nice: js.UndefOr[Boolean | SignalRef] = js.native
  
  var resolve: js.UndefOr[shared | independent | SignalRef] = js.native
  
  var scale: js.UndefOr[Double | TransformField] = js.native
  
  var smooth: js.UndefOr[Boolean | SignalRef] = js.native
  
  var thresholds: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.native
  
  var translate: js.UndefOr[js.Array[Double] | TransformField] = js.native
  
  var `type`: isocontour = js.native
  
  var zero: js.UndefOr[Boolean | SignalRef] = js.native
}
object IsocontourTransform {
  
  @scala.inline
  def apply(`type`: isocontour): IsocontourTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsocontourTransform]
  }
  
  @scala.inline
  implicit class IsocontourTransformMutableBuilder[Self <: IsocontourTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: String | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsNull: Self = StObject.set(x, "as", null)
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setField(value: String | TransformField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setLevels(value: Double | SignalRef): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    @scala.inline
    def setNice(value: Boolean | SignalRef): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
    
    @scala.inline
    def setResolve(value: shared | independent | SignalRef): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    @scala.inline
    def setScale(value: Double | TransformField): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setSmooth(value: Boolean | SignalRef): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    
    @scala.inline
    def setThresholds(value: (js.Array[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdsUndefined: Self = StObject.set(x, "thresholds", js.undefined)
    
    @scala.inline
    def setThresholdsVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "thresholds", js.Array(value :_*))
    
    @scala.inline
    def setTranslate(value: js.Array[Double] | TransformField): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    @scala.inline
    def setTranslateVarargs(value: Double*): Self = StObject.set(x, "translate", js.Array(value :_*))
    
    @scala.inline
    def setType(value: isocontour): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZero(value: Boolean | SignalRef): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
  }
}
