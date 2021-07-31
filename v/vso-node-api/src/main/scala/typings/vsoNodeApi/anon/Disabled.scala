package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabled extends StObject {
  
  var disabled: scala.Double
  
  var enabled: scala.Double
  
  var paused: scala.Double
}
object Disabled {
  
  @scala.inline
  def apply(disabled: scala.Double, enabled: scala.Double, paused: scala.Double): Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
  
  @scala.inline
  implicit class DisabledMutableBuilder[Self <: Disabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: scala.Double): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: scala.Double): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaused(value: scala.Double): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
  }
}
