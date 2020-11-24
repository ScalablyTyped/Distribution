package typings.winrtUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the PositionChanged event. */
@js.native
trait PositionChangedEventArgs extends js.Object {
  
  /** The location data associated with the PositionChanged event. */
  var position: Geoposition = js.native
}
object PositionChangedEventArgs {
  
  @scala.inline
  def apply(position: Geoposition): PositionChangedEventArgs = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionChangedEventArgs]
  }
  
  @scala.inline
  implicit class PositionChangedEventArgsOps[Self <: PositionChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPosition(value: Geoposition): Self = this.set("position", value.asInstanceOf[js.Any])
  }
}
