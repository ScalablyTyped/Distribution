package typings
package yaysonLib.yaysonMod.yNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var meta: js.UndefOr[js.Object] = js.undefined
}

object JsonOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    meta: js.Object = null
  ): JsonOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    __obj.asInstanceOf[JsonOptions]
  }
}

