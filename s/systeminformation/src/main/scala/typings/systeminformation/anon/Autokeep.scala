package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autokeep extends js.Object {
  var auto_keep: Boolean = js.native
  var error_rate: Boolean = js.native
  var event_count: Boolean = js.native
  var performance: Boolean = js.native
  var prefailure: Boolean = js.native
  var string: java.lang.String = js.native
  var updated_online: Boolean = js.native
  var value: Double = js.native
}

object Autokeep {
  @scala.inline
  def apply(
    auto_keep: Boolean,
    error_rate: Boolean,
    event_count: Boolean,
    performance: Boolean,
    prefailure: Boolean,
    string: java.lang.String,
    updated_online: Boolean,
    value: Double
  ): Autokeep = {
    val __obj = js.Dynamic.literal(auto_keep = auto_keep.asInstanceOf[js.Any], error_rate = error_rate.asInstanceOf[js.Any], event_count = event_count.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], prefailure = prefailure.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], updated_online = updated_online.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autokeep]
  }
  @scala.inline
  implicit class AutokeepOps[Self <: Autokeep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuto_keep(value: Boolean): Self = this.set("auto_keep", value.asInstanceOf[js.Any])
    @scala.inline
    def setError_rate(value: Boolean): Self = this.set("error_rate", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent_count(value: Boolean): Self = this.set("event_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefailure(value: Boolean): Self = this.set("prefailure", value.asInstanceOf[js.Any])
    @scala.inline
    def setString(value: java.lang.String): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_online(value: Boolean): Self = this.set("updated_online", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

