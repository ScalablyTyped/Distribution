package typings.web3Core.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestArguments
  extends /* key */ StringDictionary[js.Any] {
  var method: String
  var params: js.UndefOr[js.Any] = js.undefined
}

object RequestArguments {
  @scala.inline
  def apply(
    method: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    params: js.Any = null
  ): RequestArguments = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestArguments]
  }
}

