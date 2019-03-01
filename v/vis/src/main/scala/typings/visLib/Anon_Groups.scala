package typings
package visLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Groups extends js.Object {
  var groups: js.UndefOr[visLib.visMod.DataGroupCollectionType] = js.undefined
  var items: js.UndefOr[visLib.visMod.DataItemCollectionType] = js.undefined
}

object Anon_Groups {
  @scala.inline
  def apply(
    groups: visLib.visMod.DataGroupCollectionType = null,
    items: visLib.visMod.DataItemCollectionType = null
  ): Anon_Groups = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Groups]
  }
}

