package typings.themeDashUi.themeDashUiMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object[T] extends /* k */ StringDictionary[T | Object[T]]

object Object {
  @scala.inline
  def apply[T](StringDictionary: /* k */ StringDictionary[T | Object[T]] = null): Object[T] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Object[T]]
  }
}

