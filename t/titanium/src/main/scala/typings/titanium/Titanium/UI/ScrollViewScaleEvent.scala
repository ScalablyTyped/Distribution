package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the zoom scale factor changes.
  */
@js.native
trait ScrollViewScaleEvent extends ScrollViewBaseEvent {
  /**
    * New scaling factor as a float.
    */
  var scale: Double = js.native
}

object ScrollViewScaleEvent {
  @scala.inline
  def apply(scale: Double, source: ScrollView): ScrollViewScaleEvent = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewScaleEvent]
  }
  @scala.inline
  implicit class ScrollViewScaleEventOps[Self <: ScrollViewScaleEvent] (val x: Self) extends AnyVal {
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
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
  }
  
}

