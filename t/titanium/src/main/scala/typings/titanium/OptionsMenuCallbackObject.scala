package typings.titanium

import typings.titanium.Titanium.Android.Menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object passed to the <Titanium.Android.Activity> callbacks for
  * onPrepareOptionsMenu and onCreateOptionsMenu.
  * Additional properties may be set on the Object.
  */
@js.native
trait OptionsMenuCallbackObject extends js.Object {
  /**
    * The relevant Menu.
    */
  var menu: js.UndefOr[Menu] = js.native
}

object OptionsMenuCallbackObject {
  @scala.inline
  def apply(): OptionsMenuCallbackObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsMenuCallbackObject]
  }
  @scala.inline
  implicit class OptionsMenuCallbackObjectOps[Self <: OptionsMenuCallbackObject] (val x: Self) extends AnyVal {
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
    def setMenu(value: Menu): Self = this.set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
  }
  
}

