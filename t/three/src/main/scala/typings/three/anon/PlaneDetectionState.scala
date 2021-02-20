package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaneDetectionState extends StObject {
  
  var planeDetectionState: js.UndefOr[EnabledBoolean] = js.native
}
object PlaneDetectionState {
  
  @scala.inline
  def apply(): PlaneDetectionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaneDetectionState]
  }
  
  @scala.inline
  implicit class PlaneDetectionStateMutableBuilder[Self <: PlaneDetectionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaneDetectionState(value: EnabledBoolean): Self = StObject.set(x, "planeDetectionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaneDetectionStateUndefined: Self = StObject.set(x, "planeDetectionState", js.undefined)
  }
}
