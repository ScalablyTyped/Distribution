package typings.weakNapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("weak-napi", "callbacks")
@js.native
object callbacks extends js.Object {
  
  /**
    * Returns an Array that ref iterates through to invoke the GC callbacks. This utilizes node's EventEmitter#listeners() function and therefore returns a copy in node 0.10 and newer.
    * @param ref weak reference object
    */
  def apply(ref: WeakRef[_]): js.Array[js.Function0[Unit]] = js.native
}
