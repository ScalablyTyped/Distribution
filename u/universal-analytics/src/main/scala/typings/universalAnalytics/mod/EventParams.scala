package typings.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventParams
  extends /* key */ StringDictionary[js.Any] {
  var dp: js.UndefOr[String] = js.native
  /**
    * Event Action
    *
    * **Required for event hit type.**
    *
    * Specifies the event action. Must not be empty.
    *
    * Max length: 500 Bytes
    *
    * Example value: `Action`
    */
  var ea: js.UndefOr[String] = js.native
  /**
    * Event Category
    *
    * **Required for event hit type.**
    *
    * Specifies the event category. Must not be empty.
    *
    * Max length: 150 Bytes
    *
    * Example value: `Category`
    */
  var ec: js.UndefOr[String] = js.native
  /**
    * Event Label
    *
    * Specifies the event label.
    *
    * Max length: 500 Bytes
    *
    * Example value: `Label`
    */
  var el: js.UndefOr[String] = js.native
  /**
    * Event Value
    *
    * Specifies the event value. Values must be non-negative.
    *
    * Example value: `55`
    */
  var ev: js.UndefOr[String | Double] = js.native
  var p: js.UndefOr[String] = js.native
}

object EventParams {
  @scala.inline
  def apply(): EventParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventParams]
  }
  @scala.inline
  implicit class EventParamsOps[Self <: EventParams] (val x: Self) extends AnyVal {
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
    def setDp(value: String): Self = this.set("dp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDp: Self = this.set("dp", js.undefined)
    @scala.inline
    def setEa(value: String): Self = this.set("ea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEa: Self = this.set("ea", js.undefined)
    @scala.inline
    def setEc(value: String): Self = this.set("ec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc: Self = this.set("ec", js.undefined)
    @scala.inline
    def setEl(value: String): Self = this.set("el", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEl: Self = this.set("el", js.undefined)
    @scala.inline
    def setEv(value: String | Double): Self = this.set("ev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEv: Self = this.set("ev", js.undefined)
    @scala.inline
    def setP(value: String): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP: Self = this.set("p", js.undefined)
  }
  
}

