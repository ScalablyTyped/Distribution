package typings
package switcheryLib.switcheryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("switchery", JSImport.Default)
@js.native
class default protected () extends Switchery {
  def this(node: stdLib.Node) = this()
  def this(node: stdLib.Node, options: switcheryLib.switcheryMod.SwitcheryNs.Options) = this()
  /**
    * Unbinding all event handlers attached to the switch element to prepare the object for garbage collection.
    * @returns {void}
    */
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /**
    * Disable switch by unbinding attached events and changing opacity to disabledOpacity value
    * @returns {void}
    */
  /* CompleteClass */
  override def disable(): scala.Unit = js.native
  /**
    * Enable disabled switch by re-adding event handlers and changing the opacity to 1.
    * @returns {void}
    */
  /* CompleteClass */
  override def enable(): scala.Unit = js.native
  /**
    * Check if switch is currently disabled by checking the readonly and disabled attributes on the checkbox and the disabled option set via JS.
    *  If any of those are present, the returned value is true.
    * @returns {boolean} whether it's disabled or not.
    */
  /* CompleteClass */
  override def isDisabled(): scala.Boolean = js.native
}

