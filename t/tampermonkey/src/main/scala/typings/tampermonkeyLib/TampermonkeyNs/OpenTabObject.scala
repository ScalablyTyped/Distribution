package typings
package tampermonkeyLib.TampermonkeyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenTabObject extends js.Object {
  var closed: scala.Boolean
  /** Set closed listener */
  var onclosed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** Closes tab */
  def close(): scala.Unit
}

object OpenTabObject {
  @scala.inline
  def apply(close: () => scala.Unit, closed: scala.Boolean, onclosed: () => scala.Unit = null): OpenTabObject = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), closed = closed)
    if (onclosed != null) __obj.updateDynamic("onclosed")(js.Any.fromFunction0(onclosed))
    __obj.asInstanceOf[OpenTabObject]
  }
}

