package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type of objects whose values are all of the same type.
  * The `in` and `for-in` operators can *not* be safely used,
  * since `Object.prototype` may be modified by outside code.
  */
trait MapLike[T]
  extends /* index */ org.scalablytyped.runtime.StringDictionary[T]

object MapLike {
  @scala.inline
  def apply[T](StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[T] = null): MapLike[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[MapLike[T]]
  }
}

