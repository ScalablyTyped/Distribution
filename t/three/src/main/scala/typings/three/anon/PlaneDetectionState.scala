package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaneDetectionState extends StObject {
  
  var planeDetectionState: js.UndefOr[EnabledBoolean] = js.undefined
}
object PlaneDetectionState {
  
  inline def apply(): PlaneDetectionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaneDetectionState]
  }
  
  extension [Self <: PlaneDetectionState](x: Self) {
    
    inline def setPlaneDetectionState(value: EnabledBoolean): Self = StObject.set(x, "planeDetectionState", value.asInstanceOf[js.Any])
    
    inline def setPlaneDetectionStateUndefined: Self = StObject.set(x, "planeDetectionState", js.undefined)
  }
}
