package typings
package vscodeLib.vscodeMod

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
  var cancellable: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * The location at which progress should show.
  		 */
  var location: ProgressLocation
  /**
  		 * A human-readable string which will be used to describe the
  		 * operation.
  		 */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ProgressOptions {
  @scala.inline
  def apply(
    location: ProgressLocation,
    cancellable: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): ProgressOptions = {
    val __obj = js.Dynamic.literal(location = location)
    if (!js.isUndefined(cancellable)) __obj.updateDynamic("cancellable")(cancellable)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ProgressOptions]
  }
}

