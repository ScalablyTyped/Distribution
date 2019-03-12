package typings
package throttleDashDebounceLib.throttleDashDebounceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancel extends js.Object {
  def cancel(): scala.Unit
}

object Cancel {
  @scala.inline
  def apply(cancel: () => scala.Unit): Cancel = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
  
    __obj.asInstanceOf[Cancel]
  }
}

