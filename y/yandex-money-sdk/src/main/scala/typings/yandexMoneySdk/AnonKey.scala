package typings.yandexMoneySdk

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey
  extends /* key */ StringDictionary[js.Any] {
  var MD: String
  var PaReq: String
}

object AnonKey {
  @scala.inline
  def apply(MD: String, PaReq: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): AnonKey = {
    val __obj = js.Dynamic.literal(MD = MD.asInstanceOf[js.Any], PaReq = PaReq.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonKey]
  }
}

