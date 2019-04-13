package typings
package underscoreLib.underscoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Common interface between Arrays and jQuery objects
trait List[T]
  extends Collection[T]
     with /* index */ org.scalablytyped.runtime.NumberDictionary[T] {
  var length: scala.Double
}

object List {
  @scala.inline
  def apply[T](
    length: scala.Double,
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[T] = null
  ): List[T] = {
    val __obj = js.Dynamic.literal(length = length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[List[T]]
  }
}

