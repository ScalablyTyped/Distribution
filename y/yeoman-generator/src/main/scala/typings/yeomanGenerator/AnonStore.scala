package typings.yeomanGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStore extends js.Object {
  /**
    * whether to store the user's previous answer
    */
  var store: js.UndefOr[Boolean] = js.undefined
}

object AnonStore {
  @scala.inline
  def apply(store: js.UndefOr[Boolean] = js.undefined): AnonStore = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(store)) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStore]
  }
}

