package typings.atWebscopeioReactDashTextareaDashAutocomplete.atWebscopeioReactDashTextareaDashAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemComponentProps[TItem] extends js.Object {
  var entity: TItem
  var selected: Boolean
}

object ItemComponentProps {
  @scala.inline
  def apply[TItem](entity: TItem, selected: Boolean): ItemComponentProps[TItem] = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ItemComponentProps[TItem]]
  }
}

