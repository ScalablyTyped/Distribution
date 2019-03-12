package typings
package waterlineLib.waterlineMod.WaterlineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes
  extends /* index */ org.scalablytyped.runtime.StringDictionary[Attribute] {
  var toJSON: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var toObject: js.UndefOr[js.Function0[_]] = js.undefined
}

object Attributes {
  @scala.inline
  def apply(
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[Attribute] = null,
    toJSON: () => java.lang.String = null,
    toObject: () => _ = null
  ): Attributes = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (toJSON != null) __obj.updateDynamic("toJSON")(js.Any.fromFunction0(toJSON))
    if (toObject != null) __obj.updateDynamic("toObject")(js.Any.fromFunction0(toObject))
    __obj.asInstanceOf[Attributes]
  }
}

