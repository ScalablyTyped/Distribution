package typings
package wouterLib.wouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait History extends js.Object {
  var push: PushCallback
  def path(): Path
  def subscribe(cb: PushCallback): js.Function0[scala.Unit]
}

object History {
  @scala.inline
  def apply(path: () => Path, push: PushCallback, subscribe: PushCallback => js.Function0[scala.Unit]): History = {
    val __obj = js.Dynamic.literal(path = js.Any.fromFunction0(path), push = push, subscribe = js.Any.fromFunction1(subscribe))
  
    __obj.asInstanceOf[History]
  }
}

