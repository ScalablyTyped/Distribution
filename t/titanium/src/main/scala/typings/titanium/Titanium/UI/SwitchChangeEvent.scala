package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the switch value changes.
  */
@js.native
trait SwitchChangeEvent extends SwitchBaseEvent {
  
  /**
    * New value of the switch.
    */
  var value: Boolean = js.native
}
object SwitchChangeEvent {
  
  @scala.inline
  def apply(source: Switch, value: Boolean): SwitchChangeEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchChangeEvent]
  }
  
  @scala.inline
  implicit class SwitchChangeEventMutableBuilder[Self <: SwitchChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
