package typings.vsoNodeApi.tfvcInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcLabel extends TfvcLabelRef {
  var items: js.Array[TfvcItem] = js.native
}

object TfvcLabel {
  @scala.inline
  def apply(
    _links: js.Any,
    description: String,
    id: Double,
    items: js.Array[TfvcItem],
    labelScope: String,
    modifiedDate: Date,
    name: String,
    owner: IdentityRef,
    url: String
  ): TfvcLabel = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], labelScope = labelScope.asInstanceOf[js.Any], modifiedDate = modifiedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcLabel]
  }
  @scala.inline
  implicit class TfvcLabelOps[Self <: TfvcLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItemsVarargs(value: TfvcItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[TfvcItem]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
  
}

