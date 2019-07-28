package typings.vis

import typings.vis.visMod.DataGroupCollectionType
import typings.vis.visMod.DataItemCollectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Groups extends js.Object {
  var groups: js.UndefOr[DataGroupCollectionType] = js.undefined
  var items: js.UndefOr[DataItemCollectionType] = js.undefined
}

object Anon_Groups {
  @scala.inline
  def apply(groups: DataGroupCollectionType = null, items: DataItemCollectionType = null): Anon_Groups = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Groups]
  }
}

