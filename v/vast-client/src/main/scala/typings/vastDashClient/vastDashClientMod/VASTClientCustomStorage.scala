package typings.vastDashClient.vastDashClientMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VASTClientCustomStorage
  extends /* key */ StringDictionary[js.Any | js.Function0[_]] {
  def getItem(key: String): String | Null
  def setItem(key: String, `val`: String): Unit
}

object VASTClientCustomStorage {
  @scala.inline
  def apply(
    getItem: String => String | Null,
    setItem: (String, String) => Unit,
    StringDictionary: /* key */ StringDictionary[js.Any | js.Function0[_]] = null
  ): VASTClientCustomStorage = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), setItem = js.Any.fromFunction2(setItem))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[VASTClientCustomStorage]
  }
}

