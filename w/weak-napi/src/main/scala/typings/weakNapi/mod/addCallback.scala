package typings.weakNapi.mod

import typings.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("weak-napi", "addCallback")
@js.native
object addCallback extends js.Object {
  /**
    * Adds callback to the Array of callback functions that will be invoked before the Object gets garbage collected. The callbacks get executed in the order that they are added.
    * @param ref weak reference object
    * @param callback function to be called
    */
  def apply(ref: WeakRef[_], callback: js.Function0[Unit]): EventEmitter = js.native
}

