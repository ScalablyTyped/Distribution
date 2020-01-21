package typings.weak.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("weak", "isDead")
@js.native
object isDead extends js.Object {
  /**
    * Checks to see if ref is a dead reference. Returns true if the original Object has already been GC'd, false otherwise
    * @param ref weak reference object
    */
  def apply(ref: WeakRef[_]): /* is weak.weak.WeakRef<undefined> */ Boolean = js.native
}

