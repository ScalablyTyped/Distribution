package typings.weakNapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("weak-napi", "isWeakRef")
@js.native
object isWeakRef extends js.Object {
  /**
    * Checks to see if obj is "weak reference" instance. Returns true if the passed in object is a "weak reference", false otherwise.
    * @param obj object to check
    */
  def apply(obj: js.Any): /* is weak-napi.weak-napi.WeakRef<any> */ Boolean = js.native
}

