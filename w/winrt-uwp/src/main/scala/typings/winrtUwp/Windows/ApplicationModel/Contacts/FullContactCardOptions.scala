package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the options for displaying the full contact card. */
trait FullContactCardOptions extends js.Object {
  /** Gets or sets a value that describes the desired view size for the full contact card. */
  var desiredRemainingView: ViewSizePreference
}

object FullContactCardOptions {
  @scala.inline
  def apply(desiredRemainingView: ViewSizePreference): FullContactCardOptions = {
    val __obj = js.Dynamic.literal(desiredRemainingView = desiredRemainingView.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullContactCardOptions]
  }
}

