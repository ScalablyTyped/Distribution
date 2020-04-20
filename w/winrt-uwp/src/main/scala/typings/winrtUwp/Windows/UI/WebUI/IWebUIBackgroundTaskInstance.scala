package typings.winrtUwp.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to an instance of a background task. */
trait IWebUIBackgroundTaskInstance extends js.Object {
  /** Gets or sets the success value for the background task. The success value is what is returned to the foreground instance of your app in the completed event. */
  var succeeded: Boolean
}

object IWebUIBackgroundTaskInstance {
  @scala.inline
  def apply(succeeded: Boolean): IWebUIBackgroundTaskInstance = {
    val __obj = js.Dynamic.literal(succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebUIBackgroundTaskInstance]
  }
}

