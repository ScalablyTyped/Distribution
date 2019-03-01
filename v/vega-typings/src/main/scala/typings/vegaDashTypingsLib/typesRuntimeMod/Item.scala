package typings
package vegaDashTypingsLib.typesRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item[T] extends js.Object {
  /**
    * The underlying data element to which this item corresponds.
    */
  var datum: T
  /**
    * The mark to which this item belongs.
    */
  var mark: RuntimeMark
}

object Item {
  @scala.inline
  def apply[T](datum: T, mark: RuntimeMark): Item[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    __obj.updateDynamic("mark")(mark.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item[T]]
  }
}

