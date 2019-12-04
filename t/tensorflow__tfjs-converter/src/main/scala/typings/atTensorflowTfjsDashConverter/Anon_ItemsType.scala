package typings.atTensorflowTfjsDashConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsType extends js.Object {
  var items: js.UndefOr[scala.Nothing] = js.undefined
  var `type`: String
}

object Anon_ItemsType {
  @scala.inline
  def apply(`type`: String, items: js.UndefOr[scala.Nothing] = js.undefined): Anon_ItemsType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(items)) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ItemsType]
  }
}

