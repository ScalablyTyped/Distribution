package typings.tampermonkey.Tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenTabObject extends js.Object {
  var closed: Boolean
  /** Set closed listener */
  var onclosed: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Closes tab */
  def close(): Unit
}

object OpenTabObject {
  @scala.inline
  def apply(close: () => Unit, closed: Boolean, onclosed: () => Unit = null): OpenTabObject = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), closed = closed.asInstanceOf[js.Any])
    if (onclosed != null) __obj.updateDynamic("onclosed")(js.Any.fromFunction0(onclosed))
    __obj.asInstanceOf[OpenTabObject]
  }
}

