package typings.twineSugarcube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Controls extends js.Object {
  
  /**
    * Determines whether the story's history controls (Backward, Jump To, & Forward buttons) are enabled within the UI bar.
    * @default true
    * @since 2.0.0
    * @example
    * Config.history.controls = false;
    */
  var controls: Boolean = js.native
  
  /**
    * Sets the maximum number of states (moments) to which the history is allowed to grow. Should the history exceed the limit,
    * states will be dropped from the past (oldest first). A setting of 0 means that there is no limit to how large the history
    * may grow, though doing so is not recommended.
    * @default 100
    * @since 2.0.0
    * @example
    * // No history limit (you should never do this!)
    * Config.history.maxStates = 0;
    * // Limit the history to a single state
    * Config.history.maxStates = 1;
    * // Limit the history to 150 states
    * Config.history.maxStates = 150;
    */
  var maxStates: Double = js.native
}
object Controls {
  
  @scala.inline
  def apply(controls: Boolean, maxStates: Double): Controls = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], maxStates = maxStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Controls]
  }
  
  @scala.inline
  implicit class ControlsOps[Self <: Controls] (val x: Self) extends AnyVal {
    
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
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxStates(value: Double): Self = this.set("maxStates", value.asInstanceOf[js.Any])
  }
}
