package typings.twitter.twitterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestParams
  extends /* key */ StringDictionary[js.Any] {
  var base: js.UndefOr[String] = js.undefined
}

object RequestParams {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, base: String = null): RequestParams = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (base != null) __obj.updateDynamic("base")(base)
    __obj.asInstanceOf[RequestParams]
  }
}

