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
    getItem: js.Function1[java.lang.String, java.lang.String | scala.Null],
    setItem: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any | js.Function0[_]] = null
  ): VASTClientCustomStorage = {
    val __obj = js.Dynamic.literal(getItem = getItem, setItem = setItem)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[VASTClientCustomStorage]
  }
}

