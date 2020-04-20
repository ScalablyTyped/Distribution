package typings.vscode.mod

import typings.vscode.AnonViewId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressOptions extends js.Object {
  /**
  		 * Controls if a cancel button should show to allow the user to
  		 * cancel the long running operation.  Note that currently only
  		 * `ProgressLocation.Notification` is supporting to show a cancel
  		 * button.
  		 */
  var cancellable: js.UndefOr[Boolean] = js.undefined
  /**
  		 * The location at which progress should show.
  		 */
  var location: ProgressLocation | AnonViewId
  /**
  		 * A human-readable string which will be used to describe the
  		 * operation.
  		 */
  var title: js.UndefOr[String] = js.undefined
}

object ProgressOptions {
  @scala.inline
  def apply(
    location: ProgressLocation | AnonViewId,
    cancellable: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): ProgressOptions = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    if (!js.isUndefined(cancellable)) __obj.updateDynamic("cancellable")(cancellable.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressOptions]
  }
}

