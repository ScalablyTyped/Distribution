package typings.uploadcare.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store extends js.Object {
  var store: js.UndefOr[Boolean] = js.undefined
}

object Store {
  @scala.inline
  def apply(store: js.UndefOr[Boolean] = js.undefined): Store = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(store)) __obj.updateDynamic("store")(store.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Store]
  }
}

