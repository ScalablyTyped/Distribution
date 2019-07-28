package typings.yeomanDashTest.yeomanDashTestMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Env extends EventEmitter {
  var queues: js.Array[String] = js.native
  def enforceUpdate(env: Env): this.type = js.native
}

