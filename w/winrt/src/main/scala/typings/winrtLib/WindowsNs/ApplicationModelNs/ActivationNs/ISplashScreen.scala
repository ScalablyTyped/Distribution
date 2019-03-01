package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISplashScreen extends js.Object {
  var imageLocation: winrtLib.WindowsNs.FoundationNs.Rect
  var ondismissed: js.Any
}

object ISplashScreen {
  @scala.inline
  def apply(imageLocation: winrtLib.WindowsNs.FoundationNs.Rect, ondismissed: js.Any): ISplashScreen = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("imageLocation")(imageLocation)
    __obj.updateDynamic("ondismissed")(ondismissed)
    __obj.asInstanceOf[ISplashScreen]
  }
}

