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
trait OptionsMenuCallbackObject extends js.Object {
  /**
    * The relevant Menu.
    */
  var menu: js.UndefOr[Menu] = js.undefined
}

object OptionsMenuCallbackObject {
  @scala.inline
  def apply(menu: Menu = null): OptionsMenuCallbackObject = {
    val __obj = js.Dynamic.literal()
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsMenuCallbackObject]
  }
}

