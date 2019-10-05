package typings.weakDashNapi.weakDashNapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("weak-napi", "get")
@js.native
object get extends js.Object {
  /**
    * Returns the actual reference to the Object that this weak reference was created with. If this is called with a dead reference, undefined is returned.
    * @param ref weak reference object
    */
  def apply[T](ref: WeakRef[T]): js.UndefOr[T] = js.native
}

