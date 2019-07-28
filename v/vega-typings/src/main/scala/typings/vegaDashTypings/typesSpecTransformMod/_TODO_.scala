package typings.vegaDashTypings.typesSpecTransformMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _TODO_[Type /* <: String */]
  extends /* k */ StringDictionary[js.Any] {
  var `type`: Type
}

object _TODO_ {
  @scala.inline
  def apply[Type /* <: String */](`type`: Type, StringDictionary: /* k */ StringDictionary[js.Any] = null): _TODO_[Type] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[_TODO_[Type]]
  }
}

