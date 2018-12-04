package typings
package yeomanDashTestLib.yeomanDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Env
  extends nodeLib.eventsMod.EventEmitter {
  var queues: js.Array[java.lang.String] = js.native
  def enforceUpdate(env: Env): this.type = js.native
}

