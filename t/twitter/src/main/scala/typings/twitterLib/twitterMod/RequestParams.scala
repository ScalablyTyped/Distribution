package typings
package twitterLib.twitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestParams
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var base: js.UndefOr[java.lang.String] = js.undefined
}

object RequestParams {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    base: java.lang.String = null
  ): RequestParams = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (base != null) __obj.updateDynamic("base")(base)
    __obj.asInstanceOf[RequestParams]
  }
}

