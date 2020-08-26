package typings.titanium.Titanium.App

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertiesEventMap extends ProxyEventMap {
  var change: PropertiesChangeEvent = js.native
}

object PropertiesEventMap {
  @scala.inline
  def apply(change: PropertiesChangeEvent): PropertiesEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesEventMap]
  }
  @scala.inline
  implicit class PropertiesEventMapOps[Self <: PropertiesEventMap] (val x: Self) extends AnyVal {
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
    def setChange(value: PropertiesChangeEvent): Self = this.set("change", value.asInstanceOf[js.Any])
  }
  
}

