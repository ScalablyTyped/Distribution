package typings.uploadcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Store extends js.Object {
  var store: js.UndefOr[Boolean] = js.undefined
}

object Anon_Store {
  @scala.inline
  def apply(store: js.UndefOr[Boolean] = js.undefined): Anon_Store = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(store)) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Store]
  }
}

