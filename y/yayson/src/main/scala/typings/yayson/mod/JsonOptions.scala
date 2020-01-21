package typings.yayson.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonOptions
  extends /* key */ StringDictionary[js.Any] {
  var meta: js.UndefOr[js.Object] = js.undefined
}

object JsonOptions {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, meta: js.Object = null): JsonOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonOptions]
  }
}

