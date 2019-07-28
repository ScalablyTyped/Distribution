package typings.yandexDashMoneyDashSdk

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ StringDictionary[js.Any] {
  var MD: String
  var PaReq: String
}

object Anon_Key {
  @scala.inline
  def apply(MD: String, PaReq: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): Anon_Key = {
    val __obj = js.Dynamic.literal(MD = MD, PaReq = PaReq)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Key]
  }
}

