package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressOptions extends js.Object {
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
  def apply(location: ProgressLocation, title: java.lang.String = null): ProgressOptions = {
    val __obj = js.Dynamic.literal(location = location)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ProgressOptions]
  }
}

