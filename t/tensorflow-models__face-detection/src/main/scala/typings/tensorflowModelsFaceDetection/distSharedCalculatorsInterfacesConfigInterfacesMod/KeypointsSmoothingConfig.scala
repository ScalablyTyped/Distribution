package typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesConfigInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeypointsSmoothingConfig extends StObject {
  
  var oneEuroFilter: js.UndefOr[OneEuroFilterConfig] = js.undefined
  
  var velocityFilter: js.UndefOr[VelocityFilterConfig] = js.undefined
}
object KeypointsSmoothingConfig {
  
  inline def apply(): KeypointsSmoothingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeypointsSmoothingConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeypointsSmoothingConfig] (val x: Self) extends AnyVal {
    
    inline def setOneEuroFilter(value: OneEuroFilterConfig): Self = StObject.set(x, "oneEuroFilter", value.asInstanceOf[js.Any])
    
    inline def setOneEuroFilterUndefined: Self = StObject.set(x, "oneEuroFilter", js.undefined)
    
    inline def setVelocityFilter(value: VelocityFilterConfig): Self = StObject.set(x, "velocityFilter", value.asInstanceOf[js.Any])
    
    inline def setVelocityFilterUndefined: Self = StObject.set(x, "velocityFilter", js.undefined)
  }
}
