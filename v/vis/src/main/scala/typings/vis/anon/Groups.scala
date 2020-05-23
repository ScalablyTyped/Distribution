package typings.vis.anon

import typings.vis.mod.DataGroupCollectionType
import typings.vis.mod.DataItemCollectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groups extends js.Object {
  var groups: js.UndefOr[DataGroupCollectionType] = js.undefined
  var items: js.UndefOr[DataItemCollectionType] = js.undefined
}

object Groups {
  @scala.inline
  def apply(groups: DataGroupCollectionType = null, items: DataItemCollectionType = null): Groups = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
}

