package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialInteractionSourceEventArgs extends StObject {
  
  var state: js.Any = js.native
}
object SpatialInteractionSourceEventArgs {
  
  @scala.inline
  def apply(state: js.Any): SpatialInteractionSourceEventArgs = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionSourceEventArgs]
  }
  
  @scala.inline
  implicit class SpatialInteractionSourceEventArgsMutableBuilder[Self <: SpatialInteractionSourceEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
