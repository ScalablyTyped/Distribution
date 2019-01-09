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

