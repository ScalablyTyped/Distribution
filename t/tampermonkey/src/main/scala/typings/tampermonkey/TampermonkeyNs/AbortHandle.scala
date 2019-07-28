package typings.tampermonkey.TampermonkeyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortHandle[TReturn] extends js.Object {
  def abort(): TReturn
}

object AbortHandle {
  @scala.inline
  def apply[TReturn](abort: () => TReturn): AbortHandle[TReturn] = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
  
    __obj.asInstanceOf[AbortHandle[TReturn]]
  }
}

