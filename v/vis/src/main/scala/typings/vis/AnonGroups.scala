package typings.vis

import typings.vis.mod.DataGroupCollectionType
import typings.vis.mod.DataItemCollectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroups extends js.Object {
  var groups: js.UndefOr[DataGroupCollectionType] = js.undefined
  var items: js.UndefOr[DataItemCollectionType] = js.undefined
}

object AnonGroups {
  @scala.inline
  def apply(groups: DataGroupCollectionType = null, items: DataItemCollectionType = null): AnonGroups = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroups]
  }
}

