package typings.writePkg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Remove empty `dependencies`, `devDependencies`, `optionalDependencies` and `peerDependencies` objects.
  		@default true
  		*/
  val normalize: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(normalize: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

