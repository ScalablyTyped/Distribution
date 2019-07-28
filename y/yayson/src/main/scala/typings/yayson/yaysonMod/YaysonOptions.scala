package typings.yayson.yaysonMod

import typings.yayson.yaysonStrings.default
import typings.yayson.yaysonStrings.sequelize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YaysonOptions extends js.Object {
  var adapter: js.UndefOr[default | sequelize] = js.undefined
}

object YaysonOptions {
  @scala.inline
  def apply(adapter: default | sequelize = null): YaysonOptions = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(adapter.asInstanceOf[js.Any])
    __obj.asInstanceOf[YaysonOptions]
  }
}

