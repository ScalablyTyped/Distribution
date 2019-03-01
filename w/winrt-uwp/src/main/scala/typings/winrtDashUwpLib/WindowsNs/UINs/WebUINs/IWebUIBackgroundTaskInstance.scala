package typings
package winrtDashUwpLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to an instance of a background task. */
trait IWebUIBackgroundTaskInstance extends js.Object {
  /** Gets or sets the success value for the background task. The success value is what is returned to the foreground instance of your app in the completed event. */
  var succeeded: scala.Boolean
}

object IWebUIBackgroundTaskInstance {
  @scala.inline
  def apply(succeeded: scala.Boolean): IWebUIBackgroundTaskInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("succeeded")(succeeded)
    __obj.asInstanceOf[IWebUIBackgroundTaskInstance]
  }
}

