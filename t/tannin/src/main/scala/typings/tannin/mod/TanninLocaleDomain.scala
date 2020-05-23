package typings.tannin.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TanninLocaleDomain
  extends /* key */ StringDictionary[TanninDomainMetadata | (js.Tuple2[String, String])] {
  @JSName("")
  var _empty: TanninDomainMetadata | (js.Tuple2[String, String])
}

object TanninLocaleDomain {
  @scala.inline
  def apply(
    _empty: TanninDomainMetadata | (js.Tuple2[String, String]),
    StringDictionary: /* key */ StringDictionary[TanninDomainMetadata | (js.Tuple2[String, String])] = null
  ): TanninLocaleDomain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[TanninLocaleDomain]
  }
}

