package typings
package uploadcareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Store extends js.Object {
  var store: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Store {
  @scala.inline
  def apply(store: js.UndefOr[scala.Boolean] = js.undefined): Anon_Store = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(store)) __obj.updateDynamic("store")(store)
    __obj.asInstanceOf[Anon_Store]
  }
}

