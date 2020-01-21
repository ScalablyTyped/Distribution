package typings.underscore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictionary[T]
  extends Collection[T]
     with /* index */ StringDictionary[T]

object Dictionary {
  @scala.inline
  def apply[T](StringDictionary: /* index */ StringDictionary[T] = null): Dictionary[T] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictionary[T]]
  }
}

