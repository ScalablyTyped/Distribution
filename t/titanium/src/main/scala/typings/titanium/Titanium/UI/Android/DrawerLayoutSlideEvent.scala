package typings.titanium.Titanium.UI.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the drawer view changes it's position.
  */
@js.native
trait DrawerLayoutSlideEvent extends DrawerLayoutBaseEvent {
  /**
    * Contains the drawer frame type. Either `left` or `right`.
    */
  var drawer: String = js.native
  /**
    * The current drawer offset.
    */
  var offset: Double = js.native
}

object DrawerLayoutSlideEvent {
  @scala.inline
  def apply(drawer: String, offset: Double, source: DrawerLayout): DrawerLayoutSlideEvent = {
    val __obj = js.Dynamic.literal(drawer = drawer.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLayoutSlideEvent]
  }
  @scala.inline
  implicit class DrawerLayoutSlideEventOps[Self <: DrawerLayoutSlideEvent] (val x: Self) extends AnyVal {
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
    def setDrawer(value: String): Self = this.set("drawer", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
  }
  
}

