package typings
package atWebscopeioReactDashTextareaDashAutocompleteLib.atWebscopeioReactDashTextareaDashAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemComponentProps[TItem] extends js.Object {
  var entity: TItem
  var selected: scala.Boolean
}

object ItemComponentProps {
  @scala.inline
  def apply[TItem](entity: TItem, selected: scala.Boolean): ItemComponentProps[TItem] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[ItemComponentProps[TItem]]
  }
}

