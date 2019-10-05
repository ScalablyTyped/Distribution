package typings.weak.weakMod

import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("weak", "removeCallback")
@js.native
object removeCallback extends js.Object {
  /**
    * Removes callback from the Array of callback functions that will be invoked before the Object gets garbage collected.
    * @param ref weak reference object
    * @param callback function to be called
    */
  def apply(ref: WeakRef[_], callback: js.Function0[Unit]): EventEmitter = js.native
}

