package typings.waterline.waterlineMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends /* index */ StringDictionary[Attribute] {
  var toJSON: js.UndefOr[js.Function0[String]] = js.undefined
  var toObject: js.UndefOr[js.Function0[_]] = js.undefined
}

object Attributes {
  @scala.inline
  def apply(
    StringDictionary: /* index */ StringDictionary[Attribute] = null,
    toJSON: () => String = null,
    toObject: () => _ = null
  ): Attributes = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (toJSON != null) __obj.updateDynamic("toJSON")(js.Any.fromFunction0(toJSON))
    if (toObject != null) __obj.updateDynamic("toObject")(js.Any.fromFunction0(toObject))
    __obj.asInstanceOf[Attributes]
  }
}

