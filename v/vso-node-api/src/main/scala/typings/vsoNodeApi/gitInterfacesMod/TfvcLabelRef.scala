package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcLabelRef extends js.Object {
  var _links: js.Any = js.native
  var description: String = js.native
  var id: Double = js.native
  var labelScope: String = js.native
  var modifiedDate: Date = js.native
  var name: String = js.native
  var owner: IdentityRef = js.native
  var url: String = js.native
}

object TfvcLabelRef {
  @scala.inline
  def apply(
    _links: js.Any,
    description: String,
    id: Double,
    labelScope: String,
    modifiedDate: Date,
    name: String,
    owner: IdentityRef,
    url: String
  ): TfvcLabelRef = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labelScope = labelScope.asInstanceOf[js.Any], modifiedDate = modifiedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcLabelRef]
  }
  @scala.inline
  implicit class TfvcLabelRefOps[Self <: TfvcLabelRef] (val x: Self) extends AnyVal {
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelScope(value: String): Self = this.set("labelScope", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiedDate(value: Date): Self = this.set("modifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: IdentityRef): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

