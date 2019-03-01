package typings
package yaysonLib.yaysonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YaysonOptions extends js.Object {
  var adapter: js.UndefOr[yaysonLib.yaysonLibStrings.default | yaysonLib.yaysonLibStrings.sequelize] = js.undefined
}

object YaysonOptions {
  @scala.inline
  def apply(adapter: yaysonLib.yaysonLibStrings.default | yaysonLib.yaysonLibStrings.sequelize = null): YaysonOptions = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(adapter.asInstanceOf[js.Any])
    __obj.asInstanceOf[YaysonOptions]
  }
}

