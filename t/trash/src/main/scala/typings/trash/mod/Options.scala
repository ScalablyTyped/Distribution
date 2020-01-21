package typings.trash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Enable globbing when matching file paths.
  		@default true
  		*/
  val glob: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(glob: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(glob)) __obj.updateDynamic("glob")(glob.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

