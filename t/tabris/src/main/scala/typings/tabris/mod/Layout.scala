package typings.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Layout")
@js.native
class Layout protected () extends js.Object {
  protected def this(options: js.Object) = this()
  /**
    * Callback used internally by widgets to register themselves as managed by this layout.
    * @param composite
    */
  def add(composite: Composite[Widget]): Unit = js.native
  /**
    * Callback used internally by widgets to de-register themselves as managed by this layout.
    * @param composite
    */
  def remove(composite: Composite[Widget]): Unit = js.native
  /**
    * Callback used internally by the framework to process layoutData.
    * @param composite
    */
  def render(composite: Composite[Widget]): Unit = js.native
}

