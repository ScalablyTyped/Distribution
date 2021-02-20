package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialInteractionSourceLocation extends StObject {
  
  var position: js.Any = js.native
  
  /* unmapped type */
  var velocity: js.Any = js.native
}
object SpatialInteractionSourceLocation {
  
  @scala.inline
  def apply(position: js.Any, velocity: js.Any): SpatialInteractionSourceLocation = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionSourceLocation]
  }
  
  @scala.inline
  implicit class SpatialInteractionSourceLocationMutableBuilder[Self <: SpatialInteractionSourceLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocity(value: js.Any): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
  }
}
