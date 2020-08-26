package typings.vastClient.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VASTClientCustomStorage
  extends /* key */ StringDictionary[js.Any | js.Function0[_]] {
  def getItem(key: String): String | Null = js.native
  def setItem(key: String, `val`: String): Unit = js.native
}

object VASTClientCustomStorage {
  @scala.inline
  def apply(getItem: String => String | Null, setItem: (String, String) => Unit): VASTClientCustomStorage = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[VASTClientCustomStorage]
  }
  @scala.inline
  implicit class VASTClientCustomStorageOps[Self <: VASTClientCustomStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetItem(value: String => String | Null): Self = this.set("getItem", js.Any.fromFunction1(value))
    @scala.inline
    def setSetItem(value: (String, String) => Unit): Self = this.set("setItem", js.Any.fromFunction2(value))
  }
  
}

