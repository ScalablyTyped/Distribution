package typings.switchery.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Node
import typings.switchery.mod.Switchery.Options
import typings.switchery.mod.Switchery.SwitcheryStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("switchery", JSImport.Default)
@js.native
class default protected () extends Switchery {
  def this(node: Node) = this()
  def this(node: Node, options: Options) = this()
  /**
    * Unbinding all event handlers attached to the switch element to prepare the object for garbage collection.
    * @returns {void}
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Disable switch by unbinding attached events and changing opacity to disabledOpacity value
    * @returns {void}
    */
  /* CompleteClass */
  override def disable(): Unit = js.native
  /**
    * Enable disabled switch by re-adding event handlers and changing the opacity to 1.
    * @returns {void}
    */
  /* CompleteClass */
  override def enable(): Unit = js.native
  /**
    * Check if switch is currently disabled by checking the readonly and disabled attributes on the checkbox and the disabled option set via JS.
    *  If any of those are present, the returned value is true.
    * @returns {boolean} whether it's disabled or not.
    */
  /* CompleteClass */
  override def isDisabled(): Boolean = js.native
}

@JSImport("switchery", JSImport.Default)
@js.native
object default extends TopLevel[SwitcheryStatic]

