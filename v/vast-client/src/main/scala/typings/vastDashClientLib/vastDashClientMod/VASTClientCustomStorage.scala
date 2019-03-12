package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VASTClientCustomStorage
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any | js.Function0[_]] {
  def getItem(key: java.lang.String): java.lang.String | scala.Null
  def setItem(key: java.lang.String, `val`: java.lang.String): scala.Unit
}

object VASTClientCustomStorage {
  @scala.inline
  def apply(
    getItem: java.lang.String => java.lang.String | scala.Null,
    setItem: (java.lang.String, java.lang.String) => scala.Unit,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any | js.Function0[_]] = null
  ): VASTClientCustomStorage = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), setItem = js.Any.fromFunction2(setItem))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[VASTClientCustomStorage]
  }
}

