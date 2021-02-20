package typings.viewportMercatorProject.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectionParametersInput extends StObject {
  
  var altitude: js.UndefOr[Double] = js.native
  
  var farZMultiplier: js.UndefOr[Double] = js.native
  
  var height: Double = js.native
  
  var nearZMultiplier: js.UndefOr[Double] = js.native
  
  var pitch: js.UndefOr[Double] = js.native
  
  var width: Double = js.native
}
object ProjectionParametersInput {
  
  @scala.inline
  def apply(height: Double, width: Double): ProjectionParametersInput = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectionParametersInput]
  }
  
  @scala.inline
  implicit class ProjectionParametersInputMutableBuilder[Self <: ProjectionParametersInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setFarZMultiplier(value: Double): Self = StObject.set(x, "farZMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFarZMultiplierUndefined: Self = StObject.set(x, "farZMultiplier", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearZMultiplier(value: Double): Self = StObject.set(x, "nearZMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearZMultiplierUndefined: Self = StObject.set(x, "nearZMultiplier", js.undefined)
    
    @scala.inline
    def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
