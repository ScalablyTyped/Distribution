package typings
package underscoreLib.underscoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancelable extends js.Object {
  def cancel(): scala.Unit
}

object Cancelable {
  @scala.inline
  def apply(cancel: () => scala.Unit): Cancelable = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
  
    __obj.asInstanceOf[Cancelable]
  }
}

