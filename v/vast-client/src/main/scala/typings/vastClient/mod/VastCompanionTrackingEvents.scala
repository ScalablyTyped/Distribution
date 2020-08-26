package typings.vastClient.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VastCompanionTrackingEvents
  extends /* key */ StringDictionary[js.Array[String]] {
  var creativeView: js.Array[String] = js.native
}

object VastCompanionTrackingEvents {
  @scala.inline
  def apply(creativeView: js.Array[String]): VastCompanionTrackingEvents = {
    val __obj = js.Dynamic.literal(creativeView = creativeView.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCompanionTrackingEvents]
  }
  @scala.inline
  implicit class VastCompanionTrackingEventsOps[Self <: VastCompanionTrackingEvents] (val x: Self) extends AnyVal {
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
    def setCreativeViewVarargs(value: String*): Self = this.set("creativeView", js.Array(value :_*))
    @scala.inline
    def setCreativeView(value: js.Array[String]): Self = this.set("creativeView", value.asInstanceOf[js.Any])
  }
  
}

