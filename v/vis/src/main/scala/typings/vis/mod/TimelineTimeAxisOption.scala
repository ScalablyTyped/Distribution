package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineTimeAxisOption extends StObject {
  
  var scale: js.UndefOr[TimelineTimeAxisScaleType] = js.native
  
  var step: js.UndefOr[Double] = js.native
}
object TimelineTimeAxisOption {
  
  @scala.inline
  def apply(): TimelineTimeAxisOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineTimeAxisOption]
  }
  
  @scala.inline
  implicit class TimelineTimeAxisOptionMutableBuilder[Self <: TimelineTimeAxisOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScale(value: TimelineTimeAxisScaleType): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
