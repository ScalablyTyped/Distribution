package typings.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the ShuffleEnabledChangeRequested event. */
@js.native
trait ShuffleEnabledChangeRequestedEventArgs extends js.Object {
  
  /** Gets a value indicating whether the request is to enable or disable shuffle. */
  var requestedShuffleEnabled: Boolean = js.native
}
object ShuffleEnabledChangeRequestedEventArgs {
  
  @scala.inline
  def apply(requestedShuffleEnabled: Boolean): ShuffleEnabledChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(requestedShuffleEnabled = requestedShuffleEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShuffleEnabledChangeRequestedEventArgs]
  }
  
  @scala.inline
  implicit class ShuffleEnabledChangeRequestedEventArgsOps[Self <: ShuffleEnabledChangeRequestedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setRequestedShuffleEnabled(value: Boolean): Self = this.set("requestedShuffleEnabled", value.asInstanceOf[js.Any])
  }
}
