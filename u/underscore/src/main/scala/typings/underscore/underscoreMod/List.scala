package typings.underscore.underscoreMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Common interface between Arrays and jQuery objects
trait List[T]
  extends Collection[T]
     with /* index */ NumberDictionary[T] {
  var length: Double
}

object List {
  @scala.inline
  def apply[T](length: Double, NumberDictionary: /* index */ NumberDictionary[T] = null): List[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[List[T]]
  }
}

