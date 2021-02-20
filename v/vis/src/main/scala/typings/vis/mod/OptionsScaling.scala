package typings.vis.mod

import typings.vis.anon.DrawThreshold
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsScaling extends StObject {
  
  var customScalingFunction: js.UndefOr[
    js.Function4[
      /* min */ js.UndefOr[Double], 
      /* max */ js.UndefOr[Double], 
      /* total */ js.UndefOr[Double], 
      /* value */ js.UndefOr[Double], 
      Double
    ]
  ] = js.native
  
  var label: js.UndefOr[Boolean | DrawThreshold] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
}
object OptionsScaling {
  
  @scala.inline
  def apply(): OptionsScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsScaling]
  }
  
  @scala.inline
  implicit class OptionsScalingMutableBuilder[Self <: OptionsScaling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomScalingFunction(
      value: (/* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double], /* total */ js.UndefOr[Double], /* value */ js.UndefOr[Double]) => Double
    ): Self = StObject.set(x, "customScalingFunction", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCustomScalingFunctionUndefined: Self = StObject.set(x, "customScalingFunction", js.undefined)
    
    @scala.inline
    def setLabel(value: Boolean | DrawThreshold): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
