package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MousewheelOptions extends StObject {
  
  var eventsTarged: js.UndefOr[SelectableElement] = js.native
  
  var forceToAxis: js.UndefOr[Boolean] = js.native
  
  var invert: js.UndefOr[Boolean] = js.native
  
  var releaseOnEdges: js.UndefOr[Boolean] = js.native
  
  var sensitivity: js.UndefOr[Double] = js.native
}
object MousewheelOptions {
  
  @scala.inline
  def apply(): MousewheelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MousewheelOptions]
  }
  
  @scala.inline
  implicit class MousewheelOptionsMutableBuilder[Self <: MousewheelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventsTarged(value: SelectableElement): Self = StObject.set(x, "eventsTarged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsTargedUndefined: Self = StObject.set(x, "eventsTarged", js.undefined)
    
    @scala.inline
    def setForceToAxis(value: Boolean): Self = StObject.set(x, "forceToAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceToAxisUndefined: Self = StObject.set(x, "forceToAxis", js.undefined)
    
    @scala.inline
    def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
    
    @scala.inline
    def setReleaseOnEdges(value: Boolean): Self = StObject.set(x, "releaseOnEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseOnEdgesUndefined: Self = StObject.set(x, "releaseOnEdges", js.undefined)
    
    @scala.inline
    def setSensitivity(value: Double): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
  }
}
